public class NextDayCalculator {
    public static String nextDay(int day, int month, int year) {
        if (day == 31 ) {
            return "1/" + (++month) + "/" + year;
        }
        return (++day) + "/" + month + "/" + year;
    }
}
