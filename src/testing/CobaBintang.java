package testing;

public class CobaBintang {
	int i,j;
	
	public void trapesium(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(a);
			}
			for(j=1;j<=i;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}
	
	public void pyramidebintang_alignleft(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=i;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}	
	}
	
	public void pyramidepagar_alignleft(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=i;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}				
	}
	
	public void pyramidebintang_alignright(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}
	
	public void pyramidepagar_alignright(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}
	
	public void pyramidebintang_aligncenter(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(a);
				System.out.print(" ");
			}
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			System.out.print("\n");
		}		
	}
	
	public void pyramidepagar_aligncenter(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(a);
				System.out.print(" ");
			}
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			System.out.print("\n");
		}		
	}
	
	public void pyramidebintang_terbalik(String a,int jumlah){
		for(i=jumlah;i>=1;i--){
			for(j=i;j<jumlah;j++){
				System.out.print(" ");
			}
			for(j=i;j>=1;j--){
				System.out.print(a);
				System.out.print(" ");
			}
			for(j=i;j<jumlah;j++){
				System.out.print(" ");
			}
			System.out.print("\n");
		}				
	}
	
	public void pyramidepagar_terbalik(String a,int jumlah){
		for(i=jumlah;i>=1;i--){
			for(j=i;j<jumlah;j++){
				System.out.print(" ");
			}
			for(j=i;j>=1;j--){
				System.out.print(a);
				System.out.print(" ");
			}
			for(j=i;j<jumlah;j++){
				System.out.print(" ");
			}
			System.out.print("\n");
		}				
	}
	
	public void pyramidebintang_bolong(String a,String b,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>=i;j--){
				System.out.print(a);
			}
			for(j=1;j<i;j++){
				System.out.print(b);
			}
			for(j=1;j<i;j++){
				System.out.print(b);
			}
			for(j=jumlah;j>=i;j--){
				System.out.print(a);
			}
			System.out.print("\n");
		}
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=i;j++){
				System.out.print(a);
			}
			for(j=jumlah;j>i;j--){
				System.out.print(b);
			}
			for(j=jumlah;j>i;j--){
				System.out.print(b);
			}
			for(j=1;j<=i;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}
	
	public void pyramidepagar_bolong(String a,String b,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>=i;j--){
				System.out.print(a);
			}
			for(j=1;j<i;j++){
				System.out.print(b);
			}
			for(j=1;j<i;j++){
				System.out.print(b);
			}
			for(j=jumlah;j>=i;j--){
				System.out.print(a);
			}
			System.out.print("\n");
		}
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=i;j++){
				System.out.print(a);
			}
			for(j=jumlah;j>i;j--){
				System.out.print(b);
			}
			for(j=jumlah;j>i;j--){
				System.out.print(b);
			}
			for(j=1;j<=i;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}
	
	public void bintang_kotak(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			System.out.print(a);
			System.out.print(" ");
			for(j=1;j<=jumlah;j++){
				System.out.print(a);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
	public void pagar_kotak(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			System.out.print(a);
			System.out.print(" ");
			for(j=1;j<=jumlah;j++){
				System.out.print(a);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
	public void pyramidebintang_diamond(){
		CobaBintang bintang=new CobaBintang();
		bintang.pyramidebintang_aligncenter("*",5);
		bintang.pyramidebintang_terbalik("*",5);
	}
	
	public void pyramidepagar_diamond(){
		CobaBintang bintang=new CobaBintang();
		bintang.pyramidepagar_aligncenter("#",5);
		bintang.pyramidepagar_terbalik("#",5);
	}
	
	public void bintang_panah(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=jumlah;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}	
		for(i=jumlah-1;i>=1;i--){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=jumlah;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}
	
	public void pagar_panah(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=jumlah;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}	
		for(i=jumlah-1;i>=1;i--){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=jumlah;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}
	
	public void bintang_fullpanah(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=1;j<i;j++){
				System.out.print(a);
				System.out.print(" ");
			}
			for(j=1;j<=1;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}	
		for(i=jumlah-1;i>=1;i--){
			for(j=1;j<i;j++){
				System.out.print(a);
				System.out.print(" ");
			}
			for(j=1;j<=1;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}
	
	public void pagar_fullpanah(String a,int jumlah){
		for(i=1;i<=jumlah;i++){
			for(j=1;j<i;j++){
				System.out.print(a);
				System.out.print(" ");
			}
			for(j=1;j<=1;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}	
		for(i=jumlah-1;i>=1;i--){
			for(j=1;j<i;j++){
				System.out.print(a);
				System.out.print(" ");
			}
			for(j=1;j<=1;j++){
				System.out.print(a);
			}
			System.out.print("\n");
		}
	}
}
