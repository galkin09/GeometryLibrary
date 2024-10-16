public class GeometryUtils {
    public static double convertToMeters(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "cm":
                return value / 100.0;
            case "mm":
                return value / 1000.0;
            case "km":
                return value * 1000.0;
            default:
                return value;
        }
    }

    public static boolean areEqual(double a, double b) {
        return Math.abs(a - b) < 0.0001;
    }
}
