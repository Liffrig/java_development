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
        super.toString() + "\n" +
        "nazwaOwocu: " + this.nazwaOwocu;
    }

    @Override
    public void zerwijOwoc() throws DrzewoBezOwocoweException{
        System.out.println(this.nazwaOwocu + " ...mniam!");
    }
}
