public class SecondsInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int currentHoursInSeconds = (currentHours * 60 * 60);
        int currentMinutesInSeconds = (currentMinutes * 60);
        int currentTimeInSeconds = currentSeconds + currentHoursInSeconds + currentMinutesInSeconds;

        int aDayInSeconds = (24 * 60 * 60);
        int remainingTime = (aDayInSeconds - currentTimeInSeconds);

        System.out.println("The remaining seconds from this day is: " + remainingTime);
    }
}
