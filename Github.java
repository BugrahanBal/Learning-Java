package com.example.githubproject;

import android.database.sqlite.SQLiteCantOpenDatabaseException;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Github {

    public static void main(String[] args)  {

        /*Scanner principal1 = new Scanner(System.in);
        System.out.print("Principal : ");
        int principal2 = principal1.nextInt();

       */ Scanner annual1 = new Scanner(System.in);
        System.out.print("Annual Interest Rate : ");
        double annual2 = annual1.nextDouble();
        System.out.println(annual2);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String  annual3 = percent.format(annual2/100);
        System.out.println(annual3);
        /*
        int annual4 = Integer.parseInt(annual3.getPercent().toString());


        Scanner year1 = new Scanner(System.in);
        System.out.print("Period(Years) : ");
        int year2 = year1.nextInt();*/


        //int[] myStringArray = {3,4,5};
        //System.out.println(Arrays.toString(myStringArray));

        /*int a =5;
        //System.out.println(Arrays.toString(a));

        int[] int_array = new int[31];

        for (int i=0; i<30; i++) {
            int_array[i] = i + 1;
        }

        System.out.println(int_array[30]);*/

        Scanner giris = new Scanner(System.in);
        int girilen_sayi;
        String girilen_yazi;


        System.out.print("rakam giriniz : ");
        girilen_sayi = giris.nextInt();
        System.out.print("yazi giriniz : ");
        girilen_yazi = giris.next();
        System.out.println(girilen_sayi);
        System.out.println(girilen_yazi);

    }
}
