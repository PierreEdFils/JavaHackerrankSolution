package com.careerdevs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java1DArray {

    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
    for (int i = 1; i < n; i++) {
        a.add(Integer.parseInt(bufferedReader.readLine().trim()));
    }
    for (int element : a) {
        System.out.println(element);
    }
    bufferedReader.close();
}
}
