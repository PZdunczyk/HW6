/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 *
 * @author PZdunczyk
 */
public class MyInteger {
    private int value =2;
    
    
     MyInteger() {
         value =2 ;
    }

    public void setInteger(int n) {
        value = n;
    }
    public int getInteger(){
        return value;
    }
    
    public boolean isEven() {
        int n = value % 2;
        
        if(n==0)
            return true;
        
        return false;
    
    
    
    }

    public boolean isOdd() {
        int n = value % 2;
        
        if(n==1)
            return true;
        return false;
    }
    public boolean isPrime() {
        int n = 0;
        
        for(int i = 3; i < value ; i++){
             n = value % i ;
        
             if(n == 0) {
                 return false;
                 
             }
        }
     return true;
    }
    public static boolean isEven(int n) {
        int z = n %2;
        if(z ==0)
            return true;
     return false;
    }
    public static boolean isOdd(int n) {
        int z = n %2;
        if(z==1)
            return true;
        return false;
        }
    public static boolean isPrime(int h) {
        int n = 0;
        
        for(int i = 3; i < h ; i++){
             n = h % i ;
        
             if(n == 0) {
                 return false;
                 
             }
        }
     return true;
        }
    
    
    public static boolean isEven(MyInteger h){
        int n = 0;
        n = h.getInteger() %2;
        if(n==0)
            return true;
        return false;
       }
    public static boolean isOdd(MyInteger h) {
        int n = 0;
        n=h.getInteger() %2;
        if(n==1)
            return true;
        return false;
    }

    public static boolean isPrime(MyInteger h ) {
     int z = h.getInteger();
     int n = 0;
        
        for(int i = 3; i < z ; i++){
             n = z % i ;
        
             if(n == 0) {
                 return false;
                 
             }
        }
     return true;
     }
    
    public boolean equals(int h, MyInteger a) {
        int b = a.getInteger;
        
        
        
        
        
    }




}
