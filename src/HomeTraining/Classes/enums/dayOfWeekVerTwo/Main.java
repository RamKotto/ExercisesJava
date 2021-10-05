package HomeTraining.Classes.enums.dayOfWeekVerTwo;

import java.util.Arrays;

import static HomeTraining.Classes.enums.dayOfWeekVerTwo.DayOfWeekTwo.MONDAY;
import static HomeTraining.Classes.enums.dayOfWeekVerTwo.DayOfWeekTwo.SUNDAY;

public class Main {
    public static void main(String[] args) {
        System.out.println(SUNDAY.getTitle());
        System.out.println(MONDAY);

        System.out.println(Arrays.toString(DayOfWeekTwo.values()));

    }
}

/*
Воскресенье
DayOfWeek{title='Понедельник'}
[DayOfWeek{title='Воскресенье'}, DayOfWeek{title='Понедельник'},
DayOfWeek{title='Вторник'}, DayOfWeek{title='Среда'}, DayOfWeek{title='Четверг'},
DayOfWeek{title='Пятница'}, DayOfWeek{title='Суббота'}]
 */
