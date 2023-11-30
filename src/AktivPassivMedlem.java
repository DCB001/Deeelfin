//Opret metode der skelner mellem aktivt og passivt medlemsskab. (boolean)
public class AkPaMedlem {
    private boolean aktiv;
    // Konstruktør
    public AkPaMedlem(boolean erAktiv) {
        this.aktiv = erAktiv;
    }
    // Metode til at tjekke om medlemmet er aktivt
    public boolean erAktiv() {
        return aktiv;
    }
    // Metode til at ændre aktivitetsstatus
    public void sætAktiv(boolean erAktiv) {
        this.aktiv = erAktiv;
    }
}