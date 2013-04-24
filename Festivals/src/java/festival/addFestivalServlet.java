/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package festival;

import festivalOverview.Festivals;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 *
 * @author Ruben, Wouter, Glenn, Arnout, Timo
 */
@WebServlet(name = "addFestivalServlet", urlPatterns = {"/addFestivalServlet"})
public class addFestivalServlet extends HttpServlet {
    
    private Session session = null;
    private Transaction transaction = null;


    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        session = factory.openSession();
        try {
            //Alle gegevens ophalen uit de JSP
            String festName = request.getParameter("festName");
            String festLocation = request.getParameter("festLocation");
            String date =  request.getParameter("festDate");
            java.util.Date festDate;
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
            try
            {
                festDate = df.parse(date);
                
            }
            catch(ParseException e)
            {
                festDate = null;
            }
            
            
            int festDays = Integer.parseInt(request.getParameter("festDays"));

            //Transactie aanmaken om de gegevens te kunnen updaten met hibernate
            transaction = session.beginTransaction();
            Festivals festival = new Festivals();
            
            //Gegevens toevoegen aan transactie
            festival.setFestNaam(festName);
            festival.setFestLocatie(festLocation);
            festival.setFestDatum(festDate);
            festival.setFestDuur((byte) festDays);
            session.save(festival);
            
            //transactie uitvoeren en gegevens in database plaatsen
            transaction.commit();

            response.sendRedirect("login.jsp");
        }
        catch (HibernateException e) 
        {
            transaction.rollback(); 
        } 
        finally 
        {
            session.close();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
