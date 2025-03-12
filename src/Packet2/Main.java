package Packet2;

import java.io.*;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {



        List<Parabola> listaParabole= new ArrayList<Parabola>();

    	BufferedReader br = new BufferedReader(new FileReader("inW3.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            listaParabole.add(new Parabola(line));
        }

        for(Parabola i:listaParabole){
            System.out.println("Formula:    "+i.toString()+"\n"+ "Varf: "+Arrays.toString(i.CalculateVarf()));

        }

        System.out.println("\nMijloc: "+Arrays.toString(listaParabole.get(0).MijlocDreaptaSpre(listaParabole.get(1))));
        System.out.println("Lungime: "+Parabola.LungimeaDintre(listaParabole.get(0),listaParabole.get(1)));

    }

    //functii

    static class Parabola{

        private int a,b,c;
        public Parabola(int a, int b, int c) {
            super();
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public Parabola(String line){
            super();
            this.a = 3;
            this.b = 2;
            this.c = 1;

            String splitstring[] =line.split(" ");

            if(splitstring.length==3){
                a=NumberFromString(splitstring[0]);
                b=NumberFromString(splitstring[1]);
                c=NumberFromString(splitstring[2]);
            }
        }

        public double[] CalculateVarf(){
            double[] varf = new double[2];

            varf[0]=(double)(-(b/(2*a)));
            varf[1]=(double)((Math.pow(-b,2)+4*a*c)/(4*a));

            return varf;
        }

        @Override
        public String toString() {
            return "f(x) = "+a+"x^2 + "+b+"x + "+c;
        }

        public double[] MijlocDreaptaSpre(Parabola Bparab){
            double[] mijloc =  new double[2];

            double[] varfA = this.CalculateVarf();
            double[] varfB = Bparab.CalculateVarf();

            //mijlocul unui segment Xd
            mijloc[0]=(varfA[0]+varfB[0])/2;
            mijloc[1]=(varfA[1]+varfB[1])/2;

            return mijloc;
        }

        public final double[] MijlocDintre(Parabola Bparab,Parabola Cparab){
            double[] mijloc =  new double[2];

            double[] varfA = Bparab.CalculateVarf();
            double[] varfB = Cparab.CalculateVarf();

            mijloc[0]=(varfA[0]+varfB[0])/2;
            mijloc[1]=(varfA[1]+varfB[1])/2;

            return mijloc;
        }

        public double LungimePanaLa(Parabola Bparab){

            double[] varfA = this.CalculateVarf();
            double[] varfB = Bparab.CalculateVarf();

            return Math.hypot(varfA[0]-varfB[0], varfA[1]-varfB[1]);

        }

        public static double LungimeaDintre(Parabola Bparab,Parabola Cparab){

            double[] varfA = Bparab.CalculateVarf();
            double[] varfB = Cparab.CalculateVarf();

            return Math.hypot(varfA[0]-varfB[0], varfA[1]-varfB[1]);

        }
    }








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

