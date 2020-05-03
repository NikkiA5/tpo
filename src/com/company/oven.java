package com.company;

public class oven extends kitchen{
    public oven(String dish) {
        super(dish);
    }

    @Override
    public void cooking(){
        System.out.println("I can bake a " + getDish() + " using an oven");
    }
}
