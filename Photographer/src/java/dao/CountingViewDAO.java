/*
 * Copyright(C)2021, FPT University
 * Lab Java Web
 * 
 * Record of change
 * DATE             VERSION             AUTHOR              DESCRIPTION
 * 2021-06-23         1.0               Ducnxhe141626       First Implement
 */
package dao;

/**
 * This interface contain some method used to implements in another class
 *
 * @author Xuan Duc
 */
public interface CountingViewDAO {
    /**
     * This method use to get number of view from View Table
     * 
     * @return count is an <code>int</code>
     * @throws Exception 
     */
    public int countView() throws Exception;
    
    /**
     * This method use to update number of view from View Table
     * 
     * @param view is an <code>int</code>
     * @throws Exception 
     */
    public void updateView(int view) throws Exception;
}
