package com.jay.base;

import com.jay.constant.Days;

public class TestSwitch {
    public static void main(String[] args) {
//        java8();
        java21();
    }

    public static void java8() {
        String day = "tuesday";
        switch (day) {
            case "monday":
                System.out.println("work");
                break;
            case "tuesday":
                System.out.println("work");
                break;
            case "saturday":
                System.out.println("day off");
                break;
            case "sunday":
                System.out.println("day off");
                break;
        }
        //枚举值monday,tuesday,wednesday,thursday,friday,saturday,sunday;
        Days days = Days.saturday;
        switch (days) {
            case Days.monday:
                System.out.println("work");
                break;
            case Days.tuesday:
                System.out.println("work");
                break;
            case Days.wednesday:
                System.out.println("work");
                break;
            case Days.thursday:
                System.out.println("work");
                break;
            case Days.friday:
                System.out.println("work");
                break;
            case Days.saturday:
                System.out.println("day off");
                break;
            case Days.sunday:
                System.out.println("day off");
                break;
        }
    }

    public static String java21() {
        //null 处理
        var name = switch (getName()) {
            case "" -> "";
            case "1" -> "num";
            case null -> "null";
            default -> "unknown";
        };
        System.out.println(name);
        //模式匹配
        Object o = 1;
        Object a = switch (o) {
            case Integer i -> 1 + i;
            case String s -> "1" + s;
            case Boolean b -> "1" + b;
            default -> o.toString();
        };
        System.out.println(a);
        //yield ， 表达式
        String day = "sunday";
        return switch (day) {
            case "monday", "tuesday" -> "work";
            case "saturday", "sunday" -> {
                System.out.println("day off");
                yield "work";
            }
            default -> "unknown";
        };

    }

    static String getName() {
        return null;
    }
}
