import java.util.*;

class Array
{
	public static void main(String[] abc)
	{
		String[][] dbmhs = {
								{"13410100001", "Max Prasetyo"},
								{"13410100027", "Bella Hariska"},
								{"13410100094", "Mitchel Febrian"},
								{"13410100006", "Nico Stephanus"},
								{"13410100032", "Tantri Mindrawan"},
								{"13410100011", "Rully heryanto"},
								{"13410100036", "Bagas Wiyarso Pujo"}
								};
		Scanner input = new Scanner(System.in);
		String nim, cetak = "";
		
		System.out.print("Masukkan NIM : ");
		nim = input.next();
		
		
		//FILTER NAMA
		public []String filterNama(String nama){
			int counter=0;
			for(int i=0;i<daftarNama.length;i++){
				if(daftarNama[i].contains(nama))
				{
				arr[counter]=daftarNama[i];
				counter++;
			}
			//buat string sesuai dengan panjang jumlah data 
			String []arr=new String[counter];
			//looping untuk mengecek nama
			counter=0;
			for(int i=0;i<daftarNama.length;i++){
			if(daftarNama[i].contains(nama))
				{
			arr[counter]=daftarNama[i];
			counter++;
			}
		}
		
		return arr;
	}
		
			
		
		}  
			
		
		
		
		for(int i = 0; i < dbmhs.length; i++)
		{
			if(nim.equals(dbmhs[i][0]))
			{
				for(int j = 0; j < dbmhs[i].length; j++)
				{
					cetak = "NIM : " + nim + "\nNama : " + dbmhs[i][1] + "\nPIN : " + ((dbmhs[i][1]).substring(0,3) + (dbmhs[i][1]).substring(dbmhs[i][1].length()-2));
				}
			}
			else
			{ 
				if(i==0){
					cetak = "NIM yang anda masukkan tidak terdaftar dalam database kami!"; }
				}
		}
		System.out.println(cetak);
	}
}
