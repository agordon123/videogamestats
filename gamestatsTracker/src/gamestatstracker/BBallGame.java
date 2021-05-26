/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestatstracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;


public class BBallGame {
    BasketballPlayer p;
    BasketballStats s;
    List<BasketballPlayer> roster = new ArrayList<>();
    Map<BasketballPlayer,BasketballStats> team1 = new HashMap<>();
    Map<BasketballPlayer,BasketballStats> team2 = new HashMap<>();
    String gameType;
    public BBallGame(String gt) {
        
        this.team1 = team1;
        this.team2 = team2;
        this.gameType = gt;
       
    }

    
}
