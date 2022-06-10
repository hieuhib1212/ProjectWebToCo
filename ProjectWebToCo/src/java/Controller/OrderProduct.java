/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DonHangChiTietDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DonHangChiTiet;

/**
 *
 * @author Hiệu Bùi
 */
public class OrderProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("TK") == null) {
            response.sendRedirect("login");
        }else if (session.getAttribute("cart") == null){
            response.sendRedirect("MilkTea");
        } else {
            String TK = (String) session.getAttribute("TK");
            DonHangChiTietDAO dao = new DonHangChiTietDAO();
            ArrayList<DonHangChiTiet> lc = dao.getDHCT(TK);
            dao.ordered(TK);
//            for (DonHangChiTiet c : lc) {
//                dh.setSoLuongSP(c.getSoLuongSP());
//                dh.setGia(c.getGia());
//                dh.setTenSanPham(c.getTenSanPham());
//                dh.setTotal(c.getTotal());
//                String s = session.getAttribute("TK").toString();
//                dh.setTen(s);
//                java.util.Date now = new java.util.Date();
//                java.sql.Date sqlDate = new java.sql.Date(now.getTime());
//                dh.setNgayDat(sqlDate);
//                db.insert(dh);
//            }
            session.removeAttribute("total");
            session.removeAttribute("cart");
            response.sendRedirect("Cart");

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
