package org.example;

public class ReverserNumber {

    public static void main(String[] args) {
        int number = 1000;
        int remainder = 0;
        int reverseNumber = 0;

        while(number != 0){
            remainder = number %10;
            reverseNumber = reverseNumber*10 +  remainder;
            number = number /10;
        }

        System.out.println(reverseNumber);

        //System.out.println(11/10);

    }

}
