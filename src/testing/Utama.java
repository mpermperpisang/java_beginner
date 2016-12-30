package testing;

public class Utama {
	static int i;
	public static void main(String[] args){
		CobaBilangan bilangan = new CobaBilangan();
		CobaBintang bintang = new CobaBintang();
		CobaJumlah jumlah = new CobaJumlah();

		System.out.print("Bilangan ganjil : ");
		bilangan.ganjil(20);
		System.out.print("\nBilangan Ganjil Rekursif : ");
		bilangan.call_rekursif_ganjil(20);
		System.out.print("\nBilangan genap : ");
		bilangan.genap(20);
		System.out.print("\nBilangan Genap Rekursif : ");
		bilangan.call_rekursif_genap(20);
		System.out.print("\nBilangan prima : ");
		bilangan.prima(20);
		System.out.print("\nDeret Fibonacci : \n");
		bilangan.fibonacci(10);
		System.out.print("\nFibonacci Rekursif : \n");
		bilangan.call_rekursif_fibonacci(10);
		System.out.print("\nBilangan Kelipatan Tiga : ");
		bilangan.kelipatantiga(20);
		System.out.print("\nBilangan faktorial : ");
		bilangan.faktorial(5);
		System.out.print("\nMean : ");
		bilangan.mean(1,6,10);
		int[] angka = bilangan.sorting(7, 4, 9);
		System.out.print("\nSorting Ascending : ");
		bilangan.sorting_ascending(angka); 
		System.out.print("\nSorting Descending : ");
		bilangan.sorting_descending(angka); 
		System.out.print("\nPiramida Bintang Rata Kiri : \n");
		bintang.pyramide_alignleft(5);
		System.out.print("\nPiramida Bintang Rata Kanan : \n");
		bintang.pyramide_alignright(5);
		System.out.print("\nPiramida Bintang Rata Tengah : \n");
		bintang.pyramide_aligncenter(5);
		System.out.print("\nPiramida Bintang Terbalik : \n");
		bintang.pyramide_terbalik(5);
		System.out.print("\nPiramida Bintang Bolong : \n");
		bintang.pyramide_bolong(5);
		System.out.print("\nBintang Kotak : \n");
		bintang.bintang_kotak(5);
		System.out.print("\nPyramide Diamond : \n");
		bintang.pyramide_diamond();
		System.out.print("\nBintang Panah : \n");	
		bintang.bintang_panah(5);
		jumlah.jumlah_genap();
		jumlah.jumlah_ganjil();
		//jumlah.aritmatika();
	}
}