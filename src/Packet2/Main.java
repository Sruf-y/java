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

        File newfile = new File("inW3.txt");
        if(newfile.exists()) {
            BufferedReader br = new BufferedReader(new FileReader("inW3.txt"));


            String line;
            while ((line = br.readLine()) != null) {
                listaParabole.add(new Parabola(line));
            }

            for (Parabola i : listaParabole) {
                System.out.println("Formula:    " + i.toString() + "\n" + "Varf: " + i.CalculateVarf().toString());

            }

            System.out.println("\nMijloc: " + (listaParabole.get(0).MijlocDreaptaSpre(listaParabole.get(1))).toString());
            System.out.println("Lungime: " + Parabola.LungimeaDintre(listaParabole.get(0), listaParabole.get(1)));
        }

    }

    //functii

    static class Punct {
        private final float x;
        private final float y;
        public Punct(float x, float y) {
            super();
            this.x = x;
            this.y = y;
        }
        public Punct(int x, int y) {
            super();
            this.x = (float) x;
            this.y =(float) y;
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }


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

        public Punct CalculateVarf(){


            float varfa=(float) (-(b/(2*a)));
            float varfb=(float) ((Math.pow(-b,2)+4*a*c)/(4*a));

            Punct varf = new Punct(varfa,varfb);
            return varf;
        }

        @Override
        public String toString() {
            return "f(x) = "+a+"x^2 + "+b+"x + "+c;
        }

        public Punct MijlocDreaptaSpre(Parabola Bparab){


            Punct varfA = this.CalculateVarf();
            Punct varfB = Bparab.CalculateVarf();

            Punct mijloc =  new Punct((varfA.x+varfB.x)/2,(varfA.y+varfB.y)/2);

            return mijloc;
        }

        public final Punct MijlocDintre(Parabola Bparab,Parabola Cparab){

            Punct varfA = Bparab.CalculateVarf();
            Punct varfB = Cparab.CalculateVarf();

            Punct mijloc =  new Punct((varfA.x+varfB.x)/2,(varfA.y+varfB.y)/2);


            return mijloc;
        }

        public double LungimePanaLa(Parabola Bparab){

            Punct varfA = this.CalculateVarf();
            Punct varfB = Bparab.CalculateVarf();

            return Math.hypot(varfA.x-varfB.x, varfA.y-varfB.y);

        }

        public static double LungimeaDintre(Parabola Bparab,Parabola Cparab){

            Punct varfA = Bparab.CalculateVarf();
            Punct varfB = Cparab.CalculateVarf();;

            return Math.hypot(varfA.x-varfB.x, varfA.y-varfB.y);

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

    public static float FloatFromString(String a){

        float nr=0;
        int dot=0;

        if(!a.isEmpty()){
            for(int i=0;i<a.length();i++){

                if((a.charAt(i)>='0' && a.charAt(i)<='9') && dot==0){
                    nr*=10;
                    nr+=a.charAt(i)-'0';
                }
                if(a.charAt(i)=='.')
                {
                    dot++;
                }
                if((a.charAt(i)>='0' && a.charAt(i)<='9') && dot==1)
                {
                    nr+=(float)(a.charAt(i)-'0')/(Math.pow(10,dot)) ;
                }
            }
        }
        return nr;
    }

    
    //end functii

}

