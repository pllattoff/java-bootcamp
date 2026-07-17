package javaecosystem.chapter01.enums;

public enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String dayName;

    private DayOfWeek(String dayName) {
        this.dayName = dayName;
    }

    public String getDayOrWeekend() {
        switch (this) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return dayName;
            default:
                return "Weekend";
        }
    }
}
