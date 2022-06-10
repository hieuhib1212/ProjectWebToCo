/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NguoiDung;

/**
 *
 * @author Hiệu Bùi
 */
public class NguoiDungDAO extends BaseDAO {

    public ArrayList<NguoiDung> getND() {
        ArrayList<NguoiDung> nd = new ArrayList<>();
        try {
            String sql = "select * from NguoiDung";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                NguoiDung d = new NguoiDung();
                d.setTaiKhoan(rs.getString("TaiKhoan"));
                d.setMatKhau(rs.getString("MatKhau"));
                d.setHoTen(rs.getString("Hoten"));
                d.setGioiTinh(rs.getBoolean("GioiTinh"));
                d.setNgaySinh(rs.getDate("NgaySinh"));
                d.setDiaChi(rs.getString("DiaChi"));
                d.setSdt(rs.getString("Sdt"));
                nd.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nd;
    }
    public boolean canSignUp(String username, String phone) {
        try {
            String sql = "select * from NguoiDung";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                if (rs.getString("TaiKhoan").equalsIgnoreCase(username) || rs.getString("Sdt").equals(phone)) {
                    return false;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return true;
    }
    public NguoiDung getUser(String username) {
        NguoiDung d = new NguoiDung();
        try {
            String sql = "select * from NguoiDung";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                if (rs.getString("TaiKhoan").equals(username)) {
                    d.setTaiKhoan(rs.getString("TaiKhoan"));
                    d.setMatKhau(rs.getString("MatKhau"));
                    d.setHoTen(rs.getString("Hoten"));
                    d.setGioiTinh(rs.getBoolean("GioiTinh"));
                    d.setNgaySinh(rs.getDate("NgaySinh"));
                    d.setDiaChi(rs.getString("DiaChi"));
                    d.setSdt(rs.getString("Sdt"));
                    return d;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public int insertUser(String account, String password, String name, boolean gender,
            Date dob, String address, String phone) {
        int i = 0;
        String query = "insert into NguoiDung(TaiKhoan, MatKhau, Hoten, GioiTinh, NgaySinh, DiaChi, Sdt)\n"
                + "values(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, account);
            ps.setString(2, password);
            ps.setString(3, name);
            ps.setBoolean(4, gender);
            ps.setDate(5, dob);
            ps.setString(6, address);
            ps.setString(7, phone);
            i = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    public int updateUser(NguoiDung nd){
        int i = 0;
        try {
            String sql = "UPDATE [NguoiDung]\n"
                    + "   SET [MatKhau] = ?\n"
                    + "      ,[Hoten] = ?\n"
                    + "      ,[GioiTinh] = ?\n"
                    + "      ,[NgaySinh] = ?\n"
                    + "      ,[DiaChi] = ?\n"
                    + "      ,[Sdt] = ?\n"
                    + " WHERE [TaiKhoan] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nd.getMatKhau());
            statement.setString(2, nd.getHoTen());
            statement.setBoolean(3, nd.isGioiTinh());
            statement.setDate(4, nd.getNgaySinh());
            statement.setString(5, nd.getDiaChi());
            statement.setString(6, nd.getSdt());
            statement.setString(7, nd.getTaiKhoan());
            i = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
}
