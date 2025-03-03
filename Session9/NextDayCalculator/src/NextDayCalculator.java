public class NextDayCalculator {

    public static final int LAST_DAY_OF_FULL_MONTH = 31;
    public static final int LAST_DAY_OF_MISS_MONTH = 30;
    public static final int LAST_DAY_OF_FEBRUARY_NON_LEAP = 28;
    public static final int LAST_DAY_OF_FEBRUARY_LEAP = 29;
    public static final String SLASH = "/";
    public static final int FIRST_DAY_OF_MONTH = 1;

    public static String nextDay(int day, int month, int year) {
        return calculateNextDay(day, month, year);
    }

    private static String calculateNextDay(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == LAST_DAY_OF_FULL_MONTH) {
                    return resetDay(day, month, year);
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day == LAST_DAY_OF_MISS_MONTH) {
                    return resetDay(day, month, year);
                }
                break;

            case 2:
                int lastDayOfFebruary = checkIsLeapYear(year) ? LAST_DAY_OF_FEBRUARY_LEAP : LAST_DAY_OF_FEBRUARY_NON_LEAP;
                if (day == lastDayOfFebruary) {
                    return resetDay(day, month, year);
                }
                break;
        }
        day++;
        return day + SLASH + month + SLASH + year;
    }

    private static String resetDay(int day, int month, int year) {
        day = FIRST_DAY_OF_MONTH;
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        return day + SLASH + month + SLASH + year;
    }

    private static boolean checkIsLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
