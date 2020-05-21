package jug.istanbul.soru2;

public class Hugo extends Kahraman {

    public Hugo() {
        super.aciklama = "Hugo";
        super.saglik = 3750;
        super.hasar = 1550;
        super.superSaldiri = 3000;

    }

    public double saldir() {
        return hasar;
    }

    public double superSaldir() {
        return superSaldiri;
    }

    public double getSaglikBilgisi() {
        return saglik;
    }
}
