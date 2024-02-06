package com.jay;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.10");
        System.out.println(a.equals(b));

        String s1 = new String("a"); // ①
        s1.intern(); // ②
        String s2 = "a";// ③
        System.out.println(s1 == s2); // ④   false

        String s3 = new String("a") + new String("a");// ⑤
        s3.intern();// ⑥
        String s4 = "aa";// ⑦
        System.out.println(s3 == s4);// ⑧    true
        int i= 10_00;

    }
}