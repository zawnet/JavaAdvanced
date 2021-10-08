package zadanie6;

import opp.zadanie6.Weekday;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeekdayTest {



    @Test
    public void isWeekDayTest(){
        for(Weekday day : Weekday.values()) {
            if(day != Weekday.SATURDAY && day != Weekday.SUNDAY) {
                assertEquals(true, day.isWeekDay());
            }
        }
    }
    @Test
    public void isWeekDayNegTest(){
        for(Weekday day : Weekday.values()) {
            if(day != Weekday.SATURDAY && day != Weekday.SUNDAY) {
                assertNotEquals(false, day.isWeekDay());
            }
        }
    }

    @Test
    public void isHolyDayTest(){
        for(Weekday day : Weekday.values()) {
            if(day == Weekday.SATURDAY || day == Weekday.SUNDAY) {
                assertEquals(true, day.isHoliDay());
            }
        }

    }
    @Test
    public void isHolyDayNegTest(){
        for(Weekday day : Weekday.values()) {
            if(day == Weekday.SATURDAY || day == Weekday.SUNDAY) {
                assertNotEquals(false, day.isHoliDay());
            }
        }
    }

    @Test
    public void compareToTest(){

        Weekday testDay = Weekday.MONDAY;
        boolean condition = false;
        if(Weekday.SATURDAY.compareTo(testDay) == 0){
            condition = true;
            assertTrue(condition);
        }
        if(Weekday.SUNDAY.compareTo(testDay) > 0){
            condition = true;
            assertTrue(condition);
        }

        if(Weekday.FRIDAY.compareTo(testDay) < 0){
            condition = true;
            assertTrue(condition);
        }
        if(Weekday.THURSDAY.compareTo(testDay) < 0){
            condition = true;
            assertTrue(condition);
        }

        if(Weekday.WEDNESDAY.compareTo(testDay) < 0){
            condition = true;
            assertTrue(condition);
        }
        if(Weekday.TUESDAY.compareTo(testDay) < 0){
            condition = true;
            assertTrue(condition);
        }
        if(Weekday.MONDAY.compareTo(testDay) < 0){
            condition = true;
            assertTrue(condition);
        }
    }


}
