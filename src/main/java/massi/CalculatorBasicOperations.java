package massi;

/*
 * I den klass finns 4 metoder av Basic Operation plus,minus,multiply och division.
 * 
 * 
 */

public class CalculatorBasicOperations {

	/*
	 * Den metod l�gga till FirstNumber och SecondNmber sedan return result integer v�rde av FirstNumber + SecondNmber.
	 * @param FirstNumber  integer
	 * @param SecondNmber  integer
	 * @param return  integer v�rde av resultat from FirstNumber + SecondNmber
	 */
	
	public int addition(int FirstNumber, int SecondNmber){
		return FirstNumber+SecondNmber;
	}
	/*
	 * Den metod l�gga till FirstNumber och SecondNmber sedan return result double v�rde av FirstNumber + SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double v�rde av resultat from FirstNumber + SecondNmber
	 */

	public double addition(double FirstNumber, double SecondNmber){
		return FirstNumber+SecondNmber;
	}
	/*
	 * Den metod l�gga till FirstNumber och SecondNmber sedan return result short v�rde av FirstNumber + SecondNmber.
	 * @param FirstNumber  short
	 * @param SecondNmber  short
	 * @param return  short v�rde av resultat from FirstNumber + SecondNmber
	 */
	public short addition(short FirstNumber, short SecondNmber){
		return(short)( FirstNumber + SecondNmber);
	}
	/*
	 * Den metod l�gga till FirstNumber och SecondNmber sedan return result long v�rde av FirstNumber + SecondNmber.
	 * @param FirstNumber  long
	 * @param SecondNmber  long
	 * @param return  long v�rde av resultat from FirstNumber + SecondNmber
	 */
	
	public long addition(long FirstNumber, long SecondNmber){
		return FirstNumber+SecondNmber;
	}
	
	/*
	 * Den metod minus FirstNumber och SecondNmber sedan return result integer v�rde av FirstNumber-SecondNmber.
	 * @param FirstNumber  integer
	 * @param SecondNmber  integer
	 * @param return  integer v�rde av resultat from FirstNumber - SecondNmber
	 */
	
	public int subtraction (int FirstNumber, int SecondNmber){
		return FirstNumber - SecondNmber ;
		
	}
	/*
	 * Den metod minus FirstNumber och SecondNmber sedan return result short v�rde av FirstNumber-SecondNmber.
	 * @param FirstNumber  short
	 * @param SecondNmber  short
	 * @param return  short v�rde av resultat from FirstNumber - SecondNmber
	 */
	public short subtraction( short FirstNumber,short SecondNmber){
		return (short)(FirstNumber - SecondNmber) ;
		
	}
	/*
	 * Den metod minus FirstNumber och SecondNmber sedan return result double v�rde av FirstNumber-SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double v�rde av resultat from FirstNumber - SecondNmber
	 */
	public double subtraction(double FirstNumber,double SecondNmber){
	 return FirstNumber - SecondNmber ;
	}
	/*
	 * Den metod minus FirstNumber och SecondNmber sedan return result long v�rde av FirstNumber-SecondNmber.
	 * @param FirstNumber  long
	 * @param SecondNmber  long
	 * @param return  long v�rde av resultat from FirstNumber - SecondNmber
	 */
	public long subtraction(long FirstNumber, long SecondNmber){
		return  FirstNumber - SecondNmber;
	}
	/*
	 * Den metod g�nger FirstNumber och snum sedan return result integer v�rde av FirstNumber*SecondNmber.
	 * @param FirstNumber  integer
	 * @param SecondNmber  integer
	 * @param return  integer v�rde av resultat from FirstNumber *SecondNmber
	 */
	
	public int multiplikation (int FirstNumber, int SecondNmber){
		return FirstNumber * SecondNmber ;
		
	}
	/*
	 * Den metod g�nger FirstNumber och SecondNmber sedan return result short v�rde av FirstNumber*SecondNmber.
	 * @param FirstNumber  short
	 * @param SecondNmber  short
	 * @param return  short v�rde av resultat from FirstNumber *SecondNmber
	 */
	public short multiplikation( short FirstNumber,short SecondNmber){
		return (short)(FirstNumber * SecondNmber) ;
		
	}
	/*
	 * Den metod g�nger FirstNumber och SecondNmber sedan return result double v�rde av FirstNumber*SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double v�rde av resultat from FirstNumber *SecondNmber
	 */
	public double multiplikation(double FirstNumber,double SecondNmber){
	 return FirstNumber * SecondNmber ;
	}
	/*
	 * Den metod g�nger FirstNumber och SecondNmber sedan return result long v�rde av FirstNumber*SecondNmber.
	 * @param FirstNumber  long
	 * @param SecondNmber  long
	 * @param return  long v�rde av resultat from FirstNumber *SecondNmber
	 */
	public long multiplikation(long FirstNumber, long SecondNmber){
		return  FirstNumber * SecondNmber;
	}
	/*
	 * Den metod dela FirstNumber och SecondNmber sedan return result integer v�rde av FirstNumber/SecondNmber.
	 * @param FirstNumber  integer
	 * @param SecondNmber  integer
	 * @param return  integer v�rde av resultat from FirstNumber /SecondNmber
	 */
	
	public int dividera (int FirstNumber, int SecondNmber){
		return FirstNumber / SecondNmber ;
		
	}
	/*
	 * Den metod dela FirstNumber och SecondNmber sedan return result short v�rde av FirstNumber/SecondNmber.
	 * @param FirstNumber  short
	 * @param SecondNmber  short
	 * @param return  short v�rde av resultat from FirstNumber /SecondNmber
	 */
	public short dividera( short FirstNumber,short SecondNmber){
		return (short)(FirstNumber / SecondNmber) ;
		
	}
	/*
	 * Den metod dela FirstNumber och SecondNmber sedan return result double v�rde av FirstNumber/SecondNmber.
	 * @param FirstNumber  double
	 * @param SecondNmber  double
	 * @param return  double v�rde av resultat from FirstNumber /SecondNmber.
	 */
	public double dividera(double FirstNumber,double SecondNmber){
	 return FirstNumber / SecondNmber ;
	}
	/*
	 * Den metod dela FirstNumber och SecondNmber sedan return result long v�rde av FirstNumber/SecondNmber.
	 * @param FirstNumber  long
	 * @param SecondNmber  long
	 * @param return  long v�rde av resultat from FirstNumber /SecondNmber
	 */
	public long dividera(long FirstNumber, long SecondNmber){
		return  FirstNumber / SecondNmber;
	}
	
	
}
/*
 * slut av CalculatorBasicOperationsInterface class
 * 
 */
