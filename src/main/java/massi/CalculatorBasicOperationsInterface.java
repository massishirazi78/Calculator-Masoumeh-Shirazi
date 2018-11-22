package massi;

/*
 * I den klass finns 4 metoder av Basic Operation plus,minus,multiply och division.
 * 
 * 
 */

 interface CalculatorBasicOperationsInterface {

	
	/*
	 * Den metod l�gga till FirstNumber och SecondNmber sedan return result double v�rde av FirstNumber + SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double v�rde av resultat from FirstNumber + SecondNmber
	 */

	 default double addition(double FirstNumber, double SecondNmber){
		return Math.round(FirstNumber+SecondNmber);
	}
	
	/*
	 * Den metod minus FirstNumber och SecondNmber sedan return result double v�rde av FirstNumber-SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double v�rde av resultat from FirstNumber - SecondNmber
	 */
	 default double subtraction(double FirstNumber,double SecondNmber){
	 return Math.round(FirstNumber - SecondNmber) ;
	}
	
	
	/*
	 * Den metod g�nger FirstNumber och SecondNmber sedan return result double v�rde av FirstNumber*SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double v�rde av resultat from FirstNumber *SecondNmber
	 */
	 default double multiplikation(double FirstNumber,double SecondNmber){
	 return Math.round(FirstNumber * SecondNmber) ;
	}
	
	/*
	 * Den metod dela FirstNumber och SecondNmber sedan return result double v�rde av FirstNumber/SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double v�rde av resultat from FirstNumber /SecondNmber.
	 */
	default double dividera(double FirstNumber,double SecondNmber){
	 return Math.round(FirstNumber / SecondNmber) ;
	}
	
	
	
}
/*
 * slut av CalculatorBasicOperationsInterface class
 * 
 */
