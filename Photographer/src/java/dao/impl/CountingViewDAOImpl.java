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
import dao.CountingViewDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class use to get data from View table
 * 
 * @author Admin
 */
public class CountingViewDAOImpl extends DBContext implements CountingViewDAO {
    
    /**
     * This method use to get number of view from View Table
     * 
     * @return count is an <code>int</code>
     * @throws Exception 
     */
    @Override
    public int countView() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;
        String sql = "SELECT * FROM [View]";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt("view");
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
     * This method use to update number of view from View Table
     * 
     * @param view is an <code>int</code>
     * @throws Exception 
     */
    @Override
    public void updateView(int view) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "UPDATE [dbo].[View]\n"
                + "   SET [View] = ?";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, view+1);
            ps.execute();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
    }

}
