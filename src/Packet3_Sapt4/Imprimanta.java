package Packet3_Sapt4;

import jdk.jfr.Unsigned;

public class Imprimanta extends Echipament {

    public int pmm;
    public String rezolutie;
    public int p_car;
    tip_imprimanta mod_tiparire;

    public Imprimanta(String name, int nr_inv, int pret, String zona_mag, Stare state, int pmm, String rezolutie, int p_car, tip_imprimanta mod_tiparire) {
        super(name, nr_inv, pret, zona_mag, state);

        this.pmm = pmm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.mod_tiparire = mod_tiparire;
    }
    public Imprimanta(String name, int nr_inv, int pret, String zona_mag, Stare state,String imprimanta, int pmm, String rezolutie, int p_car, tip_imprimanta mod_tiparire) {
        super(name, nr_inv, pret, zona_mag, state);

        this.pmm = pmm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.mod_tiparire = mod_tiparire;
    }

    @Override
    public String toString() {
        return super.toString()+", "+pmm+", "+rezolutie+", "+p_car;
    }
}

enum tip_imprimanta {
    color,
    alb_negru
}