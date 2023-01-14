package Drzewa;

public class DrzewoIglaste extends Drzewo {
    private int ilośćIgiel;
    private double dlugoscSzyszki;

    
    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ilośćIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone,wysokosc,przekrojDrzewa);
        this.ilośćIgiel = ilośćIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString(){
        return
        "wiecznie zielone: " + super.wiecznieZielone + "\n" +
        "wysokość: " + super.wysokosc + "\n" +
        "przekrojDrzewa: " + super.przekrojDrzewa + "\n" +
        "ilośćIgiel: " + this.ilośćIgiel + "\n" +
        "dlugoscSzyszki: " + this.dlugoscSzyszki + "\n"; 
      
    }



}
