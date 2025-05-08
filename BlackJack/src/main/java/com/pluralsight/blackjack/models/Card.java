package com.pluralsight.blackjack.models;

public class Card {

    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }
    public String getSuit(){
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }
    }
    public String getValue(){
        if(isFaceUp){
            return value;
        } else {
            return "#";
        }
    }
    public int getPointValue(){
        if(isFaceUp){
            return 0;
        } else {
            return -1;
        }
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}

