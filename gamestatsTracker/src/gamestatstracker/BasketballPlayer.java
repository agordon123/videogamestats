/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestatstracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;


public class BasketballPlayer implements GeneralStats{
    private String name;
    private List<String> statNames;
    private List<Integer> statValues;
    private Map<String,Integer> statistics;
    private Scanner scnr = new Scanner(System.in);

    public BasketballPlayer() {
        this.name = setName();
        this.statistics = enterStats();
    }

    public String setName() {
        System.out.println("Enter Player Name");
        this.name = scnr.next();
        return this.name;
    }

    public List<String> buildArray(){
        statNames = new ArrayList<>();
        String[] names = {"minutes","points","rebounds","assists","steals","fouls","turnovers","fga","fgm","ThreePA","ThreePM","Blocks"};
        for (String name : names) {
            statNames.add(name);
        }
        return statNames;
        }
    public Map<String,Integer> enterStats(){
        statistics = new HashMap<>();
        statNames = buildArray();
        for(String stat : statNames){
           Scanner scnr = new Scanner(System.in);
                System.out.println("Number of "+stat+"?");
                int temp = scnr.nextInt();
                Integer temp1 = temp;
                statistics.put(stat, temp1);
        }
        return statistics;
        }
    public List<BasketballPlayer> build13manRoster(){
        List<BasketballPlayer> roster = new ArrayList<>();
        Scanner scnr = new Scanner(System.in);
        
        for (int i = 0; i < 13; i++) {
            BasketballPlayer player = new BasketballPlayer();
            roster.add(player);
           
        }
       return roster;
    }

    
    public void displayRoster(List list)throws FileNotFoundException{
        File f = new File("Roster.txt");
        PrintWriter p = new PrintWriter(f);
  
        
        for (Iterator i = list.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
    public void outputStats(List list){
        for (Iterator i = list.iterator(); i.hasNext();) {
            
        }
    }
    @Override
    public void displayStats(Map map){
        for (Map.Entry e : statistics.entrySet()) {
            System.out.println(e.getKey() +" : "+ e.getValue());
        }
    }
    @Override
    public String toString() {
        return "BasketballPlayer" +  ", statistics=" + statistics + '}';
    }
  
    
}
