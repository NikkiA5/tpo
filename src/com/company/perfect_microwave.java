package com.company;

public class perfect_microwave extends microwave {
    public perfect_microwave(String dish) {
        super(dish);
    }
    @Override
    public void heating(){
        System.out.println("I can heat a " + getDish() + " and your soul using love and waves");
    }
}
