package com.company;

public class microwave extends stove{
    public microwave(String dish) {
        super(dish);
    }
    @Override
    public void boiling() {
        System.out.println("I can boil a " + getDish() + " using a microwave");
    }
    @Override
    public void frying(){
        System.out.println("I can boil a " + getDish() + " using a microwave");
    }

    public void heating(){
        System.out.println("I can heat a " + getDish() + " using a microwave");
    }
}
