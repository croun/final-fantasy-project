/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalgame;

import java.util.Random;


public class Monster {
    static Enemy enemy=new Enemy();
    static class Enemy{
        Random ran=new Random();
        String[] mons={"Goblin","Slime","Wolf","Spider","Forest Imps","Wisps","Treant"};
        int[] health={90,95,100,105};
        int[] dmg={12,14,16,18,20};
        int[] exp={10,15,17,20};
        private String enemy;
        private int life=health[ran.nextInt(health.length)];
        private int damage=dmg[ran.nextInt(dmg.length)];
        private int exps=exp[ran.nextInt(exp.length)];
        
        public String getEnemy(){
            return enemy;
        }
        public int getLife(){
            return life;
        }
        public int getDamage(){
            return damage;
        }
        public int getExp(){
            return exps;
        }
        
        public void setEnemy(){
            enemy=mons[ran.nextInt(mons.length)];
        }
        public void setLife(int health){
            life=health;
        }
        public void setDamage(int crit){
                damage=crit;
        }
        public void setExp(int ex){
            this.exps=ex;
        }
        public void Displaymonster(){
            System.out.println("Enemy: "+getEnemy());
            System.out.println("Life:  "+getLife());
        }
    }
    public void mons(){
     Enemy enemy=new Enemy();  
    }
}
