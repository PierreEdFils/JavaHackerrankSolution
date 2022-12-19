package com.careerdevs;

import java.util.Scanner;

public class JavaSubArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        int negativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < 0) {
                    negativeSum++;
                }
            }
        }
        System.out.println(negativeSum);

    }

    }

