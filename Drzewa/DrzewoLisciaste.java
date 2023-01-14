package Drzewa;

public class DrzewoLisciaste extends Drzewo {
    protected int ksztaltLiscia;
    
    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone,  wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString(){
        return
        "wiecznie zielone: " + super.wiecznieZielone + "\n" +
        "wysokość: " + super.wysokosc + "\n" +
        "przekrojDrzewa: " + super.przekrojDrzewa + "\n" +
        "kształtLiscia: " + this.ksztaltLiscia + "\n";
    }
}
