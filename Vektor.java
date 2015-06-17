import java.util.*;
public class vektor {
     public static void main(String[]args){
        int jumlah=0;
        int indekshapus=0;
        Vector nama=new Vector();
        Vector nim=new Vector();
        Vector alamat=new Vector();
      do{
          Scanner inputan=new Scanner(System.in);
          System.out.println("Pilihan Menu");
          System.out.println("1. Tambah Data Mahasiswa");
          System.out.println("2. Hapus Data Mahasiswa");
          System.out.println("3. Lihat Data mahasiswa");
          System.out.println("4. Keluar/exit");
          System.out.print("Masukkan No Pilihan Anda=");
          int pilihan=Integer.parseInt(inputan.nextLine());
          switch (pilihan){
              case 1:
                  System.out.println ("Tambah Data Mahasiswa");
                  System.out.print("Masukkan jumlah mahasiswa = ");
                  jumlah=Integer.parseInt(inputan.nextLine());
                  for(int i=1;i<=jumlah;i++){
                    System.out.print("Masukkan nim mahasiswa ke"+i+" = ");
                    nim.addElement(inputan.nextLine());
                    System.out.print("Masukkan nama mahasiswa ke"+i+" = ");
                    nama.addElement(inputan.nextLine());
                    System.out.print("Masukkan alamat mahasiswa ke"+i+" = ");
                    alamat.addElement(inputan.nextLine());
                  }
              break;
              case 2:
                  System.out.println( "Hapus Data Mahasiswa");
                  System.out.print( "Input nim mahasiswa yng akna dihapus : ");
                  indekshapus=nim.indexOf(inputan.nextLine());
                  nim.remove(indekshapus);
                  nama.remove(indekshapus);
                  alamat.remove(indekshapus);
              break;
              case 3:
                  tampilVektor("mahasiswa yang tersisa ", nim , nama , alamat);
                  break;
              case 4:
                  System.exit(0);
                  break;

          }
      }while (true);
     }
     public static void tampilVektor(String info,Vector nm,Vector na,Vector al){
    System.out.println(info);
    System.out.println("======================================");
    if(nm.isEmpty()){
        if(na.isEmpty()){
            if(al.isEmpty()){
                 System.out.println("Vektor Kosong");
            }
        }
    }
     else{
        for(int i=0;i<nm.size();i++){
            System.out.println(nm.elementAt(i));
            System.out.println(na.elementAt(i));
            System.out.println(al.elementAt(i));
        }
     }
    System.out.println("======================================");
        }
    }
