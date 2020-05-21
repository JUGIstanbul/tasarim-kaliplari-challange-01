package jug.istanbul.soru1;

public class SUVArac extends Araba {

    public SUVArac() {
        super.yolSartiModu = new SehirYolSarti();
        super.yakitModu = new SporYakitModu();
    }
    public void calis() {
        System.out.println("SUVArac araci calisti");
    }


}
