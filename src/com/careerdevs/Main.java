package com.careerdevs;

public class Main {

    public static void main(String[] args) {

//--------------------------Output------------------------------------------
//  #1 Return the First Element in an Array (getfirstelement.js)
        System.out.println(getFirstElement(new int[]{3, 1, 4}));

//  #2 Return the Next Number from the Integer Passed (nextnumber.js)
        System.out.println((addition(73)));

//  #3 Find the Index (findtheindex.js)
        System.out.println(search(new int[]{1, 2, 3, 4}, 3));

//  #4 Convert Minutes into Seconds (mintosec.js)
        System.out.println(convert(4));

//  #5 Return Something to Me! (returnsomthing.js)
        System.out.println(giveMeSomething("is right"));

//  #6 Flip the Boolean
        System.out.println(reverse(true));

//  #7 Get Word Count
        System.out.println(countWords("How are you today?"));

//  #8
        System.out.println(existsHigher(new int[]{1, 2, 3, 4, 5}, 8));

//  #9 How Many Vowels?
        System.out.println(getCount("Palm"));

    }

    //    -----------------------Code-------------------------------------------

    //  #1 Return the First Element in an Array (getfirstelement.js)
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    // #2 Return the Next Number from the Integer Passed (nextnumber.js)
    public static int addition(int num) {
        int plusOne = ++num;
        return plusOne;
    }

    //  #3 Find the Index (findtheindex.js)
    public static int search(int arr[], int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    // #4 Convert Minutes into Seconds (mintosec.js)
    public static int convert(int minutes) {
        int converted = minutes * 60;
        return converted;
    }

    // #5 Return Something to Me! (returnsomthing.js)
    public static String giveMeSomething(String a) {
        return "something " + a;
    }

    //  #6 Flip the Boolean
    public static boolean reverse(boolean b) {
        return !b;
    }

    // #7 Get Word Count
    public static int countWords(String s) {
        return s.split(" ").length;
    }
    // #8 Exists a Number Higher?
    public static boolean existsHigher(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) return true;
            else {
            }
        }
        return false;
    }

    //  #9 How Many Vowels?
    public static int getCount(String str) {
        int vowelsCount = 0;

        // Your code here
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
