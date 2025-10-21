import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // 1. Deklarasi variabel integer
        int StrukturBaris;
        StrukturBaris = 22;
        System.out.println("StrukturBaris: " + StrukturBaris);
        System.out.println();

        // 2. Deklarasi variabel string
        String KataBaru = "Deklarasi tipe data String";
        System.out.println("KataBaru: " + KataBaru);
        System.out.println();

        // 3. Deklarasi array satu dimensi
        int[] empatAngka = {7, 10, 20, 23};
        System.out.print("Array empatAngka: ");
        for (int angka : empatAngka) {
            System.out.print(angka + " ");
        }
        System.out.println();
        System.out.println();

        String[] buahBuahan = {"Apel", "Semangka", "Jeruk"};
        System.out.print("Array buahBuahan: ");
        for (String buah : buahBuahan) {
            System.out.print(buah + " ");
        }
        System.out.println();
        System.out.println();

        // 4. Deklarasi array dua dimensi
        String[][] Angka = {
            {"1", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "29"}
        };
        System.out.println("Array dua dimensi Angka:");
        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < Angka[i].length; j++) {
                System.out.print(Angka[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 5. Deklarasi LinkedList
        LinkedList<Integer> listAngka = new LinkedList<Integer>();
        listAngka.add(22);
        listAngka.add(19);
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(72);
        System.out.println("LinkedList listAngka: " + listAngka);
    }
}
