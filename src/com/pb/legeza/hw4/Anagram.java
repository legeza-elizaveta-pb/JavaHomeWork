package com.pb.legeza.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]) {
        Scanner dateString = new Scanner(System.in);

        System.out.println("Предложение 1:");
        String line1 = dateString.nextLine().toUpperCase();

        System.out.println("Предложение 2:");
        String line2 = dateString.nextLine().toUpperCase();

        String line1NZ = line1.replaceAll("[,. ]+", "");
        String line2NZ = line2.replaceAll("[,. ]+", "");

        if(line1NZ.length() != line2NZ.length()){
            System.out.println("Предложение: \""+line1+"\" НЕ является анаграммой предложения: \""+line2+"\"");

        } else {

            char[] anline1NZ = line1NZ.toCharArray();
            Arrays.sort(anline1NZ);

            char[] anline2NZ = line2NZ.toCharArray();
            Arrays.sort(anline2NZ);

            if (Arrays.equals(anline1NZ, anline2NZ)) {
                System.out.println("Предложение: \"" + line1 + "\" является анаграммой предложения: \"" + line2 + "\"");
            } else {
                System.out.println("Предложение: \"" + line1 + "\" НЕ является анаграммой предложения: \"" + line2 + "\"");
            }
        }
    }
}

