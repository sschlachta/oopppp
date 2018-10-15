package com.company;

/**
 * Created by ss772 on 10/4/18.
 */
public class Twice {

    //I just declared a state variable, AKA a property
    public double radius;

    //This is my constructor; always has to be public
    public Twice (double r) {
        radius = r;
    }

    public double circumference (){
        double c = 2 * Math.PI * radius;
        return c;
    }

    public double area (){
        double a = Math.PI * (radius * radius);
        return a;
    }

}
