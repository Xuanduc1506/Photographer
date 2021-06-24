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
 * This class uses <code>IntroductionDAO</code> to get data of introduction that it's an <code>Introduction</code> object
 * and uses <code>GalleryDAO</code>,pageIndex,totalPage to get some galleries that it's a <code>java.util.ArrayList<></code> object 
 * then forward to Home.jsp .
 *
 * Author Xuan Duc
 */
public class HomeController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. 
     * This method use to set attribute message to the Error Page.
     * -Uses <code>IntroductionDAO</code> to get data of image, name and description
     * -Uses <code>GalleryDAO</code> to get data of some galleries
     * -Uses <code>SocialNetworkDAO</code> to get data of name and image of social network
     * -Then forward all attribute of request to Home.jsp
     *
     * @param request the <code>HttpServletRequest</code> object
     * @param response the <code>HttpServletResponse</code> object
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        IntroductionDAO introductionDAO = new IntroductionDAOImpl();
        GalleryDAO galleryDAO = new GalleryDAOImpl();
        SocialNetworkDAO socialNetworkDAO = new SocialNetworkDAOImpl();
        try {
            ArrayList<SocialNetwork> socialNetworks = socialNetworkDAO.getSocialNetwork();
            request.setAttribute("socialNetworks", socialNetworks);

            //pagging
            String preIndex = request.getParameter("page");
            if (preIndex == null) {
                preIndex = "1";
            }
            int pageIndex = Integer.parseInt(preIndex);
            int numRecords = galleryDAO.count();
            int totalPage = (numRecords % 3 == 0)
                    ? numRecords / 3
                    : (numRecords / 3) + 1;
            ArrayList<Gallery> galleries = galleryDAO.getGalleries(pageIndex, 3);
            Introduction introduction = introductionDAO.getIntroduction();
            request.setAttribute("introduction", introduction);
            request.setAttribute("totalpage", totalPage);
            request.setAttribute("galleries", galleries);
            request.setAttribute("pageIndex", pageIndex);
            request.getRequestDispatcher("Home.jsp").forward(request, response);
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
