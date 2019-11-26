package com.linwl.jFoenixDemo.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author ：linwl
 * @date ：Created in 2019/11/26 14:38
 * @description ：
 * @modified By：
 */
public class MainController implements Initializable {
    @FXML
    public JFXButton dialogButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void onStart(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("弹出的那个1");
        alert.showAndWait();
    }
}
