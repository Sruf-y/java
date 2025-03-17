package Packet3_Sapt4;

import jdk.jfr.Unsigned;

import java.io.Serializable;

public class Echipament implements Serializable {
    public String name;
    public int nr_inv;
    public int pret;
    public String zona_mag;
    Stare state;

    public Echipament(String name, int nr_inv, int pret, String zona_mag,Stare state) {
        this.name = name;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.state = state;
    }

    @Override
    public String toString() {
        return name+", "+nr_inv+", "+pret+", "+zona_mag+", "+state;
    }

    static Echipament Parse(String line) {

        String[] pieces = line.split(";");


        String lowercased = line.toLowerCase();


        // im stupid, trebuia doar sa ignor pieces[5]....... dumb. Whatever.
        if(lowercased.contains("imprimanta")) {
            return new Imprimanta(pieces[0],Integer.parseInt(pieces[1]),Integer.parseInt(pieces[2]),pieces[3],Stare.valueOf(pieces[4]),pieces[5],Integer.parseInt(pieces[6]),pieces[7],Integer.parseInt(pieces[8]),tip_imprimanta.valueOf(pieces[9]));
        }
        else if(lowercased.contains("copiator")) {
            return new Copiator(pieces[0],Integer.parseInt(pieces[1]),Integer.parseInt(pieces[2]),pieces[3],Stare.valueOf(pieces[4]),pieces[5],Integer.parseInt(pieces[6]),format_copiere.valueOf(pieces[7]));
        }
        else if(lowercased.contains("sistem de calcul")) {
            return new SistemDeCalcul(pieces[0],Integer.parseInt(pieces[1]),Integer.parseInt(pieces[2]),pieces[3],Stare.valueOf(pieces[4]),pieces[5],pieces[6],Float.parseFloat(pieces[7]),Integer.parseInt(pieces[8]),pieces[9]);
        }
        return null;

    }

}

enum Stare{
    achizitionat,
    expus,
    vandut
}

// denumire, un număr de inventar nr_inv, are un preţ pret şi este plasat într-o anumită zonă din
//magazie zona_mag

//denumire;numar_inventar;pret;zona;stare