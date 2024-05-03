package com.example.tikemana.Views;

import com.example.tikemana.Controllers.Admin.AdminController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
    //Admin Views
    private AnchorPane bangDieuKhien;

    public ViewFactory(){}

    public AnchorPane getBangDieuKhien(){
        if (bangDieuKhien == null) {
            try {
                bangDieuKhien = new FXMLLoader(getClass().getResource("/Fxml/Admin/BangDieuKhien.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return bangDieuKhien;
    }

    public void hienThiManHinhDangNhap(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e){
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("QUAN LY BAN VE CHUYEN BAY");
        stage.show();
    }

    public void hienThiManHinhAdmin(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Admin/Admin.fxml"));
        AdminController adminController = new AdminController();
        loader.setController(adminController);
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e){
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("QUAN LY BAN VE CHUYEN BAY");
        stage.show();
    }
}
