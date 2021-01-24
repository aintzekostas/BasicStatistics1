package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Calculate mean method
    static void CalculateMean(int n, int arr[]){
        float mean = 0, numerator = 0, denumerator = n;

        for(int i = 0; i< n; i++){
            numerator += arr[i];
        }

        mean = numerator/denumerator;
        System.out.println("Mean: " + mean);
    }

    //Calculate median method
    static void CalculateMedian(int n, int arr[]) {
        //Sorts array in ascending order
        Arrays.sort(arr);
        double median = 0.0;

        //Checks if the size of the array is even or odd
        if(n%2 == 0){
            median = (arr[(n/2)-1] + arr[(n/2)])/2.0;
        }
        else{
            median = arr[(n/2)];
        }

        System.out.println("Median: " + median);
    }

    //Calculate median method
    static void CalculateMode(int n, int arr[]) {
        //New array to keep the frequency of each element of arr
        int freqs[] = new int[n];
        int freqCounter = 0;
        int mode = 0;

        //Calculates frequency of appearance of each element in arr
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    freqCounter += 1;
                }
            }
            freqs[i] = freqCounter;
            freqCounter = 0;
        }

        boolean isAllUnique = false;
        for(int i = 0; i < n; i++){
            if(freqs[i]==1){
                isAllUnique = true;
            }
            else{
                isAllUnique = false;
            }
        }

        //If each item is unique return the first item as mode else return the one with the greater frequency
        if(isAllUnique){
            mode = arr[0];
        }
        else{
            int maxIndex=0;

            for(int i = 0; i < n; i++){
                for(int j = i + 1; j<n-1; j++){
                    if(freqs[i] > freqs[j]){
                        maxIndex = i;
                    }
                    else if(freqs[i]<freqs[j]){
                        maxIndex = j;
                    }
                }
            }
            mode = arr[maxIndex];
        }

        System.out.println("Mode: " + mode);

    }


    public static void main(String[] args) throws FileNotFoundException {
        int inCounter=0;
        Scanner scan = new Scanner(new File("src/input.txt"));
        int n = scan.nextInt();
        System.out.println("Number of integers: " + n);
        //Checks if document contains string "EOF"
        while(scan.hasNext()){
            if(scan.next()=="EOF"){
                break;
            }
            inCounter += 1;
        }
        System.out.println(inCounter);


        if(n != inCounter-1){
            System.out.println("The first integer in input.txt must be equal to the (total number of integers - 1)");
            scan.close();
        }
        else{
            Scanner scan2 = new Scanner(new File("src/input.txt"));
            n = scan2.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i< n; i++){

                arr[i] = scan2.nextInt();
            }
            // Get the String representation of array
            String stringArr = Arrays.toString(arr);

            // print the String representation
            System.out.println("Array: " + stringArr);

            scan.close();

            //calculate mean
            CalculateMean(n, arr);

            //calculate Median
            CalculateMedian(n,arr);

            //Calculate Mode
            CalculateMode(n,arr);
        }

    }

}
