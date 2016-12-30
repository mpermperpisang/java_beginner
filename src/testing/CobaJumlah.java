package testing;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class CobaJumlah {
	int i,j,a,b,c;
	private Scanner reader;
	private Scanner input;
	
	public void tabel_perkalian(int jumlah){
		System.out.print("\nTabel Perkalian : \n");
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=jumlah;j++){
				System.out.print(i*j);
				System.out.print(" ");
			}
			System.out.print("\n");
		}		
	}
	
	public void piramida_jumlah(int jumlah){
		System.out.print("\nPiramida Jumlah : ");
		for(i=0;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=0;j<=i;j++){
				a=i-j;
				if(a==0){
					System.out.print("");
				}
				else{
					System.out.print(a);
				}
			}
			for(j=i;j>=0;j--){
				a=i-j;
				if(a==0 || a==1){
					System.out.print("");
				}
				else{
					System.out.print(a);
				}
			}
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			System.out.print("\n");
		}		
	}
	
	public void jumlah_genap(){
		CobaBilangan bilangan = new CobaBilangan();
		System.out.print("\nBilangan Genap : ");
		bilangan.genap(20);
		int angka=20;
		j=0;
		for(i=1;i<=angka;i++){
			if(i % 2==0){
				j=j+i;
			}
		}
		System.out.print("\nJumlah bilangan genap : "+j);
	}
	
	public void jumlah_ganjil(){
		CobaBilangan bilangan = new CobaBilangan();
		System.out.print("\nBilangan Ganjil : ");
		bilangan.ganjil(20);
		int angka=20;
		j=0;
		for(i=1;i<=angka;i++){
			if(i % 2==1){
				j=j+i;
			}
		}
		System.out.print("\nJumlah bilangan ganjil : "+j);
	}
	
	public void aritmatika(){
		int jumlah,kurang,kali,bagi,campur;
		input=new Scanner(System.in);
		System.out.print("\nMasukkan nilai a : ");
		a=input.nextInt();
		System.out.print("Masukkan nilai b : ");
		b=input.nextInt();
		System.out.print("Masukkan nilai c : ");
		c=input.nextInt();
		jumlah=a+b+c;
		System.out.print("--------------------\nHasil Penjumlahan : "+jumlah);
		kurang=a-b-c;
		System.out.print("\nHasil Pengurangan : "+kurang);
		kali=a*b*c;
		System.out.print("\nHasil Perkalian : "+kali);
		bagi=a/b/c;
		System.out.print("\nHasil Pembagian : "+bagi);
		campur=a*b/c+b-c*2;
		System.out.print("\nHasil Aritmatika : "+campur);		
	}
}