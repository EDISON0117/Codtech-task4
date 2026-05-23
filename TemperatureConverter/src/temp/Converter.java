package temp;

public class Converter {

    double celsiusToFahrenheit(double c) { return (c * 9 / 5) + 32; }
    double celsiusToKelvin(double c)     { return c + 273.15; }
    double celsiusToRankine(double c)    { return (c + 273.15) * 9 / 5; }
    double celsiusToReaumur(double c)    { return c * 4 / 5; }

    double fahrenheitToCelsius(double f)  { return (f - 32) * 5 / 9; }
    double fahrenheitToKelvin(double f)   { return (f - 32) * 5 / 9 + 273.15; }
    double fahrenheitToRankine(double f)  { return f + 459.67; }
    double fahrenheitToReaumur(double f)  { return (f - 32) * 4 / 9; }

    double kelvinToCelsius(double k)     {
        if (k < 0) { System.out.println("Kelvin cannot be negative."); return 0; }
        return k - 273.15;
    }
    double kelvinToFahrenheit(double k)  {
        if (k < 0) { System.out.println("Kelvin cannot be negative."); return 0; }
        return (k - 273.15) * 9 / 5 + 32;
    }
    double kelvinToRankine(double k)     {
        if (k < 0) { System.out.println("Kelvin cannot be negative."); return 0; }
        return k * 9 / 5;
    }
    double kelvinToReaumur(double k)     {
        if (k < 0) { System.out.println("Kelvin cannot be negative."); return 0; }
        return (k - 273.15) * 4 / 5;
    }

    double rankineToCelsius(double r)    { return (r - 491.67) * 5 / 9; }
    double rankineToFahrenheit(double r) { return r - 459.67; }
    double rankineToKelvin(double r)     { return r * 5 / 9; }
    double rankineToReaumur(double r)    { return (r - 491.67) * 4 / 9; }

    double reaumurToCelsius(double re)    { return re * 5 / 4; }
    double reaumurToFahrenheit(double re) { return re * 9 / 4 + 32; }
    double reaumurToKelvin(double re)     { return re * 5 / 4 + 273.15; }
    double reaumurToRankine(double re)    { return (re * 5 / 4 + 273.15) * 9 / 5; }

    void convertAll(double value, String unit) {
        double c, f, k, r, re;

        switch (unit.toUpperCase()) {
            case "C":
                c  = value;
                f  = celsiusToFahrenheit(c);
                k  = celsiusToKelvin(c);
                r  = celsiusToRankine(c);
                re = celsiusToReaumur(c);
                break;
            case "F":
                f  = value;
                c  = fahrenheitToCelsius(f);
                k  = fahrenheitToKelvin(f);
                r  = fahrenheitToRankine(f);
                re = fahrenheitToReaumur(f);
                break;
            case "K":
                k  = value;
                c  = kelvinToCelsius(k);
                f  = kelvinToFahrenheit(k);
                r  = kelvinToRankine(k);
                re = kelvinToReaumur(k);
                break;
            case "R":
                r  = value;
                c  = rankineToCelsius(r);
                f  = rankineToFahrenheit(r);
                k  = rankineToKelvin(r);
                re = rankineToReaumur(r);
                break;
            case "RE":
                re = value;
                c  = reaumurToCelsius(re);
                f  = reaumurToFahrenheit(re);
                k  = reaumurToKelvin(re);
                r  = reaumurToRankine(re);
                break;
            default:
                System.out.println("Unknown unit.");
                return;
        }

        System.out.println("\n--- All Conversions ---");
        System.out.printf("  Celsius    : %.4f °C%n",  c);
        System.out.printf("  Fahrenheit : %.4f °F%n",  f);
        System.out.printf("  Kelvin     : %.4f K%n",   k);
        System.out.printf("  Rankine    : %.4f °R%n",  r);
        System.out.printf("  Reaumur    : %.4f °Re%n", re);
    }
}