public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
    }
//        long milesPerHour = Math.round(kilometersPerHour / 1.609);
//        return milesPerHour; >> umjesto toga kraće se piše red 10 (Math. uvijek vraća double)
        return Math.round(kilometersPerHour / 1.609);

    }
    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        }else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
