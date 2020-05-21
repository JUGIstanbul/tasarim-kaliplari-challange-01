package jug.istanbul.soru1;

public class HeluxArac extends Araba {

    public HeluxArac() {
        super.yakitModu = new SporYakitModu();
        super.yolSartiModu = new SehirYolSarti();
    }

    public void calis() {
        System.out.println("Helux araci calisti");
    }
}
