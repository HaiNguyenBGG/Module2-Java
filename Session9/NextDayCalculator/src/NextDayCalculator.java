public class NextDayCalculator {

    public static final int LAST_DAYOF_FULL_MONTH = 31;
    public static final int LAST_DAYOF_MISS_MONTH = 30;

    public static String nextDay(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == LAST_DAYOF_FULL_MONTH) {
                    day = 1;
                    if (month == 12) {
                        month = 1;
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
                if (day == LAST_DAYOF_MISS_MONTH) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
                break;
            case 2:
                checkIsLeapYear(year);
                if (day == 28) {
                    day = 1;
                    month++;
                } else if (day == 29) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
        }
        return day + "/" + month + "/" + year;
    }
    public static void checkIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
        }
    }
}
