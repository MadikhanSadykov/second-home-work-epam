package com.madikhan.customstring;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Example of splitting character into separate Strings for odd and even
        String stringBeforeChange = "oeoeoeoeoeoeoeoeoeoeoeoeoeoeoeoe";

        List<String> oddAndEvenCharsInString = CustomString.splitOddAndEvenChars(stringBeforeChange);

        System.out.println("String with odd characters: " + oddAndEvenCharsInString.get(0) + "\n");
        System.out.println("String with even characters: " + oddAndEvenCharsInString.get(1) + "\n");


        // Example of counting digits in the string
        String stringWithDigits = "One 1 Two 2 Three 3 Four 4 Five 5 Six 6 Seven 7 Eight 8";

        System.out.println("Amount of digits: " + CustomString.getAmountOfDigits(stringWithDigits) + ", from " + stringWithDigits + "\n");


        // Example of separating digits to another String
        System.out.println("String with separated digits: " + CustomString.separateDigits(stringWithDigits) + ", from " + stringWithDigits + "\n");


        // Example of removing duplicate characters in the String
        String stringWithDuplicates = "aaaabbbbccccddddeeeeffff";
        System.out.println("String without duplicates" + CustomString.removeDuplicates(stringWithDuplicates) + ", from " + stringWithDuplicates + "\n");


        // Example of counting frequency given character in the string
        char desiredCharacter = 'e';
        System.out.println("Amount of 'e' character: " + CustomString.getFrequencyOfCharacter(stringWithDuplicates,desiredCharacter) + ", from "
                + stringWithDuplicates + "\n");


        // Example of flipping the string
        System.out.println("Reversed strign: " + CustomString.reverseString(stringWithDuplicates) + ", from " + stringWithDuplicates + "\n");

        // Example of counting substring in string
        String containsSubstrings = "Hello world, Hello friend, Hello me=)";
        System.out.println("Amount of substrings is : " + CustomString.getAmountOfSubstrings(containsSubstrings, "Hello") + " in " + containsSubstrings + "\n");


        //Example of reversing words in the String
        System.out.println("Reversed words: " + CustomString.reverseWords("somebody once told me the world is gonna roll me") + "\n");


        //Example of sorting the array of strings
        String[] unsortedArray = new String[] {"Java", "Kafka", "Apple", "Default", "Lombok", "Effort", "Bubble", "Filter", "Circle", "Heroku", "Isolation", "Git"};
        System.out.println("Sorted Array: " + Arrays.asList(CustomString.sortArrayOfStrings(unsortedArray)).toString() + "\n");


        // Example of getting the length of the shortest word in the string
        String someString = "App qwerty some food delivery random words";
        System.out.println("The length of the shortest word: " + CustomString.getLengthOfShortestWord(someString) + "\n");

        // Example of getting the amount of words in the string
        System.out.println("The amount of words: " + CustomString.getAmountOfWords(someString) + "\n");


        // Example of insertion whitespace into the string
        String camelCasedString = "FirstSecond";
        System.out.println("After insertion whitespace: " + CustomString.insertSpace(camelCasedString, 5) + "\n");


        // Example of checking for palindrome
        String notPalindrome = "Nanaina";
        String palindrome = "Anna";
        System.out.println("Isn't a palindrome: " + CustomString.isPalindrome(notPalindrome));
        System.out.println("Is a palindrome: " + CustomString.isPalindrome(palindrome) + "\n");


        // Example of replacing old substring by new in the string
        String beforeReplacement = "Here is oldSubstring in the string";
        System.out.println("After replacement: " + CustomString.replaceSubstring(beforeReplacement, "oldSubstring", "newSubstring") + "\n");


        // Example of getting distance between two substrings
        String string = "One two three four five six seven";
        System.out.println("Distance between substrings: " + CustomString.getDistanceBetweenStrings(string, "two", "six") + "\n");

    }

}
