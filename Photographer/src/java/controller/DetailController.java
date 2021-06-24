/*
 * Copyright(C)2021, FPT University
 * Lab Java Web
 * 
 * Record of change
 * DATE             VERSION             AUTHOR              DESCRIPTION
 * 2021-06-23          1.0               Ducnxhe141626       First Implement
 */
package controller;

import dao.GalleryDAO;
import dao.SocialNetworkDAO;
import dao.impl.GalleryDAOImpl;
import dao.impl.SocialNetworkDAOImpl;
import entity.Gallery;
import entity.SocialNetwork;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class uses to display and paginate all pictures of the gallery that it's a <code>Gallery</code> object 
 * then forward to Detail.jsp
 * 
 * @author Xuan Duc
 */
public class DetailController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     * This method use GalleryDAO to get data of all picture that gallery had
     * -Used IntroductionDAO to get data of image, name and description
     * -Used SocialNetworkDAO to get data of name and image of social network
     * -Then forward all attribute of request to Detail.jsp
     * 
     * @param request the <code>HttpServletRequest</code> object
     * @param response the <code>HttpServletResponse</code> object
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        GalleryDAO galleryDAO = new GalleryDAOImpl();
        SocialNetworkDAO socialNetworkDAO = new SocialNetworkDAOImpl();
        try {
            int id=Integer.parseInt(request.getParameter("id"));
            int headerIndex=Integer.parseInt(request.getParameter("headerIndex"));
            ArrayList<SocialNetwork> socialNetworks = socialNetworkDAO.getSocialNetwork();
            ArrayList<Gallery> galleries = galleryDAO.getGalleries(headerIndex, 3);
            request.setAttribute("socialNetworks", socialNetworks);
            request.setAttribute("galleries", galleries);
            //paaging
            String preIndex = request.getParameter("page");
            if (preIndex == null) {
                preIndex = "1";
            }
            int pageIndex = Integer.parseInt(preIndex);
            int numRecords = galleryDAO.countImage(id);
            int totalPage = (numRecords % 4 == 0)
                    ? numRecords / 4
                    : (numRecords / 4) + 1;
            //Get gallery
            Gallery gallery = galleryDAO.getGallery(id, pageIndex, 4);
            request.setAttribute("pageIndex", headerIndex);
            request.setAttribute("totalpage", totalPage);
            request.setAttribute("gallery", gallery);
            request.getRequestDispatcher("Detail.jsp").forward(request, response);
        } catch (Exception e) {
            ArrayList<Gallery> galleries = galleryDAO.getGalleries(1, 3);
            request.setAttribute("galleries", galleries);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            
            request.setAttribute("message", ex.getMessage());
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            
            request.setAttribute("message", ex.getMessage());
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }
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
