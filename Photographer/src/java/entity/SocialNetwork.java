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
 * This class used to contain attribute and method getter, setter of SocialNetwork
 *
 * @author Xuan Duc
 */
public class SocialNetwork {
    
    //Create attribute
    private String name;
    private String url;

    /**
     * This method used to get name
     *
     * @return name is a <code>String</code>
     */
    public String getName() {
        return name;
    }

    /**
     * This method used to set name
     *
     * @param name is a <code>String</code>
     */
    public void setName(String name) {
        this.name = name;
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
     * @param url is a <code>String</code>
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
