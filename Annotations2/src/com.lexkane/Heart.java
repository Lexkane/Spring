package com.lexkane;
public class Heart {


    private int noOfHeart;


    private String nameOfAnimal;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }


    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getNoOfHeart() {
        return noOfHeart;
    }

    public void setNoOfHeart(int noOfHeart) {
        this.noOfHeart = noOfHeart;
    }


    public void pump (){
        System.out.println("Heart is pumping");
        System.out.println("Alive");
    }

}