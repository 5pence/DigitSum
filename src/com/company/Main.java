package com.company;

public class Main {

    public static void main(String[] args) {
        printSquareStar(114);
    }

    public static void printSquareStar(int number) {
        if (number >= 5) {
            for (int i = 0; i < number; i++) {
                for (int j= 0; j < number; j++) {
                    if (i == 0 || j == 0 || i == j || i == number - 1 || j == number - 1 || i + j == number - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int sumDigits(int number) {
        if (number > 10) {
            int sum = 0;
            while (number >= 1) {
                sum += number % 10;
                number = number / 10;
            }
            return sum;
        }
        return -1;
    }

    public static boolean isPalindrome(int number) {
        int num = number;
        int reversenum =0;
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }
        return (number == reversenum);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int firstNum = number % 10;
            int lastNum = firstNum;
            do {
                firstNum = number % 10;
                number = number / 10;
            } while (number != 0);
            return firstNum + lastNum;
        }
        return -1;
    }

    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            int sum = 0;
            do {
                int tempus;
                tempus = number % 10;
                if (tempus % 2 == 0) {
                    sum += tempus;
                }
                number = number / 10;
            }while (number > 1);
            return sum;
        }
        return -1;
    }

    public static boolean hasSharedDigit(int one, int two) {
        if (one > 9 && one < 100 && two > 9 && two < 100) {
            int oneone, onetwo, twoone, twotwo;
            oneone = one / 10;
            onetwo = one % 10;
            twoone = two / 10;
            twotwo = two % 10;
            return (oneone == twoone || oneone == twotwo || onetwo ==twoone || onetwo == twotwo);
        }
        return false;
    }

    public static boolean hasSameLastDigit(int one, int two, int three) {
        if (one > 9 && one < 1001 && two > 9 && two < 1001 && three > 9 && three < 1001) {
            int oneRight, twoRight, threeRight;
            oneRight = one % 10;
            twoRight = two % 10;
            threeRight = three % 10;
            return (oneRight == twoRight || oneRight == threeRight || twoRight == threeRight);
        }
        return false;
    }

    public static boolean isValid(int one) {
        return (one > 9 && one < 1001);
    }

    public static int getGreatestCommonDivisor(int one, int two) {
        if (one >= 10 && two >= 10) {
            int n = Math.max(one, two);
            for (int i=n/2; i > 1; i--) {
                System.out.println("try: " + i);
                if (two % i == 0 && one % i == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void printFactors(int number) {
        if (number > 0) {
            for (int i=1; i <= number ; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid Value");
        }

    }

    public static boolean isPerfectNumber(int one) {
        if (one > 0) {
            int sum = 0;
            for (int i= 1; i < one; i++) {
                if (one % i == 0) {
                    sum += i;
                }
            }
            return (one == sum);
        }
        return false;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int revNum = reverse(number);
        for (int i=0; i < getDigitCount(number); i++) {
            int n = revNum % 10;
            revNum = revNum / 10;
            switch (n) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number > 0) {
            int sum = 0;
            while (number > 0) {
                sum += 1;
                number = number / 10;
            }
            return sum;
        }
        if (number == 0) {
            return 1;
        }
        return -1;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        return (bigCount * 5 + smallCount >= goal && smallCount >= goal % 5);
    }

}
