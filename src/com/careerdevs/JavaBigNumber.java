package com.careerdevs;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigNumber {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Comparator<String> customComparator = (s1, s2) -> {
            if(s1 == null) {
                return 1;
            }
            if(s2 == null) {
                return -1;
            }
            return - new BigDecimal(s1).compareTo(new BigDecimal(s2));
        };
        Arrays.sort(s, customComparator);
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
