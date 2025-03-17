package Packet3_Sapt4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Echipament>  echipamente = new ArrayList<Echipament>();

        File file = new File("Utilaje.txt");

        if(file.exists()) {

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            String line;

            while ((line = br.readLine()) != null) {
                Echipament aux = Echipament.Parse(line);

                if (aux != null) {
                    echipamente.add(aux);
                }

            }

            if(!echipamente.isEmpty()) {
                for(Echipament i : echipamente) {
                    System.out.println(i.toString());
                }

            }
        }




    }
}




