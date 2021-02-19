package com.fourteenPointOneSeven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PigLatin pigLatin = new PigLatin();
        Scanner scan = new Scanner(System.in);

        System.out.println("To convert phrase to pigLatin, enter 1 \n" +
                "To convert phrase to english phrase, enter 2");
        int response = scan.nextInt();

        if (response == 1){
            scan.nextLine();
            System.out.println("Enter a phrase: ");
            String phrase = scan.nextLine();

            System.out.println(pigLatin.convertPhrase(phrase));
        }

        if (response == 2){
            scan.nextLine();
            System.out.println("Enter a phrase: ");
            String phrase = scan.nextLine();

            System.out.println(pigLatin.convertPigLatinToEnglishPhrase(phrase));
        }


    }
}
