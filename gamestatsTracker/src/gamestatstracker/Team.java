/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestatstracker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gorda
 */
public class Team{
    private List<BasketballPlayer> roster1;
    private List<BasketballPlayer> roster2;
    

    public Team() {
        this.roster1 = new ArrayList<>();
        this.roster2 = new ArrayList<>();
        
    }
    
    public Team(List<BasketballPlayer> roster1, List<BasketballPlayer> roster2, TotalStats ts) {
        this.roster1 = roster1;
        this.roster2 = roster2;
        
    }
    public List<BasketballPlayer> buildTeam1(){
        roster1 = new ArrayList<>();
      
        BasketballPlayer p = new BasketballPlayer();
        roster1 = p.build13manRoster();
        return roster1;
    }
    public List<BasketballPlayer> buildTeam2(){
        roster2 = new ArrayList<>();
      
        BasketballPlayer p = new BasketballPlayer();
        roster2 = p.build13manRoster();
        return roster2;
    }
    
}
