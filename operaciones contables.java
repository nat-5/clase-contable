OperacionesContables de clase  pública {

	public  static  double  suma2 ( doble  a , doble  b ) {
		resultado doble = a + b;
		volver resultado;
	}
	público  estático  doble  resta2 ( doble  n1 , doble  n2 ) {
		resultado doble = n1 - n2;
		volver resultado;
	}
	 doble impuesto estático  público ( doble cantidad ) {  
		resultado doble = cantidad * 0.12 ;
		volver resultado;		
	}
	public  static  double  igss ( doble  SueldoBase ) {
		resultado doble =  SueldoBase * 0.0483 ;
		volver resultado;
	}
	public  static  double  bono14 ( double  SueldoBase , double  DiasLaborados ) {
		doble resultado =  SueldoBase * DiasLaborados / 365 ;
		volver resultado;
		
	}
	público  estático  doble  aguinaldo ( doble  Salario ) {
		doble salarioDiario =  Salario / 30 ;
		doble resultado = salarioDiario * 15 ;
		volver resultado;
	}
	público  estático  doble  BoletoHonorario ( doble  MontoBruto ) {
		resultado doble =  MontoBruto * 0.1075 ;
		volver resultado;
	}
	public  static  double  isr ( doble  RentaImponible ) {
		resultado doble =  RentaImponible * 0.5 ;
		volver resultado;
		
	}

}