package com.company.ex5;

public class Main5 {
    public static void main(String[] args) {
        CustomMath check=new CustomMath();
        System.out.println(check.isPrime(1));
        System.out.println(check.nextPrime(1));
        System.out.println(check.nextPrime(2));
        System.out.println(check.nextPrime(6));
        System.out.println(check.nextPrime(11));
        System.out.println(check.nextPrime(15));
    }
}
