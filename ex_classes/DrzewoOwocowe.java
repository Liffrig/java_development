package ex_classes;

public class DrzewoOwocowe extends DrzewoLisciaste{
    private String nazwaOwocu;

    public DrzewoOwocowe (boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwocu) {
        super(wiecznieZielone,  wysokosc, przekrojDrzewa,ksztaltLiscia);
        this.nazwaOwocu = nazwaOwocu;
    }

    @Override
    public String toString(){
        return
        "wiecznie zielone: " + super.wiecznieZielone + "\n" +
        "wysokość: " + super.wysokosc + "\n" +
        "przekrojDrzewa: " + super.przekrojDrzewa + "\n" +
        "kształtLiscia: " + super.ksztaltLiscia + "\n" +
        "nazwaOwocu: " + this.nazwaOwocu + "\n";
    }
}
