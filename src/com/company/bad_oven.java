package com.company;

public class bad_oven extends oven {
    public bad_oven(String dish) {
        super(dish);
    }
    @Override
    public void cooking(){
        System.out.println("I will not make you a " + getDish() + ", I'm going to burn you instead");
    }
}
