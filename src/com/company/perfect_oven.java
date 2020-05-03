package com.company;

public class perfect_oven extends good_oven {
    public perfect_oven(String dish) {
        super(dish);
    }
    @Override
    public void cooking(){
        System.out.println("I can bake a " + getDish() + " and I definitely will give you a pie with apples");
    }
}
