package com.company;

public class kitchen {
    private String dish;

    public String getDish(){return dish;}

    public kitchen(String dish){
        this.dish = dish;
    }
    public void cooking(){
        System.out.println("I can cook a " + dish + " on a kitchen");
    }
}
