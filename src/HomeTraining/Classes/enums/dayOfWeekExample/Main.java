package HomeTraining.Classes.enums.dayOfWeekExample;

public class Main {
    public static void main(String[] args) {
        ScholarSchedule scholarSchedule = new ScholarSchedule();
        scholarSchedule.setDayOfWeek(DayOfWeek.SUNDAY);

        Scholar scholar = new Scholar();
        scholar.setScholarSchedule(scholarSchedule);
        scholar.getUp();
    }
}
