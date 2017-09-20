package com.java21days;

import java.util.*;

public class ComicBooks {
    
    public ComicBooks() {
        
    }
    
    public static void main(String[] arguments) {
        HashMap quality = new HashMap();
        float price1 = 3.00F;
        quality.put(Condition.MINT, price1);
        float price2 = 2.00F;
        quality.put(Condition.NEARMINT, price2);
        float price3 = 1.50F;
        quality.put(Condition.VERYFINE, price3);
        float price4 = 1.00F;
        quality.put(Condition.FINE, price4);
        float price5 = 0.50F;
        quality.put(Condition.GOOD, price5);
        float price6 = 0.25F;
        quality.put(Condition.POOR, price6);
        float price7 = 5.00F;
        quality.put(Condition.PRISTINEMINT, price7);
        float price8 = 0.10F;
        quality.put(Condition.COVERLESS, price8);
        
        Comic[] comix = new Comic[3];
        comix[0] = new Comic("Amazing Spider-Man", "1A", "very fine",
            12_000.00F);
        comix[0].setPrice( (Float) quality.get(comix[0].condition) );
        comix[1] = new Comic("Incredible Hulk", "181", "near mint",
            680.00F);
        comix[1].setPrice( (Float) quality.get(comix[1].condition) );
        comix[2] = new Comic("Cerebus", "1A", "good", 190.00F);
        comix[2].setPrice( (Float) quality.get(comix[2].condition) );
        for (int i = 0; i < comix.length; i++) {
            System.out.println("Title: " + comix[i].title);
            System.out.println("Issue: " + comix[i].issueNumber);
            System.out.println("Condition: " + comix[i].condition);
            System.out.println("Price: $" + comix[i].price + "\n");
        }
    }
}

class Comic {
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;
    
    Comic(String inTitle, String inIssueNumber, String inCondition,
            float inBasePrice){
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }
    
    void setPrice(float factor) {
        price = basePrice * factor;
    }
}

enum Condition {
    PRISTINEMINT,
    MINT,
    NEARMINT,
    VERYFINE,
    FINE,
    GOOD,
    POOR,
    COVERLESS
}