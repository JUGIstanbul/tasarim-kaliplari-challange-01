package jug.istanbul.soru2;

public class OzelSaglikGucuKostumu  extends KahramanKostumleri{

    Kahraman kahraman;

    public OzelSaglikGucuKostumu(Kahraman kahraman) {
        this.kahraman = kahraman ;
    }

    public String getAciklama() {
        return kahraman.getAciklama() + " ama Ozel Saglik Gucu Kostumlu";
    }

    public double saldir() {
        return kahraman.saldir();
    }

    public double superSaldir() {
        return kahraman.superSaldir();
    }

    public double getSaglikBilgisi() {
        return 200 + kahraman.getSaglikBilgisi();
    }
}
