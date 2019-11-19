/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dit2_a3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author Dani
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TableView<Persona> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;
    
    @FXML
    protected void addPerson(ActionEvent event) {
        ObservableList<Persona> data = tableView.getItems();
        data.add(new Persona(firstNameField.getText(),
            lastNameField.getText(),
            emailField.getText()
        ));
        
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");   
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }
    
}
