package jug.istanbul.soru2;

public class Main {

    public static void main(String[] args) {
        Kahraman kahraman = new Hugo();
        System.out.println(kahraman.getAciklama() +
                " \n Saldiri Gucu  : " +  kahraman.saldir()
                + "\n Super Saldiri Gucu " + kahraman.superSaldir()
                + "\n Saglik Bilgisi  " + kahraman.getSaglikBilgisi());

        kahraman = new OzelSaglikGucuKostumu(kahraman) ;

        System.out.println(kahraman.getAciklama() +
                " \n Saldiri Gucu  : " +  kahraman.saldir()
                + "\n Super Saldiri Gucu " + kahraman.superSaldir()
                + "\n Saglik Bilgisi  " + kahraman.getSaglikBilgisi());

        kahraman = new OzelHasarGucuKostumu(kahraman) ;

        System.out.println(kahraman.getAciklama() +
                " \n Saldiri Gucu  : " +  kahraman.saldir()
                + "\n Super Saldiri Gucu " + kahraman.superSaldir()
                + "\n Saglik Bilgisi  " + kahraman.getSaglikBilgisi());

    }
}
