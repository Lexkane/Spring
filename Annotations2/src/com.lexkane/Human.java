package com.lexkane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;


    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("Setter method called");
    }

    Human() {
    }


    public Human (Heart heart) {
        this.heart = heart;
        System.out.println("Human constructor is getting called with arguments");
    }

    public void startPumping() {
        if (heart != null){
            heart.pump();
            System.out.println("Name of the animal is: " +heart.getNameOfAnimal()+
                    " number of heart present is : "+ heart.getNoOfHeart());
        } else{
            System.out.println("you are dead");
        }

    }
}