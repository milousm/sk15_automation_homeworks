import java.util.Arrays;
import java.util.HashSet;

public class Homework_6_Methods_In_Java {

    public static void main(String[] args){

        System.out.println("Smallest number is : " + findSmallestNumber(6, 8, 5));
        System.out.println("The average is : " + findAverage(6, 8, 5));
        findMiddleChar("Random text here");
        findMiddleChar("abc abc abc");
        System.out.println("The word count in the text is : " + countAllWords("Just some random lorem ipsum") );
        int[] arr = {5, 2, 8, 9};
        System.out.println("The second largest number is : " + findSecondLargest(arr));
        int[] array = {1, 1, 2, 3, 3, 4, 5, 6, 6, 7};
        System.out.println("The unique array will be : " + Arrays.toString(removeDuplicates(array)));
        findLastCharacter("Some random lorem ipsum");
        findLastCharacter("");
        System.out.println("The number is even? : " + isEven(8));
        System.out.println("The number is even? : " + isEven(7));
        System.out.println("The number is palindrome? : " + findIfPalindrome(123));
        System.out.println("The number is palindrome? : " + findIfPalindrome(12321));
    }


// Write a Java method to find the smallest number among three numbers

    public static int findSmallestNumber (int num1, int num2, int num3){

        int smallestNum = num1;

        if(smallestNum > num2){
            smallestNum = num2;
        }

        if(smallestNum > num3){
            smallestNum = num3;
        }
        return smallestNum;

    }

// Write a Java method to compute the average of three numbers

    public static int findAverage (int num1, int num2, int num3){
        int sum = num1 + num2 +num3;
        int average = sum / 3;

        return average;

    }

// Write a Java method to display the middle character of a string:

    public static void findMiddleChar(String text){

        int position;
        int length;

        //a) If the length of the string is even there will be two middle characters.
        if (text.length() % 2 == 0) {
            position = text.length() / 2 - 1;
            length = 2;

        } else {
         //b) If the length of the string is odd there will be one middle character.
            position = text.length() / 2;
            length = 1;
        }

        System.out.println("The middle charatcter/s is : " + text.substring(position, position + length));
    }

// Write a Java method to count all words in a string.

    public static int countAllWords(String text) {
        text = text.trim();
        int count = 0;
        int textLength = text.length();

        if (textLength > 1) {
            count++;

            for (int i = 1; i < textLength; i++) {
                if (text.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        return count;
    }

// Write a Java method to find the second-largest number in an array of integers.

    public static int findSecondLargest(int[] numbers){

        int secondLargest = 0;

        if (numbers.length < 2) {
            return secondLargest;
        }

        int largest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

// Write a Java method to remove duplicate elements from an array of numbers and return a new array with only unique elements.

    public static int[] removeDuplicates(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        int[] result = new int[uniqueNumbers.size()];
        int index = 0;
        for (int num : uniqueNumbers) {
            result[index++] = num;
        }

        return result;
    }

// Write a Java method to display the last character of a string. If the string is empty, display a message indicating that there is no last character.

    public static void findLastCharacter(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("The string is empty, no last character to display.");
        } else {
            char lastChar = input.charAt(input.length() - 1);
            System.out.println("The last character is: " + lastChar);
        }
    }

// Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

// A takes as input a non-negative integer and returns true if the number is a palindrome

    public static boolean findIfPalindrome(int num) {
        int remainder;
        int sum = 0;

        if (num >= 0) {
            int palindrome = num;

            while (palindrome > 0) {
                remainder = palindrome % 10;
                sum = (sum * 10) + remainder;
                palindrome = palindrome / 10;
            }
            return num == sum;
        } else {
            System.out.println("The integer must be non-negative!");
            return false;
        }
    }

}









