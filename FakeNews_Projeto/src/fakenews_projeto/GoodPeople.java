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

public class GoodPeople extends People{

    public GoodPeople(ArrayList<People> arrayPeople){

        setColor(5);
    }

public GoodPeople(People people){

    super();
    setColor(5);
    this.setY(people.getY());
    this.setX(people.getX());
    this.setZap(people.getZap());
    this.getCtt().addAll(people.getCtt());

}
    
}
