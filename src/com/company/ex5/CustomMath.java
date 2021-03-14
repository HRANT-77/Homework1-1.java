package com.company.ex5;

public class CustomMath {
    public boolean isPrime(int num){
        if(num <= 1) {
            return false;
        }
        else if (num==2){
            return true;
        }
        else if (num%2==0){
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }
    public int nextPrime(int num){
        int number = num;
        while(true){
            if(isPrime(number))
                return number;
            number++;
        }
    }
}
