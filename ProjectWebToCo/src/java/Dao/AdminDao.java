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
import model.Admin;

/**
 *
 * @author Hiệu Bùi
 */
public class AdminDao extends BaseDAO {

    public ArrayList<Admin> getAdmin() {
        ArrayList<Admin> admin = new ArrayList<>();
        try {
            String sql = "select * from Admin";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Admin ad = new Admin();
                ad.setAdminName(rs.getString("TaiKhoan"));
                ad.setPassword(rs.getString("MatKhau"));
                admin.add(ad);
            }

        } catch (SQLException e) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return admin;
    }
}
