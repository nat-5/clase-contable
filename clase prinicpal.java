
 clase  pública ClasePrincipal {

	public  static  void  main ( String [] args ) {

		OperacionesContables operacion =  new  OperacionesContables ();
		Sistema . fuera . println (operacion . suma2 ( 100 , 100 ));
		
		Sistema . fuera . println (operacion . impuesto ( 200 ));
		
		doble impuesto = (operacion . impuesto ( 200 ));
		doble costo = operacion . resta2 ( 64 , 32 );
		
		Sistema . fuera . println (operacion . resta2 (costo, impuesto));
		
		Sistema . fuera . println (operacion . igss ( 3000 ));
		
		Sistema . fuera . println (operacion . bono14 ( 3000 , 10 ));
		
		Sistema . fuera . println (operacion . aguinaldo ( 3000 ));
		
		Sistema . fuera . println ( operacion . BoletoHonorario ( 1000 ));
		
		Sistema . fuera . println (operacion . isr ( 3000 ));
		
	}

}