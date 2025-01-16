public class NextDayCalculator {

    public static final int LAST_DAY_OF_FULL_MONTH = 31;
    public static final int LAST_DAY_OF_MISS_MONTH = 30;
    public static final String SLASH = "/";
    public static final int FIRST_DAY_OF_MONTH = 1;

    public static String nextDay(int day, int month, int year) {
        return checkMonth(day, month, year);
    }

    private static String checkMonth(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == LAST_DAY_OF_FULL_MONTH) {
                    day = FIRST_DAY_OF_MONTH;
                    if (month == 12) {
                        day = FIRST_DAY_OF_MONTH;
                        year++;
                    } else {
                        month++;
                    }
                } else {
                    day++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == LAST_DAY_OF_MISS_MONTH) {
                    day = FIRST_DAY_OF_MONTH;
                    month++;
                } else {
                    day++;
                }
                break;
            case 2:
                checkIsLeapYear(year);
                if (day == 28) {
                    day = FIRST_DAY_OF_MONTH;
                    month++;
                } else if (day == 29) {
                    day = FIRST_DAY_OF_MONTH;
                    month++;
                } else {
                    day++;
                }
        }
        return day + SLASH + month + SLASH + year;
    }

    public static void checkIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
        }
    }
}
