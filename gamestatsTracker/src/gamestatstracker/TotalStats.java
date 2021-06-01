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

/**
 *
 * @author gorda
 */
public class TotalStats implements GeneralStats{
    private int points;
    private int fga;
    private int fgm;
    private int threePA;
    private int threePM;
    private int fta;
    private int ftm;
    private int fbpts;
    private int pip;
    private int scndchance;
    private int benchpts;
    private int assts;
    private int or;
    private int dr;
    private int stls;
    private int blocks;
    private int tofor;
    private int ptsoffto;
    private int tfouls;
    private int dunks;
    private int lead;
    private int top;
    private int torem;
    private String team1;
    private Map<String,Integer> genStats = new HashMap<>();  
    private Map<String,Integer> gameStats;

    public TotalStats() {
        this.points = -1;
        this.fga = -1;
        this.fgm = -1;
        this.fta = -1;
        this.ftm = -1;
        this.fbpts = -1;
        this.pip = -1;
        this.scndchance = -1;
        this.benchpts = -1;
        this.assts = -1;
        this.or = -1;
        this.dr = -1;
        this.stls = -1;
        this.blocks = -1;
        this.tofor = -1;
        this.ptsoffto = -1;
        this.tfouls = -1;
        this.dunks = -1;
        this.lead = -1;
        this.top = -1;
        this.torem = -1;
        this.team1 = "";
    }
    public void setTeam1(String team){
        this.team1 = team;
    }

    @Override
    public List<String> buildArray(){
        List<String> statNames = new ArrayList<>();
        String[] statCats = {"Points","FGA","FGM","3PA","3PM","FTA","FTM","FB Points","Points in the Paint","2nd Chance pts","Bench pts",
        "Assists","Offensive Rebounds","Defensive Rebounds",};
        for (String cat : statCats) {
            statNames.add(cat);
        }
        return statNames;
    }
    @Override
    public void displayStats(Map map){
        for (Map.Entry e : gameStats.entrySet()) {
            System.out.println(e.getKey() +" : "+ e.getValue());
        }
    }
}
