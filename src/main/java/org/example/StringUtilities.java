package org.example;

public class StringUtilities {
    public static boolean shortString(String str){
        return str.length()<5;
    }
    public static char firstLetter(String str) {
        if (str.isEmpty()) {
            return '\0';
        }
        return str.charAt(0);
    }
    public static String censorAsparagus(String str) {
        String lowerString = str.toLowerCase();
        lowerString = lowerString.replace("asparagus", "****");
        return lowerString;
        }
    public static String bigger(String str1, String str2) {
        if (str1.length() >= str2.length()) {
            return str1;
        } else  {
            return str2;
        }
    }
}
// Refer to Java Basics 1 for common string methods

// Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
// characters

// Add a static function called firstLetter that takes a String parameter and returns the first character of the string

// Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
// "asparagus" (lowercase only) replaced with 4 stars: "****"

// Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
// strings are the same length, return the first string.