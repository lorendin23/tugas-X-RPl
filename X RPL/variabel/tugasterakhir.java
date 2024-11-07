public class tugasterakhir {

    public static void main(String[] args) {
        final String namaToko = "Basreng Cak aldo";
        final int hargaBasreng = 32_000;
        int potonganPromo = 10_000;
        int potonganReseller = 20_000;

        int hargaPromo = hargaBasreng - potonganPromo;
        int hargaReseller = hargaBasreng - potonganReseller;

        System.out.println("Nama Toko : " + namaToko);
        System.out.println("Harga Basreng : " + hargaBasreng);
        System.out.println("Harga Promo : " + hargaPromo);
        System.out.println("Harga Reseller : " + hargaReseller);        
    }
    
}
