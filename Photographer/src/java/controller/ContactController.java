/*
 * Copyright(C)2021, FPT University
 * Lab Java Web
 * 
 * Record of change
 * DATE             VERSION             AUTHOR              DESCRIPTION
 * 2021-06-232021-05-16         1.0               Ducnxhe141626       First Implement
 */
package controller;

import dao.GalleryDAO;
import dao.IntroductionDAO;
import dao.SocialNetworkDAO;
import dao.impl.GalleryDAOImpl;
import dao.impl.IntroductionDAOImpl;
import dao.impl.SocialNetworkDAOImpl;
import entity.Gallery;
import entity.Introduction;
import entity.SocialNetwork;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class use to display information of introduction that it's an<code>Introdution</code> object 
 * then forward to Contact.jsp.
 * 
 * @author Xuan Duc
 */
public class ContactController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     * 
     * This method use to Introduce the pictures from gallery. Information of the photographer.
     * -Set attribute message to the Error Page.
     * -Use GalleryDAO to get data of some galleries
     * -Use SocialNetworkDAO to get data of name and image of social network
     * -Use InformationDAO to get data of Phone, email,address of photographer 
     * -Then forward all attribute of request to Contact.jsp
     * 
     * @param request the <code>HttpServletRequest</code> object
     * @param response the <code>HttpServletResponse</code> object
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            IntroductionDAO introductionDAO = new IntroductionDAOImpl();
            GalleryDAO galleryDAO = new GalleryDAOImpl();
            SocialNetworkDAO socialNetworkDAO = new SocialNetworkDAOImpl();
            int headerIndex=Integer.parseInt(request.getParameter("headerIndex"));
            
            ArrayList<Gallery> galleries = galleryDAO.getGalleries(headerIndex, 3);
            ArrayList<SocialNetwork> socialNetworks = socialNetworkDAO.getSocialNetwork();
            Introduction introduction = introductionDAO.getIntroduction();
            
            request.setAttribute("socialNetworks", socialNetworks);
            request.setAttribute("introduction", introduction);
            request.setAttribute("galleries", galleries);
            request.setAttribute("pageIndex", headerIndex);
            request.getRequestDispatcher("Contact.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("message", e.getMessage());
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
