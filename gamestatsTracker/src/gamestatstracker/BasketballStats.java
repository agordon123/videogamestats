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
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gorda
 */
public class BasketballStats {
    public List<String> statNames;
    public Integer minutes;
    public Integer points;
    public Integer rebounds;
    public Integer assists;
    public Integer steals;
    public Integer fouls;
    public Integer turnovers;
    public Integer fga;
    public Integer fgm;
    public Integer threepa;
    public Integer threepm;
    public Integer blocks;
    public Map<String,Integer> gameStats;  

    public BasketballStats() {
        this.minutes = 0;
        this.points = 0;
        this.rebounds = 0;
        this.assists = 0;
        this.steals = 0;
        this.fouls = 0;
        this.turnovers = 0;
        this.blocks = 0;
        this.fga = 0;
        this.fgm = 0;
        this.threepa = 0;
        this.threepm = 0;
        
    
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getRebounds() {
        return rebounds;
    }

    public void setRebounds(Integer rebounds) {
        this.rebounds = rebounds;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getSteals() {
        return steals;
    }

    public void setSteals(Integer steals) {
        this.steals = steals;
    }

    public Integer getFouls() {
        return fouls;
    }

    public void setFouls(Integer fouls) {
        this.fouls = fouls;
    }

    public Integer getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(Integer turnovers) {
        this.turnovers = turnovers;
    }

    public Integer getFga() {
        return fga;
    }

    public void setFga(Integer fga) {
        this.fga = fga;
    }

    public Integer getFgm() {
        return fgm;
    }

    public void setFgm(Integer fgm) {
        this.fgm = fgm;
    }

    public Integer getThreepa() {
        return threepa;
    }

    public void setThreepa(Integer threepa) {
        this.threepa = threepa;
    }

    public Integer getThreepm() {
        return threepm;
    }

    public void setThreepm(Integer threepm) {
        this.threepm = threepm;
    }

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    @Override
    public String toString() {
        return "BasketballStats{" + "minutes=" + minutes + ", points=" + points + ", rebounds=" + rebounds + ", assists=" + assists + ", steals=" + steals + ", fouls=" + fouls + ", turnovers=" + turnovers + ", fga=" + fga + ", fgm=" + fgm + ", threepa=" + threepa + ", threepm=" + threepm + ", blocks=" + blocks ;
    }
    
    public List<String> buildArray(){
        statNames = new ArrayList<>();
        String[] names = {"minutes","points","rebounds","assists","steals","fouls","turnovers","fga","fgm","ThreePA","ThreePM","Blocks"};
        for (String name : names) {
            statNames.add(name);
        }
        return statNames;
    }
   
    

}
