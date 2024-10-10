public class Converter {
    private static final double METER_TO_YARD = 1.09361;
    private static final double CENTIMETER_TO_YARD = 91.44;
    private static final double FOOT_TO_YARD = 3;
    private static final double MILE_TO_YARD = 1760;

    public double setValueToM(double yard) {
        double meter = yard / METER_TO_YARD;
        return meter;
    }

    public double setValueToCM(double yard) {
        double centimeter = yard * CENTIMETER_TO_YARD;
        return centimeter;
    }

    public double setValueToFeet(double yard) {
        double feet = yard * FOOT_TO_YARD;
        return feet;
    }

    public double setValueToMiles(double yard) {
        double mile = yard / MILE_TO_YARD;
        return mile;
    }
}
