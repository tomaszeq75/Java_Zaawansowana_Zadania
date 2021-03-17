package typy_wyliczeniowe;

public class App {
    public static void main(String[] args) {


    }

    private static void zadanie_2() {
        System.out.println(PackageSize.getPackageSize(7, 9));
        System.out.println(PackageSize.getPackageSize(17, 19));
        System.out.println(PackageSize.getPackageSize(21, 29));
        System.out.println(PackageSize.getPackageSize(1, 299));

        System.out.println(PackageSize.getPackageSizeLoop(7, 9));
        System.out.println(PackageSize.getPackageSizeLoop(17, 19));
        System.out.println(PackageSize.getPackageSizeLoop(21, 29));
        System.out.println(PackageSize.getPackageSizeLoop(1, 299));
    }

    private static void zadanie_1() {
        System.out.println(Weekday.isWeekDay(Weekday.CZW));
        System.out.println(Weekday.isWeekDay(Weekday.SOB));
        System.out.println(Weekday.isHoliday(Weekday.CZW));
        System.out.println(Weekday.isHoliday(Weekday.SOB));

        Weekday.whichIsGrater(Weekday.SOB, Weekday.NIE);
        Weekday.whichIsGrater(Weekday.CZW, Weekday.SRO);
        Weekday.whichIsGrater(Weekday.SOB, Weekday.SOB);

        System.out.println("--- v2 ---");
        Weekday2 weekday2 = Weekday2.WTO;
        System.out.println(weekday2);
        System.out.println("holiday: " + weekday2.isHoliday());
        System.out.println("weekday: " + weekday2.isWeekDay());
        weekday2.whichIsGrater(Weekday2.CZW);
    }
}
