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
import dao.SocialNetworkDAO;
import entity.SocialNetwork;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * This class use to get data from SocialNetwork table
 * 
 * @author Xuan Duc
 */
public class SocialNetworkDAOImpl extends DBContext implements SocialNetworkDAO {

    /**
     * This method use to get all data of social network from SocialNetwork table
     *
     * @return socialNetworks is a <code>java.util.ArrayList<></code> object
     * @throws Exception
     */
    @Override
    public ArrayList<SocialNetwork> getSocialNetwork() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT *FROM SocialNetwork";
        ArrayList<SocialNetwork> socialNetworks = new ArrayList<>();
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SocialNetwork socialNetwork = new SocialNetwork();
                socialNetwork.setName(rs.getString("name"));
                socialNetwork.setUrl(rs.getString("url"));
                socialNetworks.add(socialNetwork);
            } 
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return socialNetworks;
    }

}
