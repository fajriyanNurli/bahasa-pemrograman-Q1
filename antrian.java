import java.util.*;

public class antrian{
  
  public static void main(String[]args){    
    Scanner sc = new Scanner(System.in);
    Queue que = new LinkedList();    
    int i=1;

    do{
      System.out.println("App Antrian");
      System.out.println("1. Tambah Antrian");
      System.out.println("2. Panggil Antrian");
      System.out.println("3. Jumlah Antrian");
      System.out.println("4. Keluar");
      System.out.print("Masukan Pilihan : ");
      int pilihan = sc.nextInt();
      switch(pilihan){
        case 1 :
          System.out.print("Nama Customer : ");
          que.offer(sc.next());
          System.out.println("Anda Mendapatkan Antrian No."+que.size());
          break;
        case 2 : 
          System.out.println("Antrian No." + i);
          System.out.println("Silahkan Masuk " + que.remove());
          System.out.println("Sisa Antrian Tunggu : " + que.size());    
          i++;
          break;
        case 3 :
        System.out.println("Jumlah Antrian : "+que.size());
          break;
        case 4 :
        System.exit(0);
          break;
  
          
      }   
    }while(true);
  }  
}
