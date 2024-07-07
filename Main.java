import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /////////// Task 1
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The given array is: ");
        printArray(arr);
        System.out.println("Are the first and last elements of the array the same? " + areFirstAndLastEqual(arr));

        ////////////////// Task 2
        System.out.print("\nEnter the length of the array: ");
        n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The given array is: ");
        printArray(arr);
        findNumbersGreaterThanAverage(arr);

        ///////////////// // Task 3
        System.out.print("\nEnter the length of the array: ");
        n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The given array is: ");
        printArray(arr);
        System.out.println("Larger value between first and last element: " + getLargerValue(arr));

        ///////////////// // Task 4
        System.out.print("\nEnter the length of the array: ");
        n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The given array is: ");
        printArray(arr);
        int[] newArr = swapFirstAndLast(arr);
        System.out.println("New array after swapping the first and last elements: ");
        printArray(newArr);

        ////////////////////// Task 5
        System.out.print("\nEnter the length of the array: ");
        n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The given array is: ");
        printArray(arr);
        int[] reorderedArr = placeOddBeforeEven(arr);
        System.out.println("Array with odd elements placed before even elements: ");
        printArray(reorderedArr);

        /////////////////////// Task 6
        System.out.print("\nEnter the length of the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the length of the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.println("Are the two arrays equal? " + areArraysEqual(arr1, arr2));

        scanner.close();
    }

    public static boolean areFirstAndLastEqual(int[] arr) {
        return arr.length >= 2 && arr[0] == arr[arr.length - 1];
    }

    public static void findNumbersGreaterThanAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("The average of the said array is: " + average);
        System.out.print("The numbers in the said array that are greater than the average are: ");
        boolean firstNum = true;
        for (int num : arr) {
            if (num > average) {
                if (!firstNum) {
                    System.out.print(", ");
                }
                System.out.print(num);
                firstNum = false;
            }
        }
        System.out.println();
    }

    public static int getLargerValue(int[] arr) {
        return Math.max(arr[0], arr[arr.length - 1]);
    }

    public static int[] swapFirstAndLast(int[] arr) {
        int[] newArr = new int[arr.length];
        newArr[0] = arr[arr.length - 1];
        newArr[arr.length - 1] = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int[] placeOddBeforeEven(int[] arr) {
        int[] reorderedArr = new int[arr.length];
        int oddIndex = 0;
        int evenIndex = arr.length - 1;
        for (int num : arr) {
            if (num % 2 == 0) {
                reorderedArr[evenIndex--] = num;
            } else {
                reorderedArr[oddIndex++] = num;
            }
        }
        return reorderedArr;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}