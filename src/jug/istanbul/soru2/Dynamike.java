package jug.istanbul.soru2;

public class Dynamike  extends Kahraman{
    public Dynamike() {
        super.aciklama = "Dynamike";
        super.saglik = 2000;
        super.hasar = 2500;
        super.superSaldiri = 3750;

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
