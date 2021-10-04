package HomeTraining.Classes.enums.dayOfWeekExample;

public class Scholar {
    private ScholarSchedule scholarSchedule;
    private Boolean goToSchool;

    public void setScholarSchedule(ScholarSchedule scholarSchedule) {
        this.scholarSchedule = scholarSchedule;
    }

    public void getUp() {
        if (this.scholarSchedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Ура, можно поспать еще!");
        } else {
            System.out.println("Блин, опять в школу:(");
        }
    }
}
