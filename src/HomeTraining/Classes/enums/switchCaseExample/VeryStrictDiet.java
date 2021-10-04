package HomeTraining.Classes.enums.switchCaseExample;

import HomeTraining.Classes.enums.dayOfWeekExample.DayOfWeek;

public class VeryStrictDiet {

    public void takeLunch(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case SUNDAY:
                System.out.println("Воскресный обед! Сегодня можно даже немного сладкого");
                break;
            case MONDAY:
                System.out.println("Обед для понедельника: куриная лапша!");
                break;
            case TUESDAY:
                System.out.println("Вторник, сегодня суп из сельдерея :(");
                break;
            //...и так далее до конца
        }
    }
}
