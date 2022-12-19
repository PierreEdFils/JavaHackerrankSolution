package com.careerdevs;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>[] arr= new ArrayList[n];  /* a different approach*/
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> list= new ArrayList();
            int d=sc.nextInt();
            for(int j=0;j<d;j++)
                list.add(sc.nextInt());
            arr[i]=list;
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(arr[x-1].get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
    }

