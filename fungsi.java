import java.io.*;
public class fungsi{

    public static void main(String args[]) throws IOException{
        double alas = 0;
        double tinggi = 0;
        double tinggi2 = 0;
        double tinggik = 0;
        final double phi=3.14;
        int radius=0;
        do{
            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            garis();
            System.out.println("Pilihan Menu");
            System.out.println("1.Hiung Luas Segitiga dan Volume Limas");
            System.out.println("2.Hitung Luas Lingkaran dan Volume Kerucut");
            System.out.println("3.Keluar/Exit");
            garis();
            System.out.print("Masukkan pilihan anda : ");
            String st = input.readLine();
            int pilihan = Integer.valueOf(st).intValue();
            switch(pilihan){
            case 1:
                System.out.print("Masukkan alas : ");
                alas = Integer.parseInt(input.readLine());
                System.out.print("Masukkan tinggi : ");
                tinggi = Integer.parseInt(input.readLine());
                System.out.print("Masukkan tinggi sisi segitiga : ");
                tinggi2 = Integer.parseInt(input.readLine());
                   System.out.println("Hasil Luas Segitiga : "+(luastiga(alas,tinggi)));
                   System.out.println("Hasil Volume Limas : "+(volimas(alas,tinggi,tinggi2)));
            break;
            case 2:
                System.out.print("Masukkan jari-jari : ");
                radius = Integer.parseInt(input.readLine());
                System.out.print("Masukkan tinggi Kerucut : ");
                tinggik = Integer.parseInt(input.readLine());
                System.out.println("Hasil Luas Lingkaran : "+(luaslingkaran(radius,phi)));
                   System.out.println("Hasil Volume Kerucut : "+(volKerucut(radius,phi,tinggik)));
            break;
            case 3:
                System.exit(0);
            break;
            default:
                 System.out.println("Silahkan pilih menu 1,2,atau 3");
            }
        } while(true);
    }
    

     public static void garis(){
        System.out.println("====================================================");
        }

     public static int luastiga(double  alass,double  tinggii){
        double hasil1=0.5*alass*tinggii;
        return (int)(hasil1);
    }
      public static int volimas(double  alass,double  tinggii ,double tinggiii){
        double hasil2=0.3*luastiga(alass,tinggii)*tinggiii;
        return (int) (hasil2);
    }
       public static int luaslingkaran(double  radius1,double phi1){
        double jari=radius1*radius1;
        double hasil3=2*phi1*jari;
        return (int) (hasil3);
    }
        public static int volKerucut(double  radius1,double  phi1 ,double tinggiker){
        double hasil4=0.3*luaslingkaran(radius1,phi1)*(tinggiker/2);
        return (int)(hasil4);
    }
}
