package SpeedConvrsion;

/**
 * Date: Oct 07-2019
 * Ova funkcija pretvara milje na sat u km na sat
 * 
 * Autor: Osman
 * Version: 0.1
 * 
*/
public class Converter {
	
	/**
	 * 1 milja na sat je 1.609 km na sat 
	 */
	
	public final float con = 1.609f;
	
	/**
	 * Ova funkcija prima doubel vrijednost brzine u km na sat,
	 * zatim je djeli sa con = 1.609 i pretvara u milje na sat
	 * 
	 * @param toKmPerH
	 * @return double 
	 */
	
	
	public  double ToMilPerH(double toKmPerH) {
		
		if(toKmPerH > 0 ) {
			return toKmPerH / con; 
		}else {
			return 0;
		}
		
		
	}
	/**
	 * 
	 * Ova funkcija prima doubel vrijednost brzine u mile na sat,
	 * zatim je mnozi sa con = 1.609 i pretvara u km na sat
	 * 
	 * @param toMilePerH
	 * @return double
	 */
	
	public  double ToKmPerH(double toMilePerH) {
		
		if(toMilePerH > 0) {
			return toMilePerH * con;
		}else {
			return 0;
		}
		
	}

}
