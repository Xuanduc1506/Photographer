/*
 * Copyright(C)2021, FPT University
 * Lab Java Web
 * 
 * Record of change
 * DATE             VERSION             AUTHOR              DESCRIPTION
 * 2021-06-23         1.0               Ducnxhe141626       First Implement
 */
package dao;

import entity.SocialNetwork;
import java.util.ArrayList;

/**
 * This interface contain some method used to implements in another class
 *
 * @author Xuan Duc
 */
public interface SocialNetworkDAO {
    
    /**
     * This method use to get all data of social network from SocialNetwork table
     *
     * @return socialNetworks is a <code>java.util.ArrayList<></code> object
     * @throws Exception
     */
    public ArrayList<SocialNetwork> getSocialNetwork() throws Exception;
}
