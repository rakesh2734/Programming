package com.palindrome;

public class Palindrome {
	
    public static void main(String[] args) {
        String wort = "reliefpfpfeiller";
        char[] warray = wort.toCharArray(); 
        System.out.println(istPalindrom(warray));  
        
    }

    public static boolean istPalindrom(char[] wort){
        boolean palindrom = false;
        if(wort.length%2 == 0){
            for(int i = 0; i < wort.length/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
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
    public static boolean istPalindrom1(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
  
}