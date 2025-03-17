package Packet3_Sapt4;

public class SistemDeCalcul extends Echipament {
    public String tip_mon;
    public float proccesor_hz;
    public int storageHDD;
    public String SO;

    public SistemDeCalcul(String name, int nr_inv, int pret, String zona_mag, Stare state,String sistem_de_calcul,String tip_mon,float proccesor_hz,int storageHDD,String SO) {
        super(name, nr_inv, pret, zona_mag, state);

        this.tip_mon = tip_mon;
        this.proccesor_hz = proccesor_hz;
        this.storageHDD = storageHDD;
        this.SO = SO;
    }
    public SistemDeCalcul(String name, int nr_inv, int pret, String zona_mag, Stare state,String tip_mon,float proccesor_hz,int storageHDD,String SO) {
        super(name, nr_inv, pret, zona_mag, state);

        this.tip_mon = tip_mon;
        this.proccesor_hz = proccesor_hz;
        this.storageHDD = storageHDD;
        this.SO = SO;
    }

    @Override
    public String toString() {
        return super.toString()+", "+tip_mon+", "+proccesor_hz+", "+storageHDD+", "+SO;
    }


}
