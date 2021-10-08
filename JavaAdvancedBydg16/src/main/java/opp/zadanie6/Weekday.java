package opp.zadanie6;

public enum Weekday  {
    MONDAY(1,true,false),
    TUESDAY(2,true,false),
    WEDNESDAY(3,true,false),
    THURSDAY(4,true,false),
    FRIDAY(5,true,false),
    SATURDAY(6,false,true),
    SUNDAY(7,false,true);

    private final int dayNumber;
    private final boolean weekDay;
    private final boolean holiDay;

    Weekday(int dayNumber, boolean weekdDay, boolean holiDay) {
        this.dayNumber = dayNumber;
        this.weekDay = weekdDay;
        this.holiDay = holiDay;
    }



    public boolean isWeekDay() {
        return weekDay;
    }

    public boolean isHoliDay() {
        return holiDay;
    }





}
