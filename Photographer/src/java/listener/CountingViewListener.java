/*
 * Copyright(C)2021, FPT University
 * Lab Java Web
 * 
 * Record of change
 * DATE             VERSION             AUTHOR              DESCRIPTION
 * 2021-06-23         1.0               Ducnxhe141626       First Implement
 */
package listener;

import dao.CountingViewDAO;
import dao.impl.CountingViewDAOImpl;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * This class uses to count the access from User
 * 
 * @author Xuan duc
 */

public class CountingViewListener implements HttpSessionListener{

    /**
     * This method uses <code>CountingViewDAO</code> to get the view and update the view 
     * then set attribute for <code>ServletContext</code>
     *
     * @param se the <code>HttpSessionEvent</code> object
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        try {
            int view;
            CountingViewDAO countingViewDAO = new CountingViewDAOImpl();
            //Get view
            view = countingViewDAO.countView();
            //Update View
            countingViewDAO.updateView(view);
            //Format 6 digits
            String viewFormat = String.format("%06d", view);
            ServletContext context = se.getSession().getServletContext();

            context.setAttribute("view", viewFormat);
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
    
}
