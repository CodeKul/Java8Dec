import java.time.LocalDate;

public class Temp1 {
    public static void main(String[] args) {
        LocalDate fromDate=LocalDate.of(2023,1,12);
        LocalDate toDate=LocalDate.of(2023,1,17);
//
        for (LocalDate currentDate = fromDate, nextDate; currentDate.isBefore(toDate); currentDate = nextDate) {
            nextDate = currentDate.plusDays(1);
            System.out.println(nextDate);
        }



    }
}
