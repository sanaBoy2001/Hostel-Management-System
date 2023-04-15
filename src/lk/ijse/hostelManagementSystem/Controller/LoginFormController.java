package lk.ijse.hostelManagementSystem.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hostelManagementSystem.util.Navigation;
import lk.ijse.hostelManagementSystem.util.Routes;

import java.io.IOException;

public class LoginFormController {
    public JFXTextField txtEmail;
    public JFXPasswordField txtPassword;
    public JFXButton btnSignIn;
    public JFXButton btnCreateAcc;
    public JFXButton btnForgotPassword;
    public AnchorPane pane;

    public void btnSignOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.DASHBOARD,pane);
    }

    public void btnCreateAccOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.REGISTER,pane);
    }

    public void btnForgotPasswordOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.FORGETPASSWORD,pane);
    }
}
