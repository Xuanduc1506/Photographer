/*
 * Copyright(C)2021, FPT University
 * Lab Java Web
 * 
 * Record of change
 * DATE             VERSION             AUTHOR              DESCRIPTION
 * 2021-06-23         1.0               Ducnxhe141626       First Implement
 */
package entity;

import java.util.ArrayList;

/**
 * This class used to contain attribute and method getter, setter of Gallery
 *
 * @author Xuan Duc
 */
public class Gallery {

    //Create attribute
    private int id;
    private String name;
    private String image;
    private String description;
    private ArrayList<ImagesOfGallery> images = new ArrayList<>();

    /**
     * This method used to get image
     *
     * @return image is a<code>String</code>
     */
    public String getImage() {
        return image;
    }

    /**
     * This method used to set image
     *
     * @param image is a<code>String</code>
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * This method used to get id
     *
     * @return id is an<code>int</code>
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
     * This method used to get name
     *
     * @return name is a<code>String</code>
     */
    public String getName() {
        return name;
    }

    /**
     * This method used to set name
     *
     * @param name is a<code>String</code>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method used to get description
     *
     * @return description is a<code>String</code>
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method used to set description
     *
     * @param description is a<code>String</code>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method used to get images
     *
     * @return images is a <code>java.util.ArrayList<></code> object
     */
    public ArrayList<ImagesOfGallery> getImages() {
        return images;
    }

    /**
     * This method used to set images
     *
     * @param images is a <code>java.util.ArrayList<></code>
     */
    public void setImages(ArrayList<ImagesOfGallery> images) {
        this.images = images;
    }

}
