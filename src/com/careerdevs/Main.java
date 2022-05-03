package com.careerdevs;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static com.careerdevs.Main.Program.ExistsANumberHigher.differenceMaxMin;

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

//  #24 https://edabit.com/challenge/vKpGt4ufSKmEJ3Xjd How Much is True?
        Program.countTrue(new boolean[]{false, false, true, false});

//  #25 https://edabit.com/challenge/vFLhYANAZQGKTtxA2   (Adding Numbers)
        Program.NumericString.add("555", "666");
//  #26 https://edabit.com/challenge/SQC525f4Wqn6F4LNC   Get the Sum of All Array Elements
        Program.arraySum(new int[]{45, 3, 0});

//  #27 https://edabit.com/challenge/B4HjZbBh9yuELmjna Area of a Triangle
        Program.triArea(5, 4);

//  #28 https://edabit.com/challenge/wmXdzBSsoT4QvEY3S
        Program.difference(new int[]{-5, 6, 18, 4, 16, -2});

        // #29 https://edabit.com/challenge/aWzxPLibBLJgn8AbZ  Exsist Higher
        existsHigher(new int[]{5, 3, 15, 22, 4}, 10);
//  #30  Has double letters
        Program.ExistsANumberHigher.Challenge.doubleLetters("yummy");

//  #31 https://edabit.com/challenge/hymPkXdhmDQLe87QT
        differenceMaxMin(new int[]{-70, 43, 34, 54, 22});

//  # 32 https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
        reverse("Think different.");

//  # 33 https://edabit.com/challenge/R3PnRquBPADEqDxZg
        getWord("reli", "able");

//  # 34
    calculateScores("ABC");
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

        //  # 24 https://edabit.com/challenge/vKpGt4ufSKmEJ3Xjd How Much is True?
        public static int countTrue(boolean[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++)
                if (arr[i] == true) count++;
            System.out.println(count);
            return count;

        }

        // #25 https://edabit.com/challenge/vFLhYANAZQGKTtxA2   (Adding Numbers)
        public class NumericString {
            public static String add(String a, String b) {
                try {
                    // return Integer.toString((Integer.parseInt(a) + Integer.parseInt(b)));  Another option for toString.
                    final var s = String.valueOf((Integer.parseInt(a) + Integer.parseInt(b)));
                    System.out.println(s);
                    return s;
                } catch (Exception e) {
                    return "Invalid Operation";
                }
            }
        }

        // #26    https://edabit.com/challenge/SQC525f4Wqn6F4LNC
        public static int arraySum(int[] arr) {
            int sum = IntStream.of(arr).sum();
            System.out.println(sum);
            return sum;
        }

        // #27    https://edabit.com/challenge/B4HjZbBh9yuELmjna Area of a Triangle
        public static int triArea(int base, int height) {
            int result = base * height / 2;
            System.out.println(result);
            return result;
        }
        // # 28 https://edabit.com/challenge/wmXdzBSsoT4QvEY3S  Maximum Difference
        public static int difference(Integer[] nums) {
            int min = Collections.min(Arrays.asList(nums));
            int max = Collections.max(Arrays.asList(nums));
            int minMaxTotal = min - max;
            System.out.println(minMaxTotal);
                    return minMaxTotal;
        }
// 0r we can SORT it and add the first and last elements of the array.
            public static int difference(int[] nums) {
               Arrays.sort(nums);
               int min = nums[0];
               int max = nums[nums.length-1];
               int totalMinMax = min - max;
               System.out.println(totalMinMax);
                     return totalMinMax;
        }
        //   #29    https://edabit.com/challenge/aWzxPLibBLJgn8AbZ  Exists A Number Higher
        public class ExistsANumberHigher {
            public static boolean existsHigher(Integer[] arr, int n) {
                int max = Collections.max(Arrays.asList(arr));
                if (n > max) return true;
                else if (n < max || arr == null) {
                    return false;
                }
                return false;
            }

            //   #30  Has double letters
            public class Challenge {
                public static boolean doubleLetters(String word) {
                    for (int i = 1; i < word.length() - 1; i++) {
                        if (word.charAt(i - 1) == word.charAt(i)) {
                            return true;
                        }
                    }
                    return false;
                }
            }

            //  #31 https://edabit.com/challenge/hymPkXdhmDQLe87QT
            //public class difference {
                public static int differenceMaxMin(int[] arr) {
                    int smallest = arr[0];
                    int biggest = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] > biggest)
                            biggest = arr[i];
                        else if (arr[i] < smallest)
                            smallest = arr[i];
                    }
                    System.out.println(biggest - smallest);
                    return biggest;
                }

                // # 32 https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
                public static String reverse(final String str) {
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse = reverse + str.charAt(i);
                    }
                    return reverse;
                }
            }
            //   return string[::-1]  Python

        }
        // #33 https://edabit.com/challenge/R3PnRquBPADEqDxZg
        //public class Challenge {
                public static String getWord(String left, String right) {
                    return left.substring(0,1).toUpperCase() + left.substring(1) + right;
                }
        // #34
        public static int[] calculateScores(String str) {
            int[] score= new int[3];
            score = new int[]{0,1,2};
            for (char c: str.toCharArray()) {
                switch(c){
                    case 'A':
                        score[0]++;break;
                    case 'B':
                        score[1]++;break;
                    case 'C':
                        score[2]++;break;
                    }
                }
            System.out.println(Arrays.toString(score));
            return score;
        }
/* def calculate_scores(txt):
    return [txt.count('A'),txt.count('B'),txt.count('C')] */
    }








//https://www.google.com/search?q=convert+int+to+string&rlz=1C1PRFI_enUS986US986&oq=convert+int+to+string&aqs=chrome..69i57j0i512l9.5754j0j15&sourceid=chrome&ie=UTF-8
//  parseInt(String s) − This returns an integer (decimal only).
// parseInt(int i) − This returns an integer, given a string representation of decimal, binary, octal, or hexadecimal (radix equals 10, 2, 8, or 16 respectively) numbers as input.
// if append with a "+ "" string it automatically converts to string










   // public static Currency getInstance(String currencyCode);
   //public static Currency getInstance(Locale locale);









