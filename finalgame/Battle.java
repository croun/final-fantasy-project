/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalgame;

import java.util.*;

public class Battle {
    
    public static void battle() throws InterruptedException{
        Monster mon=new Monster();
        Player player=new Player();
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        mon.enemy.setEnemy();
        System.out.println("A "+mon.enemy.getEnemy()+" appeared!!!");
        mon.enemy.Displaymonster();
        String result;
        String response;
        int i=0;
        int j=0;
        int playerHealth=player.dmg.getLife();
        int playerDamage=player.dmg.getDamage();
        int monsterHealth=mon.enemy.getLife();
        int monsterDamage=mon.enemy.getDamage();
        
        boolean test=true;
        
        while(test){
            String[] chance={"critical","normal"};
            System.out.println("-------------------------------------------");
            System.out.println("Choose your next move");
            Thread.sleep(300);
            System.out.println("1. Attack");
            Thread.sleep(300);
            System.out.println("2. Heal");
            response=sc.nextLine();
            
            switch(response){
                case "1":
                    result=chance[ran.nextInt(chance.length)];
                    if(result==chance[0]){
                        System.out.println(playerDamage);
                        playerDamage+=playerDamage*.30;
                        System.out.println("Critical Damage");
                    }
                    System.out.println(player.user.getName()+" dealt "+playerDamage);
                    monsterHealth-=playerDamage;
                    Thread.sleep(230);
                    System.out.println(mon.enemy.getEnemy()+"'s life left: "+monsterHealth);
                    Thread.sleep(230);
                    result=chance[ran.nextInt(chance.length)];
                    if(result==chance[0]){
                        System.out.println(monsterDamage);
                        monsterDamage+=monsterDamage*0.50;
                        System.out.println("Critical damage");
                    }
                    System.out.println(mon.enemy.getEnemy()+" dealt "+monsterDamage);
                    Thread.sleep(300);
                    playerHealth-=monsterDamage;
                    System.out.println(player.user.getName()+"'s life left: "+playerHealth);
                    Thread.sleep(300);
                    monsterDamage=mon.enemy.getDamage();
                    if(playerHealth==0||playerHealth<0){
                        System.out.println(player.user.getName()+"has defeated by a "+mon.enemy.getEnemy());
                        Thread.sleep(300);
                        i=1;
                        test=false;
                        
                        
                    }else if(monsterHealth==0||monsterHealth<0){
                        System.out.println(player.user.getName()+" defeated a "+mon.enemy.getEnemy());
                        Thread.sleep(300);
                        i=2;
                        j+=1;
                        test=false;
                    }
                    break;
                case "2":
                    System.out.println(player.user.getName()+" Life +20");
                    playerHealth+=20;
                    if(playerHealth>Player.dmg.getMaxLife()){
                        System.out.println("User over healed setting to max life");
                        playerHealth=Player.dmg.getMaxLife();
                    }
                    System.out.println(player.user.getName()+"'s Life: "+playerHealth);
                    result=chance[ran.nextInt(chance.length)];
                    if(result==chance[0]){
                        System.out.println(monsterDamage);
                        monsterDamage+=monsterDamage%0.50;
                        System.out.println("Critical damage");
                    }
                    System.out.println(mon.enemy.getEnemy()+" delt "+monsterDamage);
                    playerHealth-=monsterDamage;
                    System.out.println(player.user.getName()+"'s life left: "+playerHealth);
                    if(playerHealth==0||playerHealth<0){
                        System.out.println(player.user.getName()+"has defeated by a "+mon.enemy.getEnemy());
                        test=false;
                    }
                    break;
                default:
                    break;
            }
        }
        if (i==2){
            if(j==2){
                Scenario.Scenario4();
            }
            else{
                Scenario.Scenario2();
            }
        }else if(i==1){
            FinalGame.game();
        }
        
    }
}
