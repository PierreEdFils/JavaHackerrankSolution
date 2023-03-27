package com.careerdevs;

import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

//Write your code here


class MyCalculator1 implements AdvancedArithmetic {
    public int divisor_sum(int a) {
        int i = 2;
        int res = a != 1 ? a + 1 : 1;
        while (i <= a/2) {
            if(a%i==0) res = res + i;
            i++;
        }
        return res;
    }
}
public class JavaOopInterface {
    public static void main(String []args){
        MyCalculator1 my_calculator = new MyCalculator1();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
