package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class StartUp {

    public static boolean isAnagram(String s1, String s2) {
        boolean flag = false;
        //Converting both the string to lower case.  
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {    //Checking for the length of strings  

            flag = false;
        } else {
            //Converting both the arrays to character array  
            char[] string1 = s1.toCharArray();
            char[] string2 = s2.toCharArray();

            //Sorting the arrays using in-built function sort ()  
            Arrays.sort(string1);
            Arrays.sort(string2);

            if (Arrays.equals(string1, string2)) {    //Comparing both the arrays

                flag = true;
            } else {
                flag = false;
            }

        }
        return flag;
    }

    public static void main(String[] args) {

        String s1, s2;
        System.out.print("Enter string-1: ");
        s1 = new Scanner(System.in).next();

        System.out.print("Enter string-2: ");
        s2 = new Scanner(System.in).next();

        if (isAnagram(s1, s2)) {           //check either anagram or not within method
            System.out.println("Both the strings are anagram");
        } else {
            System.out.println("Both the strings are not anagram");
        }
    }

}
