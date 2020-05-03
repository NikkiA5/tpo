package com.company;

public class good_oven extends oven{
    public good_oven(String dish) {
        super(dish);
    }
    @Override
    public void cooking(){
        System.out.println("I can bake a " + getDish() + " and I'll give you a pie");
    }
}
