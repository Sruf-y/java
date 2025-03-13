package Packet3;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        List<Produs> lista= new ArrayList<Produs>();



        File filamea=new File("inW3-2.txt");
        if(filamea.exists()) {
            BufferedReader br = new BufferedReader(new FileReader("inW3-2.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                lista.add(Produs.Parse(line));
            }

            br.close();

            for (Produs i : lista) {
                System.out.println(i.toString()+"\n");
            }
        }




    }

    static class Produs{
        private String nume;
        private float pret;
        private int stoc;
        private LocalDate dataExpirarii;


        public Produs(String nume, float pret,int stoc,LocalDate expirare){
            super();
            this.nume=nume;
            this.pret=pret;
            this.stoc=stoc;
            this.dataExpirarii=expirare;
        }

        public Produs(){
            nume="Default";
            pret=0;
            stoc=0;
            dataExpirarii = LocalDate.now().plusWeeks(1);
        }



        public static Produs Parse(@NotNull String line){

            String[] group = line.split(", ");

            String[] group2=line.split(",");

            Produs nou=new Produs();
            if(group.length==4)
            {
                nou.nume=group[0];
                nou.pret=FloatFromString(group[1]);
                nou.stoc=IntFromString(group[2]);
                nou.dataExpirarii=LocalDate.parse(group[3]);
            }
            else if(group2.length==4)
            {
                nou.nume=group[0];
                nou.pret=FloatFromString(group[1]);
                nou.stoc=IntFromString(group[2]);
                nou.dataExpirarii=LocalDate.parse(group[3]);
            }
            else
                return null;

            return nou;
        }

        @Override
        public String toString(){
            return "Nume: "+nume+"\nPret: "+pret+"\nStoc: "+stoc+"\nData expirarii: "+dataExpirarii;
        }
    }





    public static int IntFromString(String a){

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
                    dot=1;
                }
                if((a.charAt(i)>='0' && a.charAt(i)<='9') && dot>0)
                {
                    nr+=(float)((a.charAt(i)-'0')/(Math.pow(10,dot)));
                    dot++;
                }
            }
        }

        return nr;
    }

}
