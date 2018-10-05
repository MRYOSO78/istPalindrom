/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bababab;

import java.util.Scanner;

/**
 *
 * @author L408-S1
 */
public class Bababab {
    public static boolean istPalindrom(char[] wort){
        boolean palindrom = false;
        if(wort.length%4 == 0){
            for(int i = 0; i < wort.length/2-1; i++){
                if(wort[wort.length-i-1] != wort[i]){
                    return false;
                }else{
                    palindrom = true;
                }   
            }
        }else{
            for(int i = 0; i < (wort.length-1)/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        String wort = sc.nextLine();
        char[] warray = wort.toCharArray(); 
        System.out.println(istPalindrom(warray));       
    }
    }
    
 
