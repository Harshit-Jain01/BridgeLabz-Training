
public class UnitConvertorOfTemperature{

    // Convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Convert Pounds to Kg
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = pounds * 0.453592;
        return pounds2kilograms;
    }

    // Convert Kg to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = kilograms * 2.20462;
        return kilograms2pounds;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = gallons * 3.78541;
        return gallons2liters;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = liters * 0.264172;
        return liters2gallons;
    }

    
    public static void main(String[] args) {
	
		//calling static methods
        System.out.println("F to C: " + convertFarhenheitToCelsius(98.6));
        System.out.println("C to F: " + convertCelsiusToFarhenheit(37));
        System.out.println("Pounds to Kg: " + convertPoundsToKilograms(10));
        System.out.println("Kg to Pounds: " + convertKilogramsToPounds(5));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(2));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(10));
    }
}
