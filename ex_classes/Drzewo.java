package ex_classes;

public class Drzewo {

    protected boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.przekrojDrzewa = przekrojDrzewa;
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc= wysokosc;
    }

    @Override
    public String toString(){
        return
            super.toString() + "\n" +
            "wiecznie zielone: " + wiecznieZielone + "\n" +
            "wysokość: " + wysokosc + "\n" +
            "przekrojDrzewa: " + przekrojDrzewa;
    }

    public void zerwijOwoc() throws DrzewoBezOwocoweException{
        throw new DrzewoBezOwocoweException();

    }




    
}

