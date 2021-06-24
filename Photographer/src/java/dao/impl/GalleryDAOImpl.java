/*
 * Copyright(C)2021, FPT University
 * Lab Java Web
 * 
 * Record of change
 * DATE             VERSION             AUTHOR              DESCRIPTION
 * 2021-06-23         1.0               Ducnxhe141626       First Implement
 */
package dao.impl;

import context.DBContext;
import dao.GalleryDAO;
import entity.Gallery;
import entity.ImagesOfGallery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * This class use to get data from Gallery table and ImagesOfGallery table
 * 
 * @author Xuan Duc
 */
public class GalleryDAOImpl extends DBContext implements GalleryDAO {

    /**
     * This method use to get all galleries form Gallery table
     *
     * @param pageIndex is an <code>int</code>
     * @param pageSize is an <code>int</code>
     * @return questions is a <code>java.util.ArrayList<></code> object
     * @throws Exception
     */
    @Override
    public ArrayList<Gallery> getGalleries(int pageIndex, int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM (SELECT ROW_NUMBER() OVER (ORDER BY id ASC) as rid,* \n"
                + "                                   FROM Gallery  ) tbl \n"
                + "                                    WHERE rid >= (? - 1)*? + 1\n"
                + "                                    AND rid <= ? * ?";
        ArrayList<Gallery> galleries = new ArrayList<>();
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageIndex);
            rs = ps.executeQuery();
            while (rs.next()) {
                Gallery gallery = new Gallery();
                gallery.setId(rs.getInt("id"));
                gallery.setName(rs.getString("name"));
                gallery.setImage(rs.getString("image"));
                gallery.setDescription(rs.getString("description"));
                galleries.add(gallery);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return galleries;
    }

    /**
     * This method use to get number of galleries form Gallery table
     *
     * @return count is an <code>int</code>
     * @throws Exception
     */
    @Override
    public int count() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT COUNT(*) FROM Gallery";
        int count = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return count;
    }

    /**
     * This method use to get all pictures of the gallery by id form Gallery table
     *
     * @param id is an <code>int</code>
     * @param pageIndex is an <code>int</code>
     * @param pageSize is an <code>int</code>
     * @return questions is a <code>java.util.ArrayList<></code> object
     * @throws Exception
     */
    @Override
    public Gallery getGallery(int id, int pageIndex, int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM (SELECT ROW_NUMBER() OVER (ORDER BY id ASC) as rid,* \n"
                + "FROM (SELECT * FROM Gallery g INNER JOIN ImagesOfGallery i on g.id=i.id_gallery\n"
                + "WHERE g.id=?)tbl_a) tbl_b \n"
                + "WHERE rid >= (? - 1)*? + 1\n"
                + "AND rid <= ? *? ";
        Gallery gallery = new Gallery();
        gallery.setId(-1);
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, pageIndex);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageSize);
            ps.setInt(5, pageIndex);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (gallery.getId() != rs.getInt("id")) {
                    gallery.setId(id);
                    gallery.setName(rs.getString("name"));
                    gallery.setDescription(rs.getString("description"));
                }
                ImagesOfGallery imagesOfGallery = new ImagesOfGallery();
                imagesOfGallery.setId(rs.getShort("id_image"));
                imagesOfGallery.setUrl(rs.getString("url"));
                gallery.getImages().add(imagesOfGallery);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return gallery;
    }

    /**
     * This method use to get number of pictures from ImagesOfGallery table
     *
     * @param id is an <code>int</code>
     * @return count is an <code>int</code>
     * @throws Exception
     */
    @Override
    public int countImage(int id) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count=0;
        String sql = "SELECT COUNT(*) FROM ImagesOfGallery WHERE id_gallery=?";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return count;
    }

}
