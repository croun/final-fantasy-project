/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalgame;

import java.util.Scanner;


        
public class Player {
    static Level lvl=new Level();
    static Damage dmg=new Damage();
    static User user=new User();
    static class User{
        private String name;
        private int age;

       public String getName(){
           return name;
       } 
       public int getAge(){
           return age;
       }
       public void setName(String name){
           this.name=name;
       }
       public void setAge(int age){
           this.age=age;
       }
    }
    static class Level{
        private int lvl=1;
        private int maxExp=50;
        private int exp=0;

        public int getLvl(){
            return lvl;
        }
        public int getMaxExp(){
            return maxExp;
        }
        public int getExp(){
            return exp;
        }
        public void setLvl(int lvl){
            this.lvl=lvl;
        }
        public void setMaxExp(int maxExp){
            this.maxExp=maxExp;
        }
        public void setExp(int exp){
            this.exp=exp;
        }

    }
    public static void input() throws InterruptedException{
        Scanner sc=new Scanner(System.in);
        
        boolean test=true;
        int age;
        String name;
        String ages;
        String response;
        while(test){
            System.out.print("Enter Name: ");
            name=sc.nextLine();
            user.setName(name);
            System.out.print("Enter Age:  ");
            ages=sc.nextLine();
            age=Integer.parseInt(ages);
            user.setAge(age);
            System.out.print("Is the information Correct? Y or N\nName: "+user.getName()+"\nAge:  "+user.getAge()+"\n");
            response=sc.nextLine();
            if(response.equalsIgnoreCase("y")){
            System.out.println("--------------------------");
                test=false;
            }
        }
        Scenario.Scenario1();
    }
    public static void LevelingSystem(int exp){
        
        int max=50;
        int extras;
        int level;
        int mexp;
        
        lvl.setExp(exp);
        
        
        if(lvl.getMaxExp()<lvl.getExp()||lvl.getMaxExp()==lvl.getExp()){
            level=lvl.getLvl()+1;
            mexp=lvl.getMaxExp()+max;
            lvl.setMaxExp(mexp);
            lvl.setLvl(level);
            extras=lvl.getMaxExp()-lvl.getExp();
            lvl.setExp(extras);
            dmg.setDamage(5);
            dmg.setMaxLife(10);
            System.out.println("Damage: "+Player.dmg.getDamage()+"\nLife: "+Player.dmg.getLife()+"\n---------------------------");
        }
    }
    static class Damage{
        private int damage=20;
        private int life=100;
        private int maxLife=100;
        public int getDamage(){
            return damage;
        }
        public int getLife(){
            return life;
        }
        public int getMaxLife(){
            return maxLife;
        }
        public void setDamage(int dmg){
            damage+=dmg;
        }
        public void setMaxLife(int life){
            this.maxLife+=life;
        }
    }
}
