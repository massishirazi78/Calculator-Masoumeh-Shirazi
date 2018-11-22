package massi;

/*
 * I den klass finns 10 metoder av Advanceed Operation sin,cos,tan,cotan,modulu,log ,sqrt,Pi,e,exp.
 * 
 * 
 */
interface CalculatorAdvancedOperationsInterface {
	
	/*
	 * Den metod r�knar sin FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * return double v�rde av resultat from sin(FirstNumber)
	 */

	default double sin(double FirstNumber) {

		return  Math.sin(FirstNumber);
	}

	/*
	 * Den metod r�knar cos FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * return double v�rde av resultat from cos(FirstNumber)
	 */

	default double cos(double FirstNumber) {

		return  Math.cos(FirstNumber);
	}
	
	/*
	 * Den metod r�knar tan FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * return double v�rde av resultat from tan(FirstNumber)
	 */

	default double tan(double FirstNumber) {

		return  Math.tan(FirstNumber);
	}
	
	
	/*
	 * Den metod r�knar cotan FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * return double v�rde av resultat from (FirstNumber*FirstNumber)
	 */

	default double xx(double FirstNumber) {

		return  Math.round(FirstNumber * FirstNumber);
	}
	
	/*
	 * Den metod r�knar sqrt FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * return double v�rde av resultat from sqrt(FirstNumber)
	 */

	default double sqr(double FirstNumber) {

		return   Math.sqrt(FirstNumber);
	}
	

	/*
	 * Den metod r�knar PI*FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * @param return double v�rde av resultat from 3.14444*FirstNumber.
	 */

	default double PI(double FirstNumber) {
	
		return  Math.round((Math.PI) * FirstNumber);
	}

	/*
	 * Den metod r�knar e*FirstNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 *  return double v�rde av resultat from e*FirstNumber
	 */

	default double E(double FirstNumber) {
	
		return  Math.round( Math.E * FirstNumber);
	}


	/*
	 * Den metod r�knar exp(FirstNumber).
	 * 
	 * @param FirstNumber double
	 * 
	 * @param return double v�rde av resultat from exp(FirstNumber)
	 */

	default double EXP(double FirstNumber) {
		return  Math.exp(FirstNumber);
		
	}
	
	/*
	 * Den metod r�knar log(FirstNumber).
	 * 
	 * @param FirstNumber double.
	 * 
	 * return double v�rde av resultat from log(FirstNumber)
	 */

	default double LOG(double FirstNumber) {

		return Math.log(FirstNumber);
	}
	
	
	/*
	 * Den metod r�knar modulus av FirstNumber och SecondNumber sedan return
	 * result double v�rde av FirstNumber % SecondNumber.
	 * 
	 * @param FirstNumber double
	 * 
	 * @param SecondNumber double
	 * 
	 * return double v�rde av resultat from FirstNumber % SecondNumber.
	 */

	default double modulus(double FirstNumber, double SecondNumber) {

		return  FirstNumber % SecondNumber;
	}
	
}
/*
 * slut av CalculatorAdvancedOperations class
 */
