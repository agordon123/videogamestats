/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestatstracker;

import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author gorda
 */
public class GamestatsTracker extends Application{
    
    @Override
    /**
     * Set's the GUI up to read from the FXML file
     */
    public void start(Stage stage) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("StatTrackerGUI.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("NBA 2k My Team Stat Tracker");
    stage.show();
    
    startup s = new startup();
    s.introScreen();
    }

    public static void main(String[] args) {
        launch(args);
   /**
        BasketballPlayer test = new BasketballPlayer(); 
        List<BasketballPlayer> roster = test.build13manRoster();
        
        */
        
       
        
       
    }
    
}
