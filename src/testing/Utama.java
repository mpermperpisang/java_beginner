package testing;

public class Utama {
	static int i;
	public static void main(String[] args){
		CobaBilangan bilangan = new CobaBilangan();
		CobaBintang bintang = new CobaBintang();
		CobaJumlah jumlah = new CobaJumlah();

		System.out.print("Bilangan ganjil : ");
		bilangan.ganjil(10);
		System.out.print("\nBilangan Ganjil Rekursif : \n");
		bilangan.call_rekursif_ganjil(10);
		System.out.print("\nBilangan genap : ");
		bilangan.genap(10);
		System.out.print("\nBilangan Genap Rekursif : \n");
		bilangan.call_rekursif_genap(10);
		System.out.print("\nBilangan prima : ");
		bilangan.prima(20);
		System.out.print("\nDeret Fibonacci : \n");
		bilangan.fibonacci(10);
		System.out.print("\nFibonacci Rekursif : \n");
		bilangan.call_rekursif_fibonacci(10);
		System.out.print("\nBilangan Kelipatan Tiga : ");
		bilangan.kelipatantiga(20);
		System.out.print("\nKelipatan Tiga Rekursif : \n");
		bilangan.call_rekursif_kelipatantiga(10);
		System.out.print("\nBilangan faktorial : ");
		bilangan.faktorial(5);
		System.out.print("\nMean : ");
		bilangan.mean(1,6,10);
		int[] angka = bilangan.sorting(7, 4, 9);
		System.out.print("\nSorting Ascending : ");
		bilangan.sorting_ascending(angka); 
		System.out.print("\nSorting Descending : ");
		bilangan.sorting_descending(angka); 
		System.out.print("\nBilangan Deret : \n");
		bilangan.bilangan_deret(5);
//============================================================================================================================================================================
		System.out.print("\nPiramida Bintang Rata Kiri : \n");
		bintang.pyramidebintang_alignleft("*",5);
		System.out.print("\nPiramida Pagar Rata Kiri : \n");
		bintang.pyramidepagar_alignleft("#",5);
		System.out.print("\nPiramida Bintang Rata Kanan : \n");
		bintang.pyramidebintang_alignright("*",5);
		System.out.print("\nPiramida Pagar Rata Kanan : \n");
		bintang.pyramidepagar_alignright("#",5);
		System.out.print("\nPiramida Bintang Rata Tengah : \n");
		bintang.pyramidebintang_aligncenter("*",5);
		System.out.print("\nPiramida Pagar Rata Tengah : \n");
		bintang.pyramidepagar_aligncenter("#",5);
		System.out.print("\nPiramida Bintang Terbalik : \n");
		bintang.pyramidebintang_terbalik("*",5);
		System.out.print("\nPiramida Pagar Terbalik : \n");
		bintang.pyramidepagar_terbalik("#",5);
		System.out.print("\nPiramida Bintang Bolong : \n");
		bintang.pyramidebintang_bolong("*","#",5);
		System.out.print("\nPiramida Pagar Bolong : \n");
		bintang.pyramidepagar_bolong("#","*",5);
		System.out.print("\nBintang Kotak : \n");
		bintang.bintang_kotak("*",5);
		System.out.print("\nPagar Kotak : \n");
		bintang.pagar_kotak("#",5);
		System.out.print("\nPyramide Bintang Diamond : \n");
		bintang.pyramidebintang_diamond();
		System.out.print("\nPyramide Pagar Diamond : \n");
		bintang.pyramidepagar_diamond();
		System.out.print("\nBintang Panah : \n");	
		bintang.bintang_panah("*",5);
		System.out.print("\nPagar Panah : \n");	
		bintang.pagar_panah("#",5);
		System.out.print("\nBintang Full Panah : \n");	
		bintang.bintang_fullpanah("*",5);
		System.out.print("\nPagar Full Panah : \n");	
		bintang.pagar_fullpanah("#",5);
		System.out.print("\nBintang Trapesium : \n");	
		bintang.trapesium("*",5);
//============================================================================================================================================================================
		jumlah.jumlah_genap();
		jumlah.jumlah_ganjil();
		jumlah.tabel_perkalian(5);
		jumlah.piramida_jumlah(5);
		//jumlah.aritmatika();
	}
}