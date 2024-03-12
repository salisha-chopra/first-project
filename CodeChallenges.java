import java.math.BigInteger;
import java.util.*;
public class CodeChallenges {
    public static void main(String[] args){
        String statement1 = "Canada is a cold country";
        String statement2 = "Canada is a cold |$^&*&*(**";
        String statement3 = "";
        String statement4 = null;
        String statement5 = "^&&%%^ #@ $ |&*# |$^&*&*(**";
        String statement6 = "I wouldn't be back to Ottawa";
        String statement7 = "pi: 3.14717";
        System.out.println(getLongestWord(statement1));
        System.out.println(getLongestWord(statement2));
        System.out.println(getLongestWord(statement6));
        System.out.println(getLongestWord(statement7));
        System.out.println(getLongestWord(statement3));
        System.out.println(getLongestWord(statement4));
        System.out.println(getLongestWord(statement5));
        /*Scanner sc = new Scanner(System.in);
        String ch = " ";
        int opt = 0;
        System.out.println("1: Find longest word");
        System.out.println("2: Find Factorial");
        System.out.println("3: Reverse a string");
        System.out.println("4: Compare string by sum of characters");
        System.out.println("5: Count instances of character in a string");
        System.out.println("6: Minimum value in array");
        System.out.println("7: check if given string is palindrome or not");
        System.out.println("8: Reverse an array with numbers");
        System.out.println("9: Find occurrence of a number in another number");
        System.out.println("10: find fibonacci for the given terms");
        System.out.println("11: Check if given number is Armstrong number or not");
        System.out.println("12: Check if given number is Perfect number or not");
        System.out.println("13: print abundant numbers");
        System.out.println("14: print Ulam sequence");


        System.out.print("Please select one of the options ");
        try {
                opt = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println(e);
            }

       switch (opt) {
                case 1:

                    System.out.println("longest word: "+longestWord("Hello, world! This is " +
                            "a simple test sentence."));
                    System.out.println("longest word: "+longestWord("The quick brown fox " +
                            "jumps over the lazy dog."));
                    System.out.println("longest word: "+longestWord("Antidisestablishmentarianism" +
                            " is a long word."));
                    System.out.println("longest word: "+longestWord("This test includes numbers like 12345 " +
                            "and special characters @#$%^&*."));
                    System.out.println("longest word: "+longestWord("H!e.l,l-o W'o''r\"\"l'd"));
                    System.out.println("longest word: "+longestWord(",.?!@#$%^&*()"));
                    System.out.println("longest word: "+longestWord(","));
                    System.out.println("longest word: "+longestWord(""));


                    break;
                    case 2:
                    System.out.println("enter number to find factorial for ");
                    int n=0;
                    try{
                        n = Integer.parseInt(sc.nextLine());
                        System.out.println("factorial is: "+factorialCalculation(n));
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    break;
                case 3:
                    System.out.println("enter the string to reverse ");
                    String str = sc.nextLine();
                    System.out.println("Reverse string is : "+stringReverse(str));
                    break;
                case 4:
                    System.out.println("enter first string ");
                    String strFirst = sc.nextLine();
                    System.out.println("enter second string ");
                    String strSecond = sc.nextLine();
                    System.out.println("Are strings same in size : "+stringCompareLength(strFirst,strSecond));
                    break;
                case 5:
                    System.out.println("enter string ");
                    String s = sc.nextLine();
                    System.out.println("enter character to search ");
                    String search = sc.nextLine();
                    System.out.println("Character occurrence is : "+stringCharacterOccurrence(s,search));
                    break;
                case 6:
                    int size = 0;
                    try {
                        System.out.println("Enter size of the array");
                        size = Integer.parseInt(sc.nextLine());
                        float[] arr = new float[size];
                        System.out.println("enter array values");
                        for(int i=0; i < size ; i++) {
                            System.out.print("enter the value at index: " + (i+1));
                            arr[i] = Float.parseFloat(sc.nextLine());
                        }
                        System.out.println("Smallest number is: " +smallestNumberInArray(size,arr));
                    }catch (Exception e){
                        System.out.println(e);
                    }

                    break;
                case 7:
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("A man, a plan, " +
                            "a canal, Panama!"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("Madam, in Eden, " +
                            "I'm Adam.!"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("A Santa at NASA."));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("Was it a car or a" +
                            " cat I saw?"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("No lemon, no melon."));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("This is not a " +
                            "palindrome."));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("The quick brown fox " +
                            "jumps" +
                            " over the lazy dog."));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("Palindrome is spelled " +
                            "P-A-L-I-N-D-R-O-M-E."));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("Level"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("Civic"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("radar"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("kayak"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("hello"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("Programming"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("world"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome("example"));
                    System.out.println("Is the provided string palindrome " +isStringPalindrome(""));
                break;
                case 8:
                    int[] arrayToReverse = {25,23,26,12,45,68,58,24,27,13};
                    if(arrayToReverse.length == 10) {
                        reverseArray(arrayToReverse);
                        for(int updatedValue : arrayToReverse) {
                            System.out.print(updatedValue + " ");
                        }
                    } else {
                        System.out.print("Array should have 10 elements only");
                    }

                break;
                case 9:
                    System.out.println("The occurrence of the number in another number is: " +
                            countOccurrenceOfNumber(43423, 4));
                    System.out.println("The occurrence of the number in another number is: " +
                            countOccurrenceOfNumber(2147483647, 4));
                    System.out.println("The occurrence of the number in another number is: " +
                            countOccurrenceOfNumber(43423, 8));
                    System.out.println("The occurrence of the number in another number is: " +
                            countOccurrenceOfNumber(0, 0));
                    System.out.println("The occurrence of the number in another number is: " +
                            countOccurrenceOfNumber(9, 9));
                    System.out.println("The occurrence of the number in another number is: " +
                            countOccurrenceOfNumber(9, 1));
                    System.out.println("The occurrence of the number in another number is: " +
                            countOccurrenceOfNumber(-43423, 8));
                    System.out.println("The occurrence of the number in another number is: " +
                            countOccurrenceOfNumber(-43423, 2));
                    break;
                case 10:
                    System.out.println("Below are the fibonacci values");
                    getFibonacciNumbers(5);
                    System.out.println();
                    getFibonacciNumbers(8);
                    System.out.println();
                    getFibonacciNumbers(10);
                    System.out.println();
                    getFibonacciNumbers(0);
                    System.out.println();
                    getFibonacciNumbers(1);
                    System.out.println();
                    getFibonacciNumbers(31);

                    break;
                case 11:
                    System.out.println("The given number is armstrong: " +checkIfNumberIsArmstrong(153));
                    System.out.println("The given number is armstrong: " +checkIfNumberIsArmstrong(128));
                    System.out.println("The given number is armstrong: " +checkIfNumberIsArmstrong(9));
                    System.out.println("The given number is armstrong: " +checkIfNumberIsArmstrong(1634));
                break;
                case 12:
                    System.out.println("The given number is perfect: "+isPerfectNumber(6));
                    System.out.println("The given number is perfect: "+isPerfectNumber(28));
                    System.out.println("The given number is perfect: "+isPerfectNumber(496));
                    System.out.println("The given number is perfect: "+isPerfectNumber(8128));
                    System.out.println("The given number is perfect: "+isPerfectNumber(130816));
                    System.out.println("The given number is perfect: "+isPerfectNumber(5));
                    System.out.println("The given number is perfect: "+isPerfectNumber(12));
                    System.out.println("The given number is perfect: "+isPerfectNumber(100));
                    System.out.println("The given number is perfect: "+isPerfectNumber(-2));
                    System.out.println("The given number is perfect: "+isPerfectNumber(-100));
                    break;
                case 13:
                    printAbundantNumbers(20);
                    System.out.println();
                    printAbundantNumbers(40);
                    System.out.println();
                    printAbundantNumbers(100);
                    System.out.println();
                    printAbundantNumbers(200);
                    //System.out.println();
                    //printAbundantNumbers(1000);
                    break;
                case 14:
                    generateUlamSequence(5);
                    System.out.println();
                    generateUlamSequence(2);
                    System.out.println();
                    generateUlamSequence(4);
                    System.out.println();
                    generateUlamSequence(10);
                    System.out.println();
                    generateUlamSequence(25);
                    System.out.println();
                    generateUlamSequence(114);
                    System.out.println();
                    generateUlamSequence(1145);
                    System.out.println();
                    generateUlamSequence(7);
                    System.out.println();
                    generateUlamSequence(15);
                    break;

                default:
                    System.out.println("invalid option");
                    break;
            }*/

       // System.out.println("Maximum and minimum temperature");
       // getMinAndMaxTemperature(new double[]{5.0, 11.0, 12.5, -2.0, 3.6, -4.3 ,9.0});
       // System.out.println();
      //  getMinAndMaxTemperature(new double[]{5.0});
      //  System.out.println();
      //  getMinAndMaxTemperature(new double[]{});
      //  System.out.println();
     //   getMinAndMaxTemperature(new double[]{10.0 ,11.3 ,4.5, -2.0 ,3.6, -3.3, 0.0});
      //  System.out.println();

     //   System.out.println("Array partition");
       // System.out.println(canPartitionArray(new int[]{-1, -10, 1, -2, 20})); //false
    //    System.out.println(canPartitionArray(new int[]{-1, -20, 5, -1, -2, 2})); //true
    //    System.out.println(canPartitionArray(new int[]{2, 8, 4, 1})); //true;

     //   System.out.println(canPartitionArray(new int[]{1, 1, -1, 1})); //false
        //System.out.println(canPartitionArray(new int[]{-1, -1, 1, 1})); //true

       // System.out.println(canPartitionArray(new int[]{0, 5, 1, -1})); //false
       // System.out.println(canPartitionArray(new int[]{0, 1, 1, -1})); //false

       // System.out.println(canPartitionArray(new int[]{0, 1, 1, 1}));//false

       // System.out.println(canPartitionArray(new int[]{0, 0, 1, 1})); //true

      //  System.out.println(canPartitionArray(new int[]{0, 0, 1})); //true

      //  System.out.println(canPartitionArray(new int[]{0, 0, 0})); //true

      //  System.out.println(canPartitionArray(new int[]{5, 5, 25, 100})); //false

     //   System.out.println(canPartitionArray(new int[]{-1, 5, 20, 100})); //false

      //  System.out.println(canPartitionArray(new int[]{1, 1, 1, 1})); //true

     //   System.out.println(canPartitionArray(new int[]{-1, 1, -1})); //true

     //   System.out.println(canPartitionArray(new int[]{-1, 1, 1})); //false

     //   System.out.println("Print Fizz Buzz");
     //   System.out.println(fizzBuzz(3));
     //   System.out.println(fizzBuzz(5));
     //   System.out.println(fizzBuzz(15));
    //    System.out.println(fizzBuzz(10));
    //    System.out.println(fizzBuzz(98));

     //   System.out.println("check if year is leap year or not");
     //   System.out.println(isLeapYear(2016));
     //   System.out.println(isLeapYear(1996));
     //   System.out.println(isLeapYear(1600));
     //   System.out.println(isLeapYear(2020));
      //  System.out.println(isLeapYear(2008));
      //  System.out.println(isLeapYear(1521));
      //  System.out.println(isLeapYear(1800));
      //  System.out.println(isLeapYear(2007));
    //    System.out.println(isLeapYear(2002));
     //   System.out.println(isLeapYear(1979));
     //   System.out.println(isLeapYear(2006));

     //   System.out.println("Profitable gamble");
       // System.out.println(profitableGamble(0.2,50,9)); //true
     //   System.out.println(profitableGamble(0.9,3,2)); //true
      //  System.out.println(profitableGamble(0.33,10,3.30)); //true
      //  System.out.println(profitableGamble(0.1,1000,7)); //true
    //    System.out.println(profitableGamble(0.9,1,2)); //false
     //   System.out.println(profitableGamble(0,100,0.1)); //false
     //   System.out.println(profitableGamble(0,0,0)); //false

       // System.out.println("Max profit");
       // System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
       // System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        //System.out.println(maxProfit(new int[]{15,3,3,1,8,11,12,11,1}));

        System.out.println("Email validation");
        System.out.println("Is email valid: "+isValidEmail("a@b.e"));  // true
        System.out.println("Is email valid: "+isValidEmail("abcde.edcba@a.b.c.d.e"));  // true

        // Invalid emails
        System.out.println("Is email valid: "+isValidEmail("@a.a"));  // false
        System.out.println("Is email valid: "+isValidEmail("abc.cd@aaaabc"));  // false
        System.out.println("Is email valid: "+isValidEmail("a.b@c.d@e.e"));  // false
        System.out.println("Is email valid: "+isValidEmail("aa..aa@a.a"));  // false
        System.out.println("Is email valid: "+isValidEmail("abc@d.e.f"));  // false
        System.out.println("Is email valid: "+isValidEmail("abc.@a.a"));  // false
        System.out.println("Is email valid: "+isValidEmail("abc@a.a."));  // false
        System.out.println("Is email valid: "+isValidEmail("abc@a.a"));  // true
        System.out.println("Is email valid: "+isValidEmail("abc@abcde.edcba"));  // true
        System.out.println("Is email valid: "+isValidEmail("a@b.c.d.e.f"));  // false
        System.out.println("Is email valid: "+isValidEmail("abc@..a"));  // false
        System.out.println("Is email valid: "+isValidEmail("abc@abc.."));  // false
        System.out.println("Is email valid: "+isValidEmail("abc@abc."));  // false

        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";
        if(input == null || input.isEmpty()) {
            System.out.println("enter a valid input");
        } else {
            allStringPermutations(input,output);
        }
    }
    public static String getLongestWord(String statement){
        if(statement == null || statement.isEmpty()  ) {
            return "given string is empty";
        }
        String longestWord = "";
        String[] strArr = statement.split(" ");
        if(strArr.length == 1) {
            longestWord = statement;
            if(isPunctuationWord(longestWord)) {
                return "there is only one string that is a puntuation string";
            }
            return longestWord;
        }

        int count = 0 , statementLen = statement.length();
        int max = Integer.MIN_VALUE ;
        String newStr = "";
        int position=0;

        for( int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > max) {
                max = strArr[i].length();
                position = i;
            }
        }
        longestWord = strArr[position];

        if(isPunctuationWord(longestWord)) {
            String[] tempArray = new String[strArr.length-1];
            for(int k = 0, i = 0; k < strArr.length; k++) {
                if(k == position) {
                    continue;
                }
                tempArray[i++] = strArr[k];

            }
            strArr = tempArray;
            String newString = convertToString(strArr);
            //System.out.println(newString);
            longestWord = getLongestWord(newString);
        }
        return longestWord;


    }

    public static String convertToString(String[] array) {
        String converted = "";
        for(int i = 0; i < array.length; i++) {
            converted += array[i] + " ";
        }
        return converted.trim();
    }
    public  static boolean isPunctuationWord(String word) {
        int punctuationCount = 0;
        char[] charArray = word.toCharArray();
        for(int j = 0; j < charArray.length; j++) {
            char c = charArray[j];
            if ((c >= ':' &&  c <= '@') ||  (c >= '!' && c <= '/') ||
                    (c >= '[' && c <= '`') || (c >= '{' && c <= '~')) {
                punctuationCount++;
            }
        }
        return punctuationCount == word.length();
    }


    public static long factorialCalculation(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        long fact = 1;
        if(num > 0 && num <= 20) {
            for(int i = 1;i <= num; i++) {
                fact *= i;
            }
        }else {
            System.out.println("The maximum number long supports to provide correct factorial value is 20");
            fact = -1;
        }

        return fact;
    }

        public static String stringReverse(String s){
        int sLen = s.length();
        if(s == null || s.isEmpty())
            return "invalid string";
        if(sLen == 1)
            return s;
        char[] tempArray = s.toCharArray();
        int first = 0,  mid = (first + sLen - 1) / 2, last = sLen-1;
        char temp;
        for(int i = first ; i <= mid ; i++) {
            temp = tempArray[i];
            tempArray[i] = tempArray[ last - i ];
            tempArray[last - i] = temp;

        }
        String stringReverse = new String(tempArray);
        return stringReverse;
    }
        public static boolean stringCompareLength(String first , String second){
            if(first.isEmpty() || second.isEmpty()){
                return false;
            }
            char[] tempFirst = first.toCharArray();
            char[] tempSecond = second.toCharArray();
            return tempFirst.length == tempSecond.length;
        }
        public static int stringCharacterOccurrence(String s,String search){
            int charCount = 0;
            if(!s.isEmpty() && !search.isEmpty()) {
                char searchChar = search.charAt(0);
                char[] tempArr = s.toCharArray();
                for(int i = 0; i < tempArr.length; i++)
                {
                    if(searchChar == tempArr[i]){
                        charCount += 1;
                    }
                }
            }
            return charCount;
        }
        public static float smallestNumberInArray(int size,float[] arr){

            if(size == 1) {
                return arr[0];
            }
            float min = arr[0];
            for(int i = 1 ; i < size; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }
        public static boolean isStringPalindrome(String str) {
            if(str == null || str.isEmpty()) {
                return false;
            }
            if(str.length() == 1) {
                return true;
            }
            char[] tempArray = str.toCharArray();
            int last = tempArray.length - 1;
            int i=0;
            while ( i <= last) {
                if(Character.toLowerCase(tempArray[i]) == Character.toLowerCase(tempArray[last])) {
                    i++;
                    last--;
                } else if(!Character.isLetter(tempArray[i])) {
                    i++;
                }else if(!Character.isLetter(tempArray[last])) {
                    last--;
                }else {
                    return false;
                }
            }
            return true;
        }
        public static void reverseArray(int[] arr) {

                int first = 0, last = arr.length - 1;
                for(int i = first; i < (first + last)/2; i++) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[last-i];
                    arr[last-i] = temp;
                }

        }
        public static int countOccurrenceOfNumber(long number, int numberToSearch) {
            long temp = Math.abs(number);
            int rem;
            int countOccurrence=0;
            if(temp >= 0 && temp <= 9) {
                if(temp == numberToSearch) {
                    countOccurrence += 1;
                }
            } else {
                while (temp != 0) {
                    rem = (int)temp % 10;
                    if(rem == numberToSearch){
                        countOccurrence += 1;
                    }
                    temp /= 10;
                }
            }
            return countOccurrence;
        }
        public static void getFibonacciNumbers(int terms) {
            if(terms > 0) {
                long previous = 0, next = 1, curr;
                for(int i = 1; i <= terms; i++) {
                    System.out.println(previous);
                    curr = previous + next;
                    previous = next;
                    next = curr;
                }
            }else {
                System.out.println("No fibonacci sequence for "+terms);
            }
        }
        public static boolean checkIfNumberIsArmstrong(int number) {
            int temp = Math.abs(number);
            long sum = 0;
            long pow;
            if(temp >= 1 && temp <= 9) {
                sum = (long)Math.pow(temp,1) ;
            }else {
                int countDigits = calculateDigits(temp);
                long rem;
                while (temp != 0) {
                    rem = temp % 10;
                    pow = 1;
                    for(int i = 1; i <= countDigits ;i++) {
                        pow *= rem;
                    }
                    sum += pow ;
                    temp /= 10;
                }
            }
            return sum == number;
        }
        private static int calculateDigits(int num) {
            int temp = num, count = 0;
            while (temp != 0) {
                int rem = temp % 10;
                count += 1;
                temp /= 10;
            }
            return count;
        }
        public static boolean isPerfectNumber(int number) {
            long sum = 0;
            if(number <= 1) {
                return false;
            }
            for (int i = 1; i <= number / 2; i++) {
                if(number % i == 0) {
                        sum += i;
                }
            }
            return sum == number;
        }
        public static void printAbundantNumbers(int limit) {
            if(limit <= 1) {
                System.out.println("does not have abundant numbers");
            }
            for(int i = 2 ; i <= limit; i++) {
                long sum=0;
                for(int j = 1; j <= i / 2; j++) {
                    if(i % j == 0) {
                        sum += j;
                    }
                }
                if(sum > i) {
                    System.out.print(i + " ");
                }
                sum = 0;
            }
        }

        public static void generateUlamSequence(int num) {
            int temp = num;
            if(temp > 1) {
                while(temp != 1) {
                    if(temp % 2 == 0) {
                        temp /= 2;
                        if(temp != 1) {
                            System.out.print(temp + "->");
                        } else {
                            System.out.print(temp) ;
                        }

                    } else if(temp % 2 != 0) {
                        temp = (3 * temp) + 1;
                        System.out.print(temp + "->");
                    }
                }
            }
        }

        public static void getMinAndMaxTemperature(double[] tempArray) {
            if(tempArray.length == 0) {
                System.out.println("invalid input");

            } else {
                double minTemp = tempArray[0];
                double maxTemp = tempArray[0];
                for(int i = 1; i < tempArray.length ; i++) {
                    if(tempArray[i] < minTemp) {
                        minTemp = tempArray[i];
                    }
                    if(tempArray[i] > maxTemp) {
                        maxTemp = tempArray[i];
                    }
                }
                System.out.printf("Maximum : %.1f%nMinimum : %.1f", maxTemp, minTemp);
            }
        }
        public static String fizzBuzz(int n) {
            if(n % 3 == 0 && n % 5 == 0) {
                return "FizzBuzz";
            } else if(n % 3 == 0 ) {
                return "Fizz";
            } else if(n % 5 == 0) {
                return "Buzz";
            } else {
                return Integer.toString(n);
            }
        }
        public static boolean isLeapYear(int year) {
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            }
            return false;
        }
        public static boolean profitableGamble(double prob, double prize, double pay) {
            return prob * prize > pay;
        }


    public static int maxProfit(int[] prices) {
        if(prices.length <= 0) {
            return 0;
        }
        int minBuy = prices[0];
        int maximumProfit = 0;
        for(int i = 1; i < prices.length ; i++) {
            if(minBuy > prices[i]) {
                minBuy = prices[i];
            }
            int maxBuy = prices[i] - minBuy;
            maximumProfit = Math.max(maxBuy, maximumProfit);


        }
        return maximumProfit;
    }
    public static boolean canPartitionArray(int[] arr) {
        if(arr.length == 0) {
            System.out.println("Enter a valid array");
            return false;
        }
        for(int i = 0; i < arr.length; i++) {
            int product = 1;
            for(int j = 0; j < arr.length; j++) {
                if(i != j) {
                    product *= arr[j];
                }
            }
            if(product == arr[i]) {
                return true;
            }
        }
        return false;
    }
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("not a valid email string");
            return false;
        }
        int atCount = 0;
        int dotCount = 0;
        int atIndex = 0;
        char[] emailCharArray = email.toCharArray();
        for (int i = 0; i < emailCharArray.length; i++) {
            if (i == 0 || i == emailCharArray.length - 1) {
                if (emailCharArray[i] == '@' || emailCharArray[i] == '.') {
                    return false;
                }
            }
            if (emailCharArray[i] == '@') {

                if (emailCharArray[i - 1] == '.' || emailCharArray[i + 1] == '.') {
                    return false;
                }
                atCount += 1;
                if (atCount > 1) {
                    return false;
                }
            }
            if (emailCharArray[i] == '.') {
                if (emailCharArray[i-1] == '.' || emailCharArray[i+1] == '.') {
                    return false;
                }
                if(atCount == 1) {
                    dotCount++;
                }
            }
            if (!(emailCharArray[i] >= 'a' && emailCharArray[i] <= 'e') &&
                    emailCharArray[i] != '@' && emailCharArray[i] != '.' ) {
                return false;
            }
        }
        return atCount == 1 && dotCount >= 1;
    }

    public static void allStringPermutations(String input, String output) {

        if(input.isEmpty()) {
            String finalPermutation = output;
            System.out.print(finalPermutation + " ");

        }
        for(int i = 0; i < input.length(); i++) {

            String newInput = input.substring(0,i) + input.substring(i+1);
            String newOutput = output + input.charAt(i);
            allStringPermutations(newInput, newOutput);
        }
    }
}


