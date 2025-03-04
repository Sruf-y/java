package Packet1;

import java.io.*;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {




        //Ex1

//        BufferedReader inputreader = new BufferedReader(new InputStreamReader(System.in));
//        int l,L;
//        System.out.print("Lungime: ");
//        l=NumberFromString(inputreader.readLine());
//
//        System.out.print("Latime: ");
//        L=NumberFromString(inputreader.readLine());
//
//        System.out.println("\nArie: "+(l*L)+"\nPerimetru: "+(l+L)+"\n");
        //end Ex1

        //Ex2

//        String filename= "in.txt";
//        File file=new File(filename);
//
//        String line;
//        if(file.exists()){
//
//            BufferedReader fileread =new BufferedReader(new FileReader(file));
//            int a = 0;
//
//            while((line = fileread.readLine())!=null) {
//                a += NumberFromString(line);
//            }
//
//            System.out.println(a);
//
//
//            String outfilename="out.txt";
//            File file2=new File(outfilename);
//            //create file if not existing
//            file2.createNewFile();
//            // i like bufferedreader/writer more than complicating with all those other stuff
//            BufferedWriter outfile = new BufferedWriter(new FileWriter(file2));
//
//            //NEED to close the file for it to update
//            outfile.write(Integer.toString(a));
//            outfile.newLine();
//            outfile.close();
//            fileread.close();
//
//        }
        //end Ex2


        //Ex3

//        int a=0;
//        System.out.println("Nr natural: ");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        a=NumberFromString(br.readLine());
//        br.close();
//
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for(int i=2;i*i<=a;i++)
//        {
//            if(a%i==0)
//            {
//                bw.write(Integer.toString(i));
//                bw.newLine();
//            }
//        }
//        boolean truth=isPrime(a);
//
//        bw.write("Prim truth: "+truth+"\n");
//        bw.close();



        //end Ex3


        //Ex4



//        Random rand = new Random();
//        int a=rand.nextInt(30);
//        int b=rand.nextInt(30);
//
//        ArrayList<Integer> list=new ArrayList<>();
//        ArrayList<Integer> list2=new ArrayList<>();
//
//        for(int i=1;i<=a;i++)
//        {
//            if(a%i==0)
//                list.add(i);
//        }
//        for(int i=1;i<=b;i++)
//        {
//            if(b%i==0)
//                list2.add(i);
//        }
//
//        int cmmdc=0;
//        for(int i=0;i<list.size();i++){
//            for (int j=0;j<list2.size();j++){
//                if(list.get(i).equals(list2.get(j)) && list.get(i)>cmmdc){
//                    cmmdc=list.get(i);
//                }
//            }
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.write("Values were "+Integer.toString(a)+" "+Integer.toString(b)+"\n");
//        bw.write(Integer.toString(cmmdc));
//        bw.newLine();
//        bw.close();


        //end Ex4

        //Ex5



        Random rand = new Random();

        int a=rand.nextInt(0,20);

        int b=0,c=1;
        int d=b+c;


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Numar generat: "+Integer.toString(a)+"\n");
        while(d<=a)
        {
            if(d==a)
            {
                bw.write(Integer.toString(a)+" face parte din sirul fibonacci.\n"+Integer.toString(b)+" "+Integer.toString(c)+" "+Integer.toString(d)+"\n");
            }
            c=d;
            b=c;

            d=b+c;
        }
        bw.close();



        //end Ex5

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

