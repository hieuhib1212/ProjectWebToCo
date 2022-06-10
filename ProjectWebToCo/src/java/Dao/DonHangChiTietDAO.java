/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DonHangChiTiet;

/**
 *
 * @author Hiệu Bùi
 */
public class DonHangChiTietDAO extends BaseDAO {

    public ArrayList<DonHangChiTiet> getDHCT(String TK) {
        ArrayList<DonHangChiTiet> nd = new ArrayList<>();
        try {
            String sql = "SELECT TaiKhoan, MaSanPham, TenSanPham, Gia, SoLuongSP from DonHangChiTiet "
                    + "where TaiKhoan='"+TK+"'" + " and active=1" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                DonHangChiTiet dh = new DonHangChiTiet();
                dh.setTaiKhoan(rs.getString(1));
                dh.setMaSanPham(rs.getInt(2));
                dh.setTenSanPham(rs.getString(3));
                dh.setGia(rs.getFloat(4));
                dh.setSoLuongSP(rs.getInt(5));
                dh.setTotal(((float)dh.getSoLuongSP()) * dh.getGia());
                nd.add(dh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nd;
    }
    public void insert(DonHangChiTiet d) {
        try {
            String sql = "INSERT INTO [DonHangChiTiet]\n"
                    + "           ([TaiKhoan]\n"
                    + "           ,[MaSanPham]\n"
                    + "           ,[TenSanPham]\n"
                    + "           ,[Gia]\n"
                    + "           ,[SoLuongSP]\n"
                    + "           ,[active])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, d.getTaiKhoan());
            statement.setInt(2, d.getMaSanPham());
            statement.setString(3, d.getTenSanPham());
            statement.setFloat(4, d.getGia());
            statement.setInt(5, d.getSoLuongSP());
            statement.setBoolean(6, true);
            statement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DonHangChiTietDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void update(DonHangChiTiet d){
        try {
            String sql = "UPDATE DonHangChiTiet\n"
                    + "   SET SoLuongSP=?\n"
                    + " WHERE TaiKhoan='" + d.getTaiKhoan() + "'" +" and MaSanPham='" + d.getMaSanPham() + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, d.getSoLuongSP());
            statement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DonHangChiTietDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void updateSP() {
        try {
            
        } catch (Exception e) {
        }
    }
    public void remove(DonHangChiTiet d) {
        try {
            String sql = "Delete from [DonHangChiTiet]\n"
                    + " WHERE [TaiKhoan]=? AND [MaSanPham]=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, d.getTaiKhoan());
            statement.setInt(2, d.getMaSanPham());
            statement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DonHangChiTietDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void ordered(String TK) {
        try {
            String sql = "UPDATE DonHangChiTiet\n"
                    + "   SET active=?\n"
                    + " WHERE TaiKhoan='" + TK + "'" +" and active=1";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBoolean(1, false);
            statement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DonHangChiTietDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
