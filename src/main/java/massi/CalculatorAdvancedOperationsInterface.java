package massi;

/*
 * I den klass finns 10 metoder av Advanceed Operation sin,cos,tan,cotan,modulu,log ,sqrt,Pi,e,exp.
 * 
 * 
 */
interface CalculatorAdvancedOperationsInterface {
	
	/*
	 * Den metod räknar sin FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * return double värde av resultat from sin(FirstNumber)
	 */

	default double sin(double FirstNumber) {

		return  Math.sin(FirstNumber);
	}

	/*
	 * Den metod räknar cos FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * return double värde av resultat from cos(FirstNumber)
	 */

	default double cos(double FirstNumber) {

		return  Math.cos(FirstNumber);
	}
	
	/*
	 * Den metod räknar tan FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * return double värde av resultat from tan(FirstNumber)
	 */

	default double tan(double FirstNumber) {

		return  Math.tan(FirstNumber);
	}
	
	
	/*
	 * Den metod räknar cotan FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * return double värde av resultat from (FirstNumber*FirstNumber)
	 */

	default double xx(double FirstNumber) {

		return  Math.round(FirstNumber * FirstNumber);
	}
	
	/*
	 * Den metod räknar sqrt FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * return double värde av resultat from sqrt(FirstNumber)
	 */

	default double sqr(double FirstNumber) {

		return   Math.sqrt(FirstNumber);
	}
	

	/*
	 * Den metod räknar PI*FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * @param return double värde av resultat from 3.14444*FirstNumber.
	 */

	default double PI(double FirstNumber) {
	
		return  Math.round((Math.PI) * FirstNumber);
	}

	/*
	 * Den metod räknar e*FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 *  return double värde av resultat from e*FirstNumber
	 */

	default double E(double FirstNumber) {
	
		return  Math.round( Math.E * FirstNumber);
	}


	/*
	 * Den metod räknar exp(FirstNumber).
	 * 
	 * @param FirstNumber double
	 * 
	 * @param return double värde av resultat from exp(FirstNumber)
	 */

	default double EXP(double FirstNumber) {
		return  Math.exp(FirstNumber);
		
	}
	
	/*
	 * Den metod räknar log(FirstNumber).
	 * 
	 * @param FirstNumber double.
	 * 
	 * return double värde av resultat from log(FirstNumber)
	 */

	default double LOG(double FirstNumber) {

		return Math.log(FirstNumber);
	}
	
	
	/*
	 * Den metod räknar modulus av FirstNumber och SecondNumber sedan return
	 * result double värde av FirstNumber % SecondNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * @param SecondNumber double
	 * 
	 * return double värde av resultat from FirstNumber % SecondNumber.
	 */

	default double modulus(double FirstNumber, double SecondNumber) {

		return  FirstNumber % SecondNumber;
	}
	
}
/*
 * slut av CalculatorAdvancedOperations class
 */
