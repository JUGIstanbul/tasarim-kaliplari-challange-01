package jug.istanbul.soru1;

public abstract class Araba {

    YakitModu yakitModu;
    YolSartiModu yolSartiModu;

    public void sur() {
        if (yakitModu instanceof EkoYakitModu &&
               yolSartiModu instanceof  AraziYolSarti) {
            throw new IllegalStateException(" Bu iki tip uyumsuz") ;
        }
        yakitModu.perform();
        yolSartiModu.apply();
        calis();
    }

    public abstract void calis();
}
