/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fakenews_projeto;

/**
 *
 * @author pauli
 */
import java.util.ArrayList;

public class BadPeople extends People{

    public BadPeople(ArrayList<People> arrayPeople){

        setColor(6);
    }


public BadPeople(People people){
    super();
    setColor(6);
    this.setX(people.getX());
    this.setY(people.getY());
    this.setZap(people.getZap());
    this.getCtt().addAll(people.getCtt());
    }

}
