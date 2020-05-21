package jug.istanbul.soru2;

public abstract class Kahraman {

    String aciklama = "Bilinmeyen Kahraman";
    int superSaldiri = 0 ;
    int hasar = 0 ;
    int saglik = 0;

    public abstract double saldir();

    public abstract double superSaldir();

    public abstract double getSaglikBilgisi();

    public String getAciklama() {
        return aciklama;
    }


}
