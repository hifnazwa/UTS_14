import java.util.Scanner;

public class HitungIP14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);
        String nama, mataKuliah, nilai;
        int i=1, r=0;
        double nilaiAng=0;
        char ulang;
        double iP, totalSks, totNilai, totMatkul, rTot;

        System.out.println("Program Hitung IP");
        System.out.print("Masukkan nama: ");
        nama = sc14.nextLine();

        do {
        int b = 1;

        System.out.print("Nama Mata Kuliah: ");
        mataKuliah = sc14.nextLine();
        
        System.out.print("Nilai (A,B+,B,C+,C,D,E): ");
        nilai = sc14.nextLine(); {
          if (nilai.equalsIgnoreCase("A")){
            nilaiAng = 4.0;
            System.out.print(" Masukkan Jumlah SKS: ");
            i = sc14.nextInt();
          } else if (nilai.equalsIgnoreCase("B+")) {
            nilaiAng = 3.5;
            System.out.print(" Masukkan Jumlah SKS: ");
            i = sc14.nextInt();
          } else if (nilai.equalsIgnoreCase("B")) {
            nilaiAng = 3.0;
            System.out.print(" Masukkan Jumlah SKS: ");
            i = sc14.nextInt();
          } else if (nilai.equalsIgnoreCase("C+")) {
            nilaiAng = 2.5;
            System.out.print(" Masukkan Jumlah SKS: ");
            i = sc14.nextInt(); 
          } else if (nilai.equalsIgnoreCase("C")) {
            nilaiAng = 2.0;
            System.out.print(" Masukkan Jumlah SKS: ");
            i = sc14.nextInt();
          } else if (nilai.equalsIgnoreCase("D")) {
            nilaiAng = 1.0;
            System.out.print(" Masukkan Jumlah SKS: ");
            i = sc14.nextInt(); 
            r = 1;
          } else if (nilai.equalsIgnoreCase("E")) {
            nilaiAng = 0.0;
            System.out.println(" Masukkan Jumlah SKS: ");
            i= sc14.nextInt(); 
            r = 1;
          } else {
            System.out.println("Nilai yang anda masukkan salah");
          }
        }
          totalSks = i++;
          totNilai = nilaiAng++;
          totMatkul = b++;
          iP = (totNilai*totalSks)/totalSks;
          rTot = r++;

          System.out.print("Apakah lanjut input Nilai (Y/N)?"); 
            ulang = sc14.next().charAt(0);
        } while (ulang == 'y');
        System.out.println("-----------Hasil Perhitungan IP-----------");
        System.out.println("Nama \t\t\t\t\t:" + nama);
        System.out.println("Indeks Prestasi (IP)\t\t\t: " + iP);
        System.out.println("Jumlah mata Kuliah \t\t\t: " + totMatkul);
        System.out.println("Jumlah Sks\t\t\t\t: " +totalSks  );
        System.out.println("Jumlah MK yang harus perbaikan/remidi: " + rTot);
        System.out.println("-------------------------------------------");

   }
}