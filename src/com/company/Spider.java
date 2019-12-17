package com.company;

public class Spider extends Monster{

    public Spider(int startRoom, String name) {

        super(startRoom, name);
    }
    
    public String toString(){
        return "Spider's position: " + position +".";
    }


}