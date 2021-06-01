/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestatstracker;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.io.FileOutputStream;
import java.io.FileWriter;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author gorda
 */
public class StatTrackerGUIController implements Initializable {

    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img4;
    @FXML
    private Button creation;
    @FXML
    private TextField infoCapture;
    private File f;
    private FileOutputStream strm;
    private FileWriter fw;
    @FXML
    private AnchorPane background;
    BasketballPlayer p = new BasketballPlayer();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
        }
    
    
    

       

    @FXML
    private void createGame(ActionEvent event) {
       
        
    }


    @FXML
    private void inputValue(ActionEvent event) {
    }

            
        
 

        
        
}

