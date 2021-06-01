package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextField login;
    @FXML
    TextField pass;
    @FXML
    Label enter;

    @FXML
    public void enter(ActionEvent event){
        if (login.getText().equals("Admin") &&
        pass.getText().equals("Password")){
            enter.setText("Hello Admin");
        } else {
            enter.setText("Ошибка авторизации!");
        }
    }
}
