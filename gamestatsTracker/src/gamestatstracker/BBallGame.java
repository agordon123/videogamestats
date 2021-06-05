/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestatstracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BBallGame {
    private TotalStats t1 = new TotalStats();
    private TotalStats t2 = new TotalStats();
    private BasketballPlayer p;
    private BasketballStats s;
    private List<BasketballPlayer> roster = new ArrayList<>();
    private Map<BasketballPlayer,BasketballStats> team1 = new HashMap<>();
    private Map<BasketballPlayer,BasketballStats> team2 = new HashMap<>();
    
    private String gameType;

    public BBallGame() {
        this.t1 = t1;
        this.roster = roster;
        this.team1 = team1;
        this.team2 = team2;
    }

    
    
}
