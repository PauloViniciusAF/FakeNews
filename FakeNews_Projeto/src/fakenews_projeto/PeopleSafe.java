/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fakenews_projeto;

/**
 *
 * @author pauli
 */
public class PeopleSafe extends People{

    public PeopleSafe(){
        setColor(3);
    }
    public PeopleSafe(People people){
        super();
        setColor(3);
        this.setX(people.getX());
        this.setY(people.getY());
        this.setZap(people.getZap());
        this.getCtt().addAll(people.getCtt());
    }

}
