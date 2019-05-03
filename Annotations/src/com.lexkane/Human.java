package com.lexkane;

import org.springframework.beans.factory.annotation.Autowired;
public class Human {

    private Heart heart;

    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("Setter method called");
    }

    Human() {
    }

    @Autowired
    public Human (Heart heart) {
        this.heart = heart;
        System.out.println("Human constructor is getting called with arguments");
    }

    public void startPumping() {
        if (heart != null){
            heart.pump();
        } else{
            System.out.println("you are dead");
        }

    }
}