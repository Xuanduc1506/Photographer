/*
 * Copyright(C)2021, FPT University
 * Lab Java Web
 * 
 * Record of change
 * DATE             VERSION             AUTHOR              DESCRIPTION
 * 2021-06-23         1.0               Ducnxhe141626       First Implement
 */
package dao;

import entity.Introduction;

/**
 * This interface contain some method use to implements in another class
 *
 * @author Xuan Duc
 */
public interface IntroductionDAO {
    /**
     * This method used to get an introduction from Introduction Table
     *
     * @return introduction is a <code>Introduction</code> object
     * @throws Exception
     */ 
    public Introduction getIntroduction() throws Exception;   
    
}
