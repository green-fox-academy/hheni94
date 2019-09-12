public class CodingHours {
    public static void main(String[] args) {

    int dailyHours = 6;
    double oneWeekHours = 30;
    int semesterWeeks = 17;
    int averageWorkHoursWeekly = 52;

        System.out.println("Number of hours spent with coding in a semester:");
        System.out.println(oneWeekHours * semesterWeeks);

        System.out.println("The percentage of the coding hours in the semester:");
        double percentage = Math.round(100 * (oneWeekHours / averageWorkHoursWeekly));
        System.out.println(percentage);
    }
}
