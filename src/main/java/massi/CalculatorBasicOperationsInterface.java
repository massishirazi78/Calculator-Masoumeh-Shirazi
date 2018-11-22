package massi;

/*
 * I den klass finns 4 metoder av Basic Operation plus,minus,multiply och division.
 * 
 * 
 */

 interface CalculatorBasicOperationsInterface {

	
	/*
	 * Den metod lägga till FirstNumber och SecondNmber sedan return result double värde av FirstNumber + SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double värde av resultat from FirstNumber + SecondNmber
	 */

	 default double addition(double FirstNumber, double SecondNmber){
		return Math.round(FirstNumber+SecondNmber);
	}
	
	/*
	 * Den metod minus FirstNumber och SecondNmber sedan return result double värde av FirstNumber-SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double värde av resultat from FirstNumber - SecondNmber
	 */
	 default double subtraction(double FirstNumber,double SecondNmber){
	 return Math.round(FirstNumber - SecondNmber) ;
	}
	
	
	/*
	 * Den metod gånger FirstNumber och SecondNmber sedan return result double värde av FirstNumber*SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double värde av resultat from FirstNumber *SecondNmber
	 */
	 default double multiplikation(double FirstNumber,double SecondNmber){
	 return Math.round(FirstNumber * SecondNmber) ;
	}
	
	/*
	 * Den metod dela FirstNumber och SecondNmber sedan return result double värde av FirstNumber/SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double värde av resultat from FirstNumber /SecondNmber.
	 */
	default double dividera(double FirstNumber,double SecondNmber){
	 return Math.round(FirstNumber / SecondNmber) ;
	}
	
	
	
}
/*
 * slut av CalculatorBasicOperationsInterface class
 * 
 */
