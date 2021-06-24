/*
 * Copyright(C)2021, FPT University
 * Lab Java Web
 * 
 * Record of change
 * DATE             VERSION             AUTHOR              DESCRIPTION
 * 2021-06-23         1.0               Ducnxhe141626       First Implement
 */
package dao;

import entity.Gallery;
import java.util.ArrayList;

/**
 * This interface contain some method use to implements in another class
 *
 * @author Xuan Duc
 */
public interface GalleryDAO {
    /**
     * This method use to get all galleries form Gallery table
     *
     * @param pageIndex is an <code>int</code>
     * @param pageSize is an <code>int</code>
     * @return questions is a <code>java.util.ArrayList<></code> object
     * @throws Exception
     */
    public ArrayList<Gallery> getGalleries(int pageSize,int pageIndex) throws Exception;
    
    /**
     * This method use to get number of galleries form Gallery table
     *
     * @return count is an <code>int</code>
     * @throws Exception
     */
    public int count() throws Exception;
    
    /**
     * This method use to get all pictures of the gallery by id form Gallery table
     *
     * @param id is an <code>int</code>
     * @param pageIndex is an <code>int</code>
     * @param pageSize is an <code>int</code>
     * @return questions is a <code>java.util.ArrayList<></code> object
     * @throws Exception
     */
    public Gallery getGallery(int id,int pageIndex, int pageSize) throws Exception;
    
    /**
     * This method use to get number of pictures form ImagesOfGallery table
     *
     * @param id is an <code>int</code>
     * @return count is an <code>int</code>
     * @throws Exception
     */
    public int countImage(int id) throws Exception;
}
