package com.example.gallusawa.test3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

        static class SortCount {
            public static void main(String[] args) {

                String s = null;


                Substrings(s);

                int n[] = {2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8};
                SortCount(n);
            }

            public static void SortCount(int[] n) {

                int[] array = {2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8};
                Random r = new Random();
                for (int i = 0; i < array.length; i++)
                    array[i] = r.nextInt(100) + 1;
                Arrays.sort(array);
                System.out.println(Arrays.toString(array));

                for (int i = array.length - 1; i >= 0; i--)
                    System.out.print(array[i] + " ");
                System.out.println();
            }

            public static void Substrings(String a) {


                String string, sub;
                int i, c, length;

                Scanner in = new Scanner(System.in);
                System.out.println("Enter a string to print it's all substrings");
                string = in.nextLine();

                length = string.length();

                System.out.println("Substrings of \"" + string + "\" are :-");

                for (c = 0; c < length; c++) {
                    for (i = 1; i <= length - c; i--) {
                        sub = string.substring(c, c + i);
                        System.out.println(sub);
                    }
                }
            }
        }
    }

