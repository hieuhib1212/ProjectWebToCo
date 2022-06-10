/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DonHangChiTietDAO;
import Dao.SanPhamDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DonHangChiTiet;
import model.SanPham;

/**
 *
 * @author Hiệu Bùi
 */
public class AddtoCart extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        if (session.getAttribute("TK") == null) {
            response.sendRedirect("Log.jsp");
        } else {
            String TK = (String) session.getAttribute("TK");
            float total = 0;
            if (session.getAttribute("total") == null) {
                session.setAttribute("total", total);
            }else {
                total = (float) session.getAttribute("total");
            }
            DonHangChiTietDAO dao = new DonHangChiTietDAO();
            int id = Integer.parseInt(request.getParameter("id"));
            ArrayList<DonHangChiTiet> lc = dao.getDHCT(TK);
            SanPham p = new SanPhamDAO().getSPID(id);
            int quantity = 1;
            DonHangChiTiet dh = new DonHangChiTiet();
            dh.setTaiKhoan(TK);
            dh.setMaSanPham(p.getMaSanPham());
            dh.setTenSanPham(p.getTenSanPham());
            dh.setSoLuongSP(quantity);
            dh.setGia(p.getGia());
            if (lc == null) {
                lc = new ArrayList<>();
                lc.add(dh);
                dao.insert(dh);
            } else {
                boolean isProductExist = false;
                for (DonHangChiTiet c : lc) {
                    if (c.getMaSanPham() == id) {
                        isProductExist = true;
                        c.setSoLuongSP(c.getSoLuongSP() + 1);
                        dao.update(c);
                    }
                }
                if (!isProductExist) {
                    lc.add(dh);
                    dao.insert(dh);
                }
            }
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
