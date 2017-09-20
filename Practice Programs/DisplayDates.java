package com.java21days;


class DisplayDates {
    
    public static void main(String[] arguments) {
        int year = 2017;
        if(arguments.length > 0) {
            year = Integer.parseInt(arguments[0]);
        }
        for(int i = 1; i <= 12; i++) {
            int daysInMonth = DayCounter.countDays(i,year);
            for(int j = 1; j <= daysInMonth; j++) {
                System.out.println(i + "/" + j + "/" + year);
            }
        }
    }
}