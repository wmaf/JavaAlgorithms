package com.careerdevs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//--------------------------Output------------------------------------------//
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

//  #8  Exists a Number Higher?
        System.out.println(existsHigher(new int[]{1, 2, 3, 4, 5}, 8));

//  #9 How Many Vowels?
        System.out.println(getCount("BuBBa"));

//  #10 Return the Sum of Two Numbers
        System.out.println(sum(12, 5));

// #11 Are the Numbers Equal?
        System.out.println(isSameNum(5, 1));

// #12 Convert Age to Days
        System.out.println(calcAge(20));

// #13 Name Greeting!
        System.out.println(helloName("Bill"));

// #14 Reverse the Order of a String
        System.out.println(reverse("Think Amazing."));

// #15 Two Makes Ten
        System.out.println(makesTen(9, 9));

// #16 Count Syllables
        System.out.println(numberSyllables("buf-fet"));

// #17 Case Insensitive Comparison
        System.out.println(match("hey", "hey"));

// #18 H4ck3r Sp34k
        System.out.println(hackerSpeak("become a coder"));

// #19 Countdown Homework
        System.out.println(countDown.countToZero(581));

// #20 Recursion Homework
        System.out.println(recursive.aggregate(50));

// #21 Number Split
        halfSplit.numberSplit(-21);

//  #22
        System.out.println(Transcription.dnaToRna("GATTACCA"));

//  #23  Array of Multiples
        Program.arrayOfMultiples(7, 5);

//    #24 Missing HW weekending  4/10

//  #25 https://edabit.com/challenge/vFLhYANAZQGKTtxA2   (Adding Numbers)
        Program.NumericString.add("555", "666");

    }

    //    -----------------------Code-------------------------------------------//

    //  #1 Return the First Element in an Array (getfirstelement.js)
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    // #2 Return the Next Number from the Integer Passed (nextnumber.js)
    public static int addition(int num) {
        return ++num;
    }

    //  #3 Find the Index (findtheindex.js)
    public static int search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    // #4 Convert Minutes into Seconds (mintosec.js)
    public static int convert(int minutes) {
        return minutes * 60;
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
        for (int j : arr) {
            if (j >= n) return true;
        }
        return false;
    }

    // #9 How Many Vowels?
    public static int getCount(String str) {
        int vowelsCount = 0;

        //  Cheat had general idea with .length did think of using charAt() with index i.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    // #10 Return the Sum of Two Numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // #11 Are the Numbers Equal?
    public static boolean isSameNum(int x, int y) {
        return x == y;
    }

    // #12 Convert Age to Days
    public static int calcAge(int age) {
        int days = 365;
        return days * age;
    }

    // #13  Name Greeting!
    public static String helloName(String name) {

        return "Hello " + name + "!";
    }

    // #14 Reverse the Order of a String
    public static String reverse(final String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // #15 Two Makes Ten
    public static boolean makesTen(int a, int b) {
        return a + b == 10 || a == 10 || b == 10;
    }

    // #16 Count Syllables
    public static int numberSyllables(String word) {
        return word.split("-").length;
    }

    // #17  Case Insensitive Comparison
    public static boolean match(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    // #18 H4ck3r Sp34k
    public static String hackerSpeak(String str) {
        return str
                .replace('a', '4')
                .replace('e', '3')
                .replace('i', '1')
                .replace('o', '0')
                .replace('s', '5');
    }

    // #19 Countdown Homework
    public class countDown {
        public static int countToZero(int n) {
            int cntDown = 0;
            for (int i = n; i > -1; i--)
                cntDown = i;
            return cntDown;
        }
    }

    //    #20 Recursion edabit!!!!
    public class recursive {
        public static int aggregate(int n) {
            int aggregate = 0;
            for (int i = 1; i <= n; i++)
                aggregate += i;
            return aggregate;
        }
    }

    //     #21   Number Split
    public class halfSplit {
        public static int[] numberSplit(int n) {
            //System.out.println("test");
            int[] splitArr = new int[]{(int) Math.floor(n / 2.0), (int) Math.ceil(n / 2.0)};
            System.out.println(Arrays.toString(splitArr));
            return splitArr;
        }
    }

    //    #22  https://edabit.com/challenge/aPmfBKu7ixcsYYKaZ   ( Replace All )
    //      A, T, G and C, while RNA converts to U, A, C and G respectively.
    public class Transcription {
        public static String dnaToRna(String strand) {
            return strand
                    .replaceAll("A", "U")
                    .replaceAll("T", "A")
                    .replaceAll("G", "X")
                    .replaceAll("C", "G")
                    .replaceAll("X", "C");
        }
    }

    //  #23  Array of Multiples   https://edabit.com/challenge/rzpucPyoyEtXPo2BG
    public class Program {
        public static int[] arrayOfMultiples(int num, int length) {
            int[] nums = new int[length]; // length is now nums and = to 5 and can be used as a counter.
            for (int i = 0; i < nums.length; i++) {
                nums[i] = num * (i + 1);  // a * (b + 1) or zero  + 1 ....(remember outer arr is to equal zero.)
            }
            System.out.println(Arrays.toString(nums)); // Array to string to verify outcome.
            return nums;
        }

        // #25  https://edabit.com/challenge/vFLhYANAZQGKTtxA2   (Adding Numbers)
        public class NumericString {
           public static String add(String a, String b) {
              try {
                  // return Integer.toString((Integer.parseInt(a) + Integer.parseInt(b)));  Another option for toString.
                  final var s = String.valueOf((Integer.parseInt(a) + Integer.parseInt(b)));
                  System.out.println(s);
                  return s;
              }
              catch(Exception e){
                  return "Invalid Operation";
              }
            }
        }
    }
}


//https://www.google.com/search?q=convert+int+to+string&rlz=1C1PRFI_enUS986US986&oq=convert+int+to+string&aqs=chrome..69i57j0i512l9.5754j0j15&sourceid=chrome&ie=UTF-8
//  parseInt(String s) − This returns an integer (decimal only).
// parseInt(int i) − This returns an integer, given a string representation of decimal, binary, octal, or hexadecimal (radix equals 10, 2, 8, or 16 respectively) numbers as input.
// if append with a "+ "" string it automatically converts to string










   // public static Currency getInstance(String currencyCode);
   //public static Currency getInstance(Locale locale);









