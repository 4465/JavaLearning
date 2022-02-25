package com.basicExersice;

enum Weekday{
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int dayValue;
    private final String chinese;

    private Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}

public class EnumerateDemo {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
        System.out.println(day);
        System.out.println(day.name());
        System.out.println(day.ordinal());

        Weekday day1 = Weekday.SUN;
        switch(day) {
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is " + day1 + ". Work at office!");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is " + day1 + ". Work at home!");
                break;
            default:
                throw new RuntimeException("cannot process " + day1);
        }
    }
}
