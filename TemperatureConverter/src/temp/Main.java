package temp;

import java.util.Scanner;

public class Main {
    static Scanner   sc = new Scanner(System.in);
    static Converter cv = new Converter();

    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("    TEMPERATURE CONVERTER     ");
        System.out.println("==============================");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1.  Celsius    -> All");
            System.out.println("2.  Fahrenheit -> All");
            System.out.println("3.  Kelvin     -> All");
            System.out.println("4.  Rankine    -> All");
            System.out.println("5.  Reaumur    -> All");
            System.out.println("6.  Custom (pick from & to)");
            System.out.println("7.  Exit");
            System.out.print("Choose: ");
            String ch = sc.nextLine();

            if (ch.equals("1")) {
                double v = input("Celsius value: ");
                cv.convertAll(v, "C");

            } else if (ch.equals("2")) {
                double v = input("Fahrenheit value: ");
                cv.convertAll(v, "F");

            } else if (ch.equals("3")) {
                double v = input("Kelvin value: ");
                cv.convertAll(v, "K");

            } else if (ch.equals("4")) {
                double v = input("Rankine value: ");
                cv.convertAll(v, "R");

            } else if (ch.equals("5")) {
                double v = input("Reaumur value: ");
                cv.convertAll(v, "RE");

            } else if (ch.equals("6")) {
                customConvert();

            } else if (ch.equals("7")) {
                System.out.println("Bye!");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    static double input(String msg) {
        System.out.print(msg);
        return Double.parseDouble(sc.nextLine());
    }

    static void show(String from, String to, double result) {
        System.out.printf("Result (%s -> %s) = %.4f%n", from, to, result);
    }

    static void customConvert() {
        System.out.println("\nUnits: C = Celsius | F = Fahrenheit | K = Kelvin | R = Rankine | RE = Reaumur");
        System.out.print("From unit: ");
        String from = sc.nextLine().trim().toUpperCase();
        System.out.print("To unit  : ");
        String to   = sc.nextLine().trim().toUpperCase();
        double v    = input("Value    : ");

        String key = from + "_" + to;
        double result;

        switch (key) {
            case "C_F":  result = cv.celsiusToFahrenheit(v);    break;
            case "C_K":  result = cv.celsiusToKelvin(v);        break;
            case "C_R":  result = cv.celsiusToRankine(v);       break;
            case "C_RE": result = cv.celsiusToReaumur(v);       break;

            case "F_C":  result = cv.fahrenheitToCelsius(v);    break;
            case "F_K":  result = cv.fahrenheitToKelvin(v);     break;
            case "F_R":  result = cv.fahrenheitToRankine(v);    break;
            case "F_RE": result = cv.fahrenheitToReaumur(v);    break;

            case "K_C":  result = cv.kelvinToCelsius(v);        break;
            case "K_F":  result = cv.kelvinToFahrenheit(v);     break;
            case "K_R":  result = cv.kelvinToRankine(v);        break;
            case "K_RE": result = cv.kelvinToReaumur(v);        break;

            case "R_C":  result = cv.rankineToCelsius(v);       break;
            case "R_F":  result = cv.rankineToFahrenheit(v);    break;
            case "R_K":  result = cv.rankineToKelvin(v);        break;
            case "R_RE": result = cv.rankineToReaumur(v);       break;

            case "RE_C": result = cv.reaumurToCelsius(v);       break;
            case "RE_F": result = cv.reaumurToFahrenheit(v);    break;
            case "RE_K": result = cv.reaumurToKelvin(v);        break;
            case "RE_R": result = cv.reaumurToRankine(v);       break;

            default:
                if (from.equals(to)) System.out.println("Same unit, no conversion needed.");
                else                 System.out.println("Invalid unit combination.");
                return;
        }

        show(from, to, result);
    }
}