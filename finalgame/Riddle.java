/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

class Riddles{
    
    private String riddle;
    private String answer;
    
    public Riddles(String riddle,String ans){
        this.riddle=riddle;
        answer=ans;
    }
    
    public String getRiddle(){
        return riddle;
    }
    public String getAnswer(){
        return answer;
    }
    public void setRiddle(String riddles){
        riddle=riddles;
    }
    public void setAnswer(String Answers){
        answer=Answers;
    }
}


class Adding{
    private ArrayList<Riddles> riddle;
    Random rands=new Random();
    Scanner sc=new Scanner(System.in);
    
    public void array(){
        
        Riddles[] rid={};
    }
    
    public Adding(){
        riddle=new ArrayList<>();
    }
    public void addRiddle(Riddles riddle){
        this.riddle.add(riddle);
    }
    public void removeRiddle(Riddles riddle){
        this.riddle.remove(riddle);
    }
    public void displayRiddle(){
        for (Riddles rid:riddle){
            
            System.out.println(rid.getRiddle());
        }    
        System.out.println("--------------------------");
    }
    
    
    
    public void updateRiddles(String resp) throws InterruptedException{
        Riddle rid=new Riddle();
        Random ran=new Random();
        Battle battle=new Battle();
        rid.AddingRiddles();
        Collections.shuffle(riddle);
        
        int[] exp={12,13,14,15,16,17,18,19,20};
        int exps=exp[ran.nextInt(exp.length)];
        
        Riddles randRid = riddle.get(0);
        Riddles randAns = riddle.get(0);
        
        
        String res;
        switch(resp){
            case "tree":
                System.out.println("\u001b[31m"+randRid.getRiddle()+"\u001b[0m");
                res=sc.nextLine();
                if(res.equalsIgnoreCase(randAns.getAnswer())){
                    System.out.println("correct");
                    System.out.println("You gain "+10+"exp");
                    Player.LevelingSystem(10);
                    Scenario.Scenario5();
                }else{
                    System.out.println("-----------GAME OVER--------------");
                }
                
                removeRiddle(randRid);
                removeRiddle(randAns);
                break;
            case "bat":
                System.out.println("\u001b[34m"+randRid.getRiddle()+"\u001b[0m");
                resp=sc.nextLine();
                if(resp.equalsIgnoreCase(randAns.getAnswer())){
                    System.out.println("correct");
                    System.out.println("You gain "+exps+"exp");
                    Player.LevelingSystem(exps);
                }else{
                    System.out.println("Incorrect!!!!");
                    Thread.sleep(300);
                    battle.battle();
                }
                break;
            default:
                break;
        }
        
    }
}


public class Riddle {
    Random rands=new Random();
    Adding adds=new Adding();
    
    public void AddingRiddles(){
        adds.addRiddle(new Riddles("It wears a leather coat to keep its skins in working order. Escorts you to other realms, without a magic portal.","Book"));
        adds.addRiddle(new Riddles("What is not alive but grows, does not breaths but needs air?","Fire"));
        adds.addRiddle(new Riddles("Better old than young; the healthier it is, the smaller it will be?","Wound"));
        adds.addRiddle(new Riddles("You go at red and stop at green. What am I?","WATERMELON"));
        adds.addRiddle(new Riddles("This fire is smothered best not by water or sand but by words.?","Desire"));
        adds.addRiddle(new Riddles("As I was going to St Ives I met a man with 7 wives. Each wife had 7 kids. Each kid had 7 cats. Each cat had 7 kittens. How many were going to St Ives?","1"));
        adds.addRiddle(new Riddles("There is a man who is big in the morning. He becomes smaller in the afternoon. And becomes bigger gain at the sun set before disappearing at night","Shadow"));
        
        
    }
    
    
    
    public void gettingRiddles(String rsp) throws InterruptedException{
        AddingRiddles();
        adds.updateRiddles(rsp);
        
    }
    
}
