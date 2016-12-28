
	
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