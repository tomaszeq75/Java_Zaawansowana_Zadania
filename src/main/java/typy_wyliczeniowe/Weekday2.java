package typy_wyliczeniowe;

public enum Weekday2 {
    PON, WTO, SRO, CZW, PIA, SOB, NIE;

    public boolean isHoliday() {
        return (this == SOB || this == NIE);
    }

    public boolean isWeekDay() {
        return !(this == SOB || this == NIE);
    }

    public void whichIsGrater(Weekday2 day) {
        if (day.compareTo(this) > 0) {
            System.out.println(this + " is before " + day);
        } else if (day.compareTo(this) < 0) {
            System.out.println(this + " is after " + day);
        } else {
            System.out.println("It's the same day");
        }
    }

}
