package typy_wyliczeniowe;

public enum Weekday {
    PON, WTO, SRO,CZW,PIA, SOB,NIE;

    public static boolean isHoliday(Weekday weekday) {
        return (weekday == SOB || weekday == NIE);
    }

    public static boolean isWeekDay(Weekday weekday) {
        System.out.print(weekday + " is weekday: ");
        return !isHoliday(weekday);
    }

    public static void whichIsGrater(Weekday day1, Weekday day2) {
        if (day1.compareTo(day2) < 0) {
            System.out.println(day1 + " is before " + day2);
        } else if (day1.compareTo(day2) > 0) {
            System.out.println(day1 + " is after " + day2);
        } else {
            System.out.println("It's the same day");
        }
    }

}
