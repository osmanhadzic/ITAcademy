package SpeedConvrsion;

public class Converter {
	
	public static float con = 1.609f;
	
	public static double ToMilPerH(double toKmPerH) {
		
		if(toKmPerH > 0 ) {
			return toKmPerH / con;
		}else {
			return 0;
		}
		
	}
	
	public static double ToKmPerH(double toMilePerH) {
		
		if(toMilePerH > 0) {
			return toMilePerH * con;
		}else {
			return 0;
		}
		
	}

}
