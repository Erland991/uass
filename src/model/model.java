/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import controller.controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import view.view;


/**
 *
 * @author erlan
 */
public class model implements controller {

    @Override
    public void Reset(view crud) throws SQLException {
        try{
        Connection con = koneksi.getcon();
        String sql ="INSERT INTO crud values(?,?,?,?,?,?,?,?,?,?,?  )";
        PreparedStatement prepare = con.prepareStatement(sql);
        prepare.setString(1, crud.txtNP.getText());
        prepare.setString(2, crud.txtTS.getText());
        prepare.setString(3, crud.txtLS.getText());
        prepare.setString(4, crud.txtTK.getText());
        prepare.setString(5, crud.txtCD.getText());
        prepare.setString(6, crud.rbAV.getText());
        prepare.setString(7, crud.rbTR.getText());
        prepare.setString(8, crud.rbXP.getText());
        prepare.setString(9, crud.btnTD.getText());
        prepare.setString(10, crud.btnHP.getText());
        prepare.setString(11, crud.btnEXT.getText());
        prepare.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data Berhasil di simpan");
        prepare.close();
            Reset(crud);
    }catch(Exception e){
        System.out.println(e);
        
    }
    }

    @Override
    public void Simpan(view crud) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
