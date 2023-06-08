package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientLoginFormController {
    public TextField txtFirstName;

    public AnchorPane loginContext;
     String name;

    public void btnChatOnAction(ActionEvent actionEvent) throws IOException {

            name = txtFirstName.getText();
            loginContext.getChildren().clear();
            Stage stage = (Stage) loginContext.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ClientChatForm.fxml"))));
        }
    }



