
import java.time.LocalDate;
import java.util.Random;

public class RandomDates {
    private static Random random = new Random();
    private static int minDay = (int) LocalDate.of(2000, 1, 1).toEpochDay();
    private static int maxDay = (int) LocalDate.of(2001, 1, 1).toEpochDay();
    private static long randomDay = minDay + random.nextInt(maxDay - minDay);

    public static LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

}
