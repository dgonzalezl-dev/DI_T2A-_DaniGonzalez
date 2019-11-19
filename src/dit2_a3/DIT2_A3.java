/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dit2_a3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Dani
 */
public class DIT2_A3 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Pane myPane = (Pane) FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        stage.setTitle("FXML TableView Example");
        Scene myScene = new Scene(myPane);
        stage.setScene(myScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
