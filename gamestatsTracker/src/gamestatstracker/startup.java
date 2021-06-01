/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestatstracker;

import java.io.FileNotFoundException;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author gorda
 */
public class startup {
    private Alert menu;
    
    public void introScreen() throws FileNotFoundException{
        menu = new Alert(Alert.AlertType.CONFIRMATION,"Ready to insert stats?");
        menu.setHeaderText("NBA 2K MyTeam Statistics");
        menu.setTitle("GAME");
        menu.setHeight(310);
        

        menu.setContentText("Welcome to the initial version of the MyTeam Stats Project.\n"
                + "Created on 5/26/2021 By Adam Gordon\n");
        menu.showAndWait().ifPresent(response -> {
                        if (response == ButtonType.OK) {
                           
                            menu.close();
                        }
                        else if (response == ButtonType.CANCEL){
                            System.exit(0);
                        }
                    });
    }
    }

