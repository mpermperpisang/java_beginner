package testing;

public class CobaBilangan {
	int i,j,a,b,k;
	
	public void faktorial(int angka){
		i=angka;
		a=1;
		while(i>=1){
			System.out.print(i);
			if(i>1){
				System.out.print("*");
			}
			a=a*i;
			i--;
		}
		System.out.print(" = "+a);
	}
	
	public void fibonacci(int angka) {
		a = 1;
		b = a;
		System.out.println(a);
		for(i=a;i<angka;i++){
			System.out.println(a);
			  a = a+b;
			  b = a-b;
		}
	}

	public void prima(int angka){
        for (i = 1; i <= angka; i++) {					
            k = 0;									
            for (j = 2; j <= i; j++) {					
                if (i % j == 0) {						
                    if (i != j) {
                        k = 1;							
                    }
                    if (k != 1 && i == j) {				
                        System.out.print(i+" ");		
                    }
                }
            } 
        }
	}

	public void ganjil (int angka){
		for (i=1;i<=angka;i++){
			if(i % 2==1){
				System.out.print(i+" ");
			}
		}
	}
	
	public void genap (int angka){
		for (i=1;i<=angka;i++){
			if(i % 2==0){
				System.out.print(i+" ");
			}
		}
	}
	
	public void call_rekursif_ganjil(int angka){
		CobaBilangan bilangan=new CobaBilangan();
		for (i=1;i<=angka;i++){
			if(i % 2==1){
				a=1;
				System.out.print(bilangan.rekursif_ganjil(i+" "));
			}
			else{
				a=0;
			}
		}
	}
	
	public String rekursif_ganjil(String string){
		if(a==1){
			return rekursif_ganjil(string);
		}
		return string;
	}
	
	public void call_rekursif_genap(int angka){
		CobaBilangan bilangan=new CobaBilangan();
		for (i=1;i<=angka;i++){
			if(i % 2==0){
				a=1;
				System.out.print(bilangan.rekursif_genap(i+" "));
			}
			else{
				a=0;
			}
		}
	}
	
	public String rekursif_genap(String string){
		if(a==1){
			return rekursif_genap(string);
		}
		return string;
	}

	public boolean kelipatantiga(int angka) {
		i=1;
		while(i<=angka){
			if(i % 3==0){
				System.out.print(i+" ");
			}	
			i++;
		}
		return false;
	}
	
	public void call_rekursif_fibonacci(int angka){
		CobaBilangan bilangan = new CobaBilangan();
		for (i=1;i<=angka;i++){
        	System.out.println(bilangan.rekursif_fibonacci(i));
        }
	}
	
	public int rekursif_fibonacci(int i){
		if(i==1 || i==0){
			return i;
		}
		else {
			return rekursif_fibonacci(i-2)+rekursif_fibonacci(i-1);
		}
	}
	
	public void mean(int i,int j,int k){
		System.out.print("("+i+" + "+j+" + "+k+") / 3 = ");
		double z=(i+j+k)/3.0;
        System.out.printf("%.2f",z);
	}

	public int[] sorting(int i,int j, int k) {
        int [] angka;
        angka = new int[3];
        angka[0]=i;
        angka[1]=j;
        angka[2]=k;
		return angka;
	}
	
	public void sorting_ascending(int angka[]){
		CobaBilangan bilangan=new CobaBilangan();
		bilangan.sorting(a,b,k);
        for (i=0 ; i<angka.length ;i++){
            int temp = angka[i];
            for (j=i ; j<angka.length ; j++){
            	if (angka[j] <= angka[i]){
            		angka [i] = angka [j];
                    angka[j] = temp;
                    temp = angka[i];
                }
            }
            System.out.print(angka[i]+" ");
        }     
	}
	
	public void sorting_descending(int angka[]){
		CobaBilangan bilangan=new CobaBilangan();
		bilangan.sorting(a,b,k);
        for (i=angka.length-1 ; i>=0 ;i--){
            int temp = angka[i];
            for (j=angka.length-1 ; j>=i ; j--){
            	if (angka[j] <= angka[i]){
            		angka [i] = angka [j];
                    angka[j] = temp;
                    temp = angka[i];
                }
            }
            System.out.print(angka[i]+" ");
        }     
	}
}