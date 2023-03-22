package com.careerdevs;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class JavaStaticInit {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner sc = new Scanner(System.in);

    int B=sc.nextInt();
    int H=sc.nextInt();


        try{
        if(B<=0 ||H<=0){
            throw new Exception("Breadth and height must be positive");
        }
        else
            System.out.println(B*H);
    }
        catch(Exception e){
        System.out.println(e);
    }

}
}
