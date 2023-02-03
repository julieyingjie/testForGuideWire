package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        System.out.println(solution("We test coders. Give us a try?"));
    }



    public int solution(String[] T, String[] R) {
        int numberOfGroup = 0;
        int numberOfCorrectGroup = 0;
        for(int i = 0; i<T.length;i++){
            numberOfGroup = Math.max(numberOfGroup, Integer.parseInt(T[i].replaceAll("[^0-9]", "")));

        }

        boolean [] testResult = new boolean [numberOfGroup];
        for(int i = 0; i<T.length;i++){
            if(!R[i].equals("OK") )
            {
                testResult[Integer.parseInt(T[i].replaceAll("[^0-9]", ""))] = true;
            }
        }

        for(int i = 0; i<testResult.length;i++){
            if(!testResult[i])
            {
                numberOfCorrectGroup ++;
            }
        }

        return numberOfCorrectGroup*100/numberOfGroup;


    }


}