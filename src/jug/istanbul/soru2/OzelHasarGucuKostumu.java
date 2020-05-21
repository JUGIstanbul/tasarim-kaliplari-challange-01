package jug.istanbul.soru2;

public class OzelHasarGucuKostumu  extends  KahramanKostumleri{

    Kahraman kahraman;

    public OzelHasarGucuKostumu(Kahraman kahraman) {
        this.kahraman = kahraman ;
    }

    public String getAciklama() {
        return kahraman.getAciklama() + " ama Ozel Hasar Gucu Kostumlu";
    }

    public double saldir() {
        return 40 + kahraman.saldir();
    }

    public double superSaldir() {
        return kahraman.superSaldir();
    }

    public double getSaglikBilgisi() {
        return 40 + kahraman.getSaglikBilgisi();
    }
}
