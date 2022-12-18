package com.careerdevs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class JAVA2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().trim().split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int[][] a= new int[6][6];
        for(int i=0;i<6; i++){
            for(int j=0; j<6; j++){
                a[i][j]= arr.get(i).get(j);
            }
        }

        int maxSum= Integer.MIN_VALUE;
        for(int i=0; i<4; i++){
            int curSum=0;
            for(int j=0; j<4; j++){
                curSum= a[i][j] + a[i][j+1] + a[i][j+2]
                        + a[i+1][j+1] +
                        a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
                if(curSum>maxSum) maxSum=curSum;
            }
        }
        System.out.println(maxSum);

        bufferedReader.close();
    }
}
