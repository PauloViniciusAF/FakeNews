/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fakenews_projeto;

/**
 *
 * @author pauli
 */
public class Main {
    public static void main(String args[]){

        float t = 0;
        World world = new World();
        world.createpeople();
        
        while(true){
            t += 0.5;
            
            world.drawWorld();
            world.MovePeople();
            world.virus();
            world.destroyVirus();
            world.CbnNews();
            world.data();
            
            System.out.println("Tempo de Simulacao: " + t + " seg");
            System.out.println("Numero de pessoas: " + 100);

            try {
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
