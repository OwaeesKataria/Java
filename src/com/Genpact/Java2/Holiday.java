package com.Genpact.Java2;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday (String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }
    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public boolean inSameMonth(Holiday otherHoliday) {
        return this.month.equals(otherHoliday.month);
    }
    public double calculateAverageDate(Holiday[] holidays) {
        int totalDays = 0;
        int numberOfHolidays = holidays.length;

        for (int i = 0; i < numberOfHolidays; i++) {
            totalDays += holidays[i].getDay();
        }
        double averageDate = (double) totalDays / numberOfHolidays;
        return averageDate;
    }
    public static void main(String[] args) {
        Holiday Xmas = new Holiday("Christmas", 25, "December");
        System.out.println(Xmas.name + " is on " + Xmas.month + " " + Xmas.day);
    }
}
