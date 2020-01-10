/*
<<<<<<< HEAD:src/schedulebuilder/ScheduleBuilder.java
=======
Hao test
>>>>>>> Hao:ScheduleBuilder/src/schedulebuilder/ScheduleBuilder.java
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
<<<<<<< HEAD:src/schedulebuilder/ScheduleBuilder.java
 * @author Braden
=======
 * @author Hao Ran
>>>>>>> Hao:ScheduleBuilder/src/schedulebuilder/ScheduleBuilder.java
 */
public class ScheduleBuilder extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
