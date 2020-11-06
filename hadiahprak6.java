import java.util.Scanner;

class Pln{
	String nama;
	String alamat;
	char blok;
	int tipe,harga;
	int bayar;
	
	
	void cetak(){
		System.out.println("");
		System.out.println("=====Cetak Hasil Pembayaran=====");
		System.out.println("Nama pelanggan           : "+ nama);
		System.out.println("Alamat pelanggan         : "+ alamat);
		System.out.println("Harga yang harus dibayar : "+"Rp."+ harga);
		System.out.println("Jumlah uang yg diberikan : "+"Rp."+ bayar);
		System.out.println("Kembaliaan               : "+"Rp."+ (bayar-harga));
		System.out.println("=====Cetak Hasil Pembayaran=====");
		
	}
	
}

public class hadiahprak6{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		
		Pln p = new Pln();
		System.out.println("=====Aplikasi pembayaran listrik=====");
		System.out.println("");
		System.out.print("Masukkan nama anda : ");
		p.nama = input.nextLine();
		System.out.print("Masukkan alamat anda :" );
		p.alamat = input.nextLine();
		
		
while(loop){
	System.out.print("Masukkan tipe(36/37) : ");
	p.tipe = input.nextInt();
		
		
		if(p.tipe == 36){
	
		while(loop){
			System.out.print("Masukkan blok(A/B) : ");
			p.blok = input.next().charAt(0);
			
		switch(p.blok){
			case 'A':
			 
			 p.harga = 500000;
			 System.out.println("Harga yang harus dibayar : "+ p.harga);
			 loop=false;
		
			 
			break;
			
			case 'B' :
			
			p.harga = 300000;
			System.out.println("Harga yang harus dibayar : "+ p.harga);
		    loop=false;
			
			break;
				
			default:
			System.out.println("maaf input anda salah");
			break;
			
			 
		}
			}
		
		
		}else if(p.tipe == 37){
			while(loop){
			
			System.out.print("Masukkan blok(A/B) : ");
			p.blok = input.next().charAt(0);
			
			
		switch(p.blok){
			case 'A':
			 
			 p.harga = 800000;
			 System.out.println("Harga yang harus dibayar : "+ p.harga);
		     loop=false;
			 
			break;
			
			case 'B' :
			
			p.harga = 600000;
			System.out.println("Harga yang harus dibayar : "+ p.harga);
		
			loop=false;
			break;
			
			default:
			System.out.println("maaf input anda salah");
			break;
			
		}
	}
			
}
		else{
			System.out.println("Maaf input anda salah");
		}
}		
		System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        p.bayar= input.nextInt();
			
			
		while(p.bayar<p.harga){
			
			if(p.bayar<p.harga){
			System.out.println("uang anda kurang mohon masukkan dengan nominal yang lebih besar");
				
	            	System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        p.bayar= input.nextInt();
			
				}
			else{
			System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		        p.bayar= input.nextInt();
				}
	
		
		}
	
		p.cetak();
		
		
		
		
		
		
		
	}
}
