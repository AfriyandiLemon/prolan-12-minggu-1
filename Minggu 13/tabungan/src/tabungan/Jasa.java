package tabungan;
import java.util.Scanner;
public class Jasa implements Inter {
    int Jumlah;
 String jenis,provider;
 Scanner input = new Scanner(System.in);
 
 Jasa(String jenis, int Jumlah){
	this.Jumlah = Jumlah;
	this.jenis = jenis;
  System.out.println("Jenis penarikan (ATM/teller) adalah :" +jenis);
  System.out.println("Jumlah nominal penarikan :" +Jumlah);
  System.out.println("-------------------------------------");
 }
    

    @Override
    public void Biodata() {
        System.out.println("Jasa yang ditawarkan adalah pemberian diskon khusus berupa bunga");
     }

    @Override
    public void Tabung() {
    }

    @Override
    public void Produk() {
        System.out.println("Masukan nama penyedia layanan jasa Anda: ");provider=input.nextLine();
        switch (provider){
            case "Mandiri":
                System.out.println("Nama Penyedia jasa : Mandiri");
                break;
            case "BCA":
                System.out.println("Nama Penyedia jasa : BCA");
                break;
            case "BNI":
                System.out.println("Nama Penyedia jasa : BNI");
                break;
            case "BRI":
                System.out.println("Nama Penyedia jasa : Bank Rakyat Indonesia");
                break;
            case "CIMB":
                System.out.println("Nama Penyedia jasa : Niaga");
                break;
        }
    }
    
}
