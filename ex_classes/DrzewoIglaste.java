package ex_classes;

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
        super.toString() + "\n" +
        "ilośćIgiel: " + this.ilośćIgiel + "\n" +
        "dlugoscSzyszki: " + this.dlugoscSzyszki; 
      
    }



}
