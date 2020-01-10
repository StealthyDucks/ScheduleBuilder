/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulebuilder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Jared
 */
public class Screen2Controller implements Initializable {
    public Button closeMenuButton;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Stage primaryStage = new Stage();
        primaryStage.initStyle(StageStyle.UNDECORATED);
        // TODO
    }    
    public void start(Stage primaryStage){
        primaryStage.initStyle(StageStyle.UNDECORATED);
    }
    
    public void handleCloseButtonAction(ActionEvent event) {
        Platform.exit();
    }
}
