package practice_exam.Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Bank b = new Bank(1000.0, 10.0);
        System.out.println(b.calculateInterest());
    }
}
