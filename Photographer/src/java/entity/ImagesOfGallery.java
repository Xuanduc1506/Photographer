/*
 * Copyright(C)2021, FPT University
 * Lab Java Web
 * 
 * Record of change
 * DATE             VERSION             AUTHOR              DESCRIPTION
 * 2021-06-23         1.0               Ducnxhe141626       First Implement
 */
package entity;

/**
 * This class used to contain attribute and method getter, setter of ImagesOfGallery
 *
 * @author Xuan Duc
 */
public class ImagesOfGallery {
    
    //Create attribute
    private int id;
    private String url;
    private int id_gallery;

    /**
     * This method used to get id
     *
     * @return id is an <code>int</code>
     */
    public int getId() {
        return id;
    }

    /**
     * This method used to set id
     *
     * @param id is an<code>int</code>
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This method used to get url
     *
     * @return url is a <code>String</code>
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method used to set url
     *
     * @param url is a<code>String</code>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method used to get id_gallery
     *
     * @return id_gallery is an <code>int</code>
     */
    public int getId_gallery() {
        return id_gallery;
    }

    /**
     * This method used to set id_gallery
     *
     * @param id_gallery is an<code>int</code>
     */
    public void setId_gallery(int id_gallery) {
        this.id_gallery = id_gallery;
    }
    
    
}
