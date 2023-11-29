/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fakenews_projeto;

/**
 *
 * @author pauli
 */
import java.util.Random;
import java.util.ArrayList;


public class People implements IMovable{
    Random numRan = new Random();

    private int x , y, color, Zap, vel = 1;
    ArrayList<Integer> Ctt = new ArrayList<>();

    public People(){
        this.x = numRan.nextInt(58) + 1;
        this.y = numRan.nextInt(28) + 1;
        this.color = 5;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }

    public int getZap() {
        return Zap;
    }
    public void setZap(int zap) {
        Zap = zap;
    }

    public int getVel() {
        return vel;
    }
    public void setVel(int vel) {
        this.vel = vel;
    }

    public ArrayList<Integer> getCtt() {
        return Ctt;
    }
    public void setCtt(ArrayList<Integer> ctt) {
        Ctt = ctt;
    }


    @Override
    public void Move(){
        int move = numRan.nextInt(5);
        switch(move){

            case 1:
            x -=getVel();
            if (x<=0){
                x+=58;
            }   
            else if (x >= 59){
                x -=58;
            } break;

            case 2:
                x +=getVel();
                if (x<=0){
                    x += 58;
                }
                else if (x >= 59){
                    x-=58;
                } break;

            case 3:
                y +=getVel();
                if (y<=0){
                    y += 28;
                }
                else if (y >= 29){
                    y-=28;
                } break; 

            case 4:
                y -= getVel();
                if (y <= 0){
                    y +=28;
                }
                else if( y >=29){
                    y-=28;
                }break;
                
            default:
            break;

            }

    }
      
}

