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
import dao.IntroductionDAO;
import entity.Introduction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class use to get data from introduction table
 * 
 * @author Xuan Duc
 */
public class IntroductionDAOImpl extends DBContext implements IntroductionDAO{

    /**
     * This method used to get an introduction from Introduction Table
     *
     * @return introduction is a <code>Introduction</code> object
     * @throws Exception
     */ 
    @Override
    public Introduction getIntroduction() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Introduction introduction = new Introduction();
        String sql = "SELECT * FROM Introduction";
        try {
            
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                introduction.setName(rs.getString(1));
                introduction.setAddress(rs.getString(3));
                introduction.setCity(rs.getString(4));
                introduction.setCountry(rs.getString(5));
                introduction.setDescription(rs.getString(9));
                introduction.setEmail(rs.getString(7));
                introduction.setImage(rs.getString(2));
                introduction.setMap(rs.getString(6));
                introduction.setTel(rs.getString(8));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return introduction;
    }
    
}
