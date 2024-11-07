import java.util.Scanner;

public class input1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.println("inputkan usia: ");
        int angka = input.nextInt();

        System.out.println("inputkan kota asal: ");
        String kotaAsal = input.nextLine();

        System.out.println("inputkan tinggi badan: ");
        double tinggiBadan = input.nextDouble();

        System.out.println("\n======= output =======");
        System.out.println("nama: " + nama);
        System.out.println("Usia: " + angka);
        System.out.println("Kota Asal: " + kotaAsal);
        System.out.println("Tinggi Badan: " + tinggiBadan);
    }
    
}
