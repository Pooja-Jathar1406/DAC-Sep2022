package com.pooja.hc;
import java.io.*;
import java.util.*;
import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappyNumber(int number) {
        HashSet<Integer> set = new HashSet<>();
        while (set.add(number)) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            if (sum == 1) {
                return true;
            }
            number = sum;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 1111111;
        if (isHappyNumber(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}