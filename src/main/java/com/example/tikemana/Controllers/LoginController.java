package com.example.tikemana.Controllers;

import com.example.tikemana.Models.Model;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public Label ten_tk_lbl;
    public MFXTextField ten_tk_fld;
    public Label mahatma_lbl;
    public MFXPasswordField mahatma_fld;
    public MFXButton dang_nhap_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dang_nhap_btn.setOnAction(actionEvent -> Model.getInstance().getViewFactory().hienThiManHinhAdmin());
    }
}
