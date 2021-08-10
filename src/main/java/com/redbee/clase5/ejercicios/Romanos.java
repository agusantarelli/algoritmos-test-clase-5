package com.redbee.clase5.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Romanos {

    public static Integer Suma(String input){
        int sum = 0;
        if(Objects.equals(input,null)){
            return sum;
        }
        int[] romanos = ToArray(input);
        int i = 0;
        while(i < input.length()){
            if(romanos[i] < romanos[i+1]){
                sum += (romanos[i+1] - romanos[i]);
                i += 2;
            }else{
                sum += romanos[i];
                i++;
            }
        }
        return sum;
    }

    private static int[] ToArray(String input){
        int[] romanos = new int[input.length() + 1];
        for(int i = 0;i<input.length();i++){
            if(Objects.equals(input.charAt(i),'I')){
                romanos[i] = 1;
            }else if(Objects.equals(input.charAt(i),'V')){
                romanos[i] = 5;
            }else if(Objects.equals(input.charAt(i),'X')){
                romanos[i] = 10;
            }else if(Objects.equals(input.charAt(i),'L')){
                romanos[i] = 50;
            }else if(Objects.equals(input.charAt(i),'C')){
                romanos[i] = 100;
            }else if(Objects.equals(input.charAt(i),'D')){
                romanos[i] = 500;
            }else if(Objects.equals(input.charAt(i),'M')){
                romanos[i] = 1000;
            }
        }
        return romanos;
    }
}
