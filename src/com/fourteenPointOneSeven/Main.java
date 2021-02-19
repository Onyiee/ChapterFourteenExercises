package com.fourteenPointOneSeven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PigLatin pigLatin = new PigLatin();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = scan.nextLine();

        System.out.println(pigLatin.convertPhrase(phrase));

    }
}
