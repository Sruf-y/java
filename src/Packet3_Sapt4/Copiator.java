package Packet3_Sapt4;

public class Copiator extends Echipament {

    public int p_ton;
    format_copiere format;

    public Copiator(String name, int nr_inv, int pret, String zona_mag, Stare state,String copiator,int p_ton, format_copiere format) {
        super(name, nr_inv, pret, zona_mag, state);

        this.p_ton = p_ton;
        this.format = format;
    }
    public Copiator(String name, int nr_inv, int pret, String zona_mag, Stare state,int p_ton, format_copiere format) {
        super(name, nr_inv, pret, zona_mag, state);

        this.p_ton = p_ton;
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString()+", "+p_ton+", "+format;
    }
}

enum format_copiere {
    A3,
    A4,
    A5
}