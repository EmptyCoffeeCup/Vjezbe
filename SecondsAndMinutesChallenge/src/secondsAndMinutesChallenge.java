public class secondsAndMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));

    }
    public static String getDurationString (long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
        return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h"; // ako ispred sata/minute/sekunde želimo
        if (hours < 10) {                 // dodati nulu
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m"; // ako ispred sata/minute/sekunde želimo
        if (remainingMinutes < 10) {                 // dodati nulu
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s"; // ako ispred sata/minute/sekunde želimo
        if (seconds < 10) {                 // dodati nulu
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
    }
    public static String getDurationString (long seconds) {

        if (seconds < 0) {
            return "Invalid value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds); // ovo je kraći način
             // duži način je String x = return getDurationString(minutes, seconds);
             // return x;
    }
}
