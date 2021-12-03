package com.example.driveven;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SingUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button singUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField singUpEmail;

    @FXML
    private TextField singUpLastName;

    @FXML
    private TextField singUpName;

    @FXML
    private TextField singUpPhoneNumber;

    @FXML
    void initialize() {


        singUpButton.setOnAction(event -> {
            
            singUpNewUser();
            


        });

    }

    private void singUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = singUpName.getText();
        String lastName = singUpLastName.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String email = singUpEmail.getText();
        String phoneNumber = singUpPhoneNumber.getText();

        User user = new User(firstName,lastName,userName,password,email,phoneNumber);

        dbHandler.singUpUser(user);
    }

}
