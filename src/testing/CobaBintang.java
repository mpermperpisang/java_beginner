package testing;

public class CobaBintang {
	int i,j;
	
	public void pyramide_alignleft(int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public void pyramide_alignright(int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public void pyramide_aligncenter(int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("*");
				System.out.print(" ");
			}
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			System.out.print("\n");
		}		
	}
	
	public void pyramide_terbalik(int jumlah){
		for(i=jumlah;i>=1;i--){
			for(j=i;j<jumlah;j++){
				System.out.print(" ");
			}
			for(j=i;j>=1;j--){
				System.out.print("*");
				System.out.print(" ");
			}
			for(j=i;j<jumlah;j++){
				System.out.print(" ");
			}
			System.out.print("\n");
		}				
	}
	
	public void pyramide_bolong(int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>=i;j--){
				System.out.print("*");
			}
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=jumlah;j>=i;j--){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public void bintang_kotak(int jumlah){
		for(i=1;i<=jumlah;i++){
			System.out.print("* ");
			for(j=1;j<=jumlah;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
	
	public void pyramide_diamond(){
		CobaBintang bintang=new CobaBintang();
		bintang.pyramide_aligncenter(5);
		bintang.pyramide_terbalik(5);
	}
	
	public void bintang_panah(int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=jumlah;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}	
		for(i=jumlah-1;i>=1;i--){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=jumlah;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
