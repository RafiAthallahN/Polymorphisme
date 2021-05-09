/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author W10
 */
public class Rectangle  extends Shape{
    // private member variable
    private int length, width;
    
    //Constructor
    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public String toString(){
        return "Rectangle[length + "+ length+ ", width = " + width + ", " + super.toString() +" ]";
    }
    
    //Ovveride the inherited getArea method to proviede the proper implementation
    @Override
    public double getArea(){
        return this.length * this.width;
    }
    
}
