abstract public class Nabung {

    int nabung;
    int jum_saldo;

    Nabung(int nabung){
        this.nabung = nabung+jum_saldo;
    }

    public int getNabung() {
        return nabung;
    }

    abstract int menabung();
}