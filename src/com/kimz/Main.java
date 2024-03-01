package com.kimz;

public class Main {
    public static void main(String[] args) {
      long result =  toMilesPerHour(75.114);
      System.out.println(result);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
        return -1;
        }
        //1m/h = 1.609km/h
        long milesPerHour = Math.round(kilometersPerHour * 1/1.609);
        System.out.println(kilometersPerHour +" km/h = "+milesPerHour+" mi/h");
        return milesPerHour;
    }

}