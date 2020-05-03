package com.company;

public class stove extends kitchen{
    public stove(String dish) {
        super(dish);
    }

    public void boiling(){
        System.out.println("I can boil a " + getDish() + " using a stove");
    }
    public void frying(){
        System.out.println("I can fry a " + getDish() + " using a stove");
    }
}
