package testing;

public class CobaBintang {
	int i,j;
	
	public void trapesium(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(bintang.bintang("a"));
			}
			for(j=1;j<=i;j++){
				System.out.print(bintang.bintang("a"));
			}
			System.out.print("\n");
		}
	}
	
	public void pyramidebintang_alignleft(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=i;j++){
				System.out.print(bintang.bintang("a"));
			}
			System.out.print("\n");
		}				
	}
	
	public String bintang(String a){
		return a="*";
	}
	
	public void pyramidepagar_alignleft(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=i;j++){
				System.out.print(bintang.pagar("a"));
			}
			System.out.print("\n");
		}				
	}
	
	public String pagar(String a){
		return a="#";
	}
	
	public void pyramidebintang_alignright(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(bintang.bintang("a"));
			}
			System.out.print("\n");
		}
	}
	
	public void pyramidepagar_alignright(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(bintang.pagar("a"));
			}
			System.out.print("\n");
		}
	}
	
	public void pyramidebintang_aligncenter(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(bintang.bintang("a"));
				System.out.print(" ");
			}
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			System.out.print("\n");
		}		
	}
	
	public void pyramidepagar_aligncenter(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(bintang.pagar("a"));
				System.out.print(" ");
			}
			for(j=jumlah;j>i;j--){
				System.out.print(" ");
			}
			System.out.print("\n");
		}		
	}
	
	public void pyramidebintang_terbalik(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=jumlah;i>=1;i--){
			for(j=i;j<jumlah;j++){
				System.out.print(" ");
			}
			for(j=i;j>=1;j--){
				System.out.print(bintang.bintang("a"));
				System.out.print(" ");
			}
			for(j=i;j<jumlah;j++){
				System.out.print(" ");
			}
			System.out.print("\n");
		}				
	}
	
	public void pyramidepagar_terbalik(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=jumlah;i>=1;i--){
			for(j=i;j<jumlah;j++){
				System.out.print(" ");
			}
			for(j=i;j>=1;j--){
				System.out.print(bintang.pagar("a"));
				System.out.print(" ");
			}
			for(j=i;j<jumlah;j++){
				System.out.print(" ");
			}
			System.out.print("\n");
		}				
	}
	
	public void pyramidebintang_bolong(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>=i;j--){
				System.out.print(bintang.bintang("a"));
			}
			for(j=1;j<i;j++){
				System.out.print(bintang.pagar("a"));
			}
			for(j=1;j<i;j++){
				System.out.print(bintang.pagar("a"));
			}
			for(j=jumlah;j>=i;j--){
				System.out.print(bintang.bintang("a"));
			}
			System.out.print("\n");
		}
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=i;j++){
				System.out.print(bintang.bintang("a"));
			}
			for(j=jumlah;j>i;j--){
				System.out.print(bintang.pagar("a"));
			}
			for(j=jumlah;j>i;j--){
				System.out.print(bintang.pagar("a"));
			}
			for(j=1;j<=i;j++){
				System.out.print(bintang.bintang("a"));
			}
			System.out.print("\n");
		}
	}
	
	public void pyramidepagar_bolong(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=jumlah;j>=i;j--){
				System.out.print(bintang.pagar("a"));
			}
			for(j=1;j<i;j++){
				System.out.print(bintang.bintang("a"));
			}
			for(j=1;j<i;j++){
				System.out.print(bintang.bintang("a"));
			}
			for(j=jumlah;j>=i;j--){
				System.out.print(bintang.pagar("a"));
			}
			System.out.print("\n");
		}
		for(i=1;i<=jumlah;i++){
			for(j=1;j<=i;j++){
				System.out.print(bintang.pagar("a"));
			}
			for(j=jumlah;j>i;j--){
				System.out.print(bintang.bintang("a"));
			}
			for(j=jumlah;j>i;j--){
				System.out.print(bintang.bintang("a"));
			}
			for(j=1;j<=i;j++){
				System.out.print(bintang.pagar("a"));
			}
			System.out.print("\n");
		}
	}
	
	public void bintang_kotak(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			System.out.print(bintang.bintang("a"));
			System.out.print(" ");
			for(j=1;j<=jumlah;j++){
				System.out.print(bintang.bintang("a"));
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
	public void pagar_kotak(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			System.out.print(bintang.pagar("a"));
			System.out.print(" ");
			for(j=1;j<=jumlah;j++){
				System.out.print(bintang.pagar("a"));
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
	public void pyramidebintang_diamond(){
		CobaBintang bintang=new CobaBintang();
		bintang.pyramidebintang_aligncenter(5);
		bintang.pyramidebintang_terbalik(5);
	}
	
	public void pyramidepagar_diamond(){
		CobaBintang bintang=new CobaBintang();
		bintang.pyramidepagar_aligncenter(5);
		bintang.pyramidepagar_terbalik(5);
	}
	
	public void bintang_panah(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=jumlah;j++){
				System.out.print(bintang.bintang("a"));
			}
			System.out.print("\n");
		}	
		for(i=jumlah-1;i>=1;i--){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=jumlah;j++){
				System.out.print(bintang.bintang("a"));
			}
			System.out.print("\n");
		}
	}
	
	public void pagar_panah(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=jumlah;j++){
				System.out.print(bintang.pagar("a"));
			}
			System.out.print("\n");
		}	
		for(i=jumlah-1;i>=1;i--){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=jumlah;j++){
				System.out.print(bintang.pagar("a"));
			}
			System.out.print("\n");
		}
	}
	
	public void bintang_fullpanah(int jumlah){
		CobaBintang bintang=new CobaBintang();
		for(i=1;i<=jumlah;i++){
			for(j=1;j<i;j++){
				System.out.print(bintang.bintang("a"));
			}
			for(j=1;j<=i;j++){
				System.out.print(bintang.bintang("a"));
			}
			System.out.print("\n");
		}	
		for(i=jumlah-1;i>=1;i--){
			for(j=1;j<i;j++){
				System.out.print(bintang.bintang("a"));
			}
			for(j=1;j<=i;j++){
				System.out.print(bintang.bintang("a"));
			}
			System.out.print("\n");
		}
	}
}
