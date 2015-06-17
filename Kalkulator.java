import java.io.*;
public class Kalkulator {

    public static void main(String []args) throws Exception {
    	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    	double a = 0;
    	double b = 0;
    	double c = 0;
    	double jumlah=0;
    	double kali=0;
    	double kurang=0;
    	double bagi=0;
    	double sisabagi=0;
    	
    	System.out.println ("================================");
    	System.out.println ("\t      Kalkulator");
    	System.out.println ("================================");
    	System.out.print("1. Input bilangan 1 : ");
    	a = Double.parseDouble(br.readLine());
    	System.out.print("2. Input bilangan 2 : ");
    	b = Double.parseDouble(br.readLine());
    	System.out.print("3. Input bilangan 3 : ");
    	c = Double.parseDouble(br.readLine());
    	jumlah=a+b+c;
    	kurang=a-b-c;
    	kali=a*b*c;
    	bagi=a/b/c;
    	sisabagi=a%b;
    	
    	System.out.println ();
    	
    	System.out.println("hasil penjumlahan : "+ jumlah);
    	System.out.println("hasil pengurangan : "+ kali);
    	System.out.println("hasil perkalian : "+ kurang);
    	System.out.println("hasil pembagian : "+ bagi);
    	System.out.println("hasil sisa bagi : "+ sisabagi);
    	System.out.println("hasil pangkat : " +Math.pow(a,b));
    	
    }
    
    
}
