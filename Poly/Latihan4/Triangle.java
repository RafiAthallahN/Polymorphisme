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
public class Triangle extends Shape{
     // private member variable
    private int base, height;
    
    //Constructor
    public Triangle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public String toString(){
        return "Triangle[base + "+ base+ ", height = " + height + ", " + super.toString() +" ]";
    }
    
    //Ovveride the inherited getArea method to proviede the proper implementation
    @Override
    public double getArea(){
        return 0.5*this.base*this.height;
    }
}
