import java.util.Scanner;

public class RataNilai13{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double rataNilai; 
    int nilaiMhs;

    int i=1, j=1;
    while (i<=5){
      System.out.println("Input Nilai Mahasiswa ke" +i);
      int totalNilai=0;
      for (j=1; j<=5; j++){
        System.out.print("Nilai ke-" +j + "=");
        nilaiMhs=sc.nextInt();
        totalNilai+=nilaiMhs;
      }
      rataNilai=totalNilai/5;
      System.out.println("Rata-rata Nilai Mahasiswa ke " +i+ " adalah " +rataNilai);
      i++;
    } sc.close();



}
}