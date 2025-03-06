package Packet2;

import java.io.*;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {




    	
    	
    	
    }

    //functii

    public static boolean isPrime(int n) throws IOException {



        if(n<=1) return false;

        boolean prime=true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                prime=false;
            }
        }
        return prime;
    }

    public static int NumberFromString(String a){

        int nr=0;

        if(!a.isEmpty()){
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)>='0' && a.charAt(i)<='9'){
                    nr*=10;
                    nr+=a.charAt(i)-'0';
                }
            }
        }
        return nr;
    }

    
    //end functii

}

