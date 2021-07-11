package basics.various;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter longFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter fullFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        System.out.println(returnFormattedDate(longFormat,"2034", "7", "2"));
    }

    public static LocalDate returnFormattedDate(DateTimeFormatter formatType, String year, String month, String day) {
        int x = Integer.parseInt(year);
        int y = Integer.parseInt(month);
        int z = Integer.parseInt(day);
        LocalDate date = LocalDate.of(x, y, z);
        String formattedDate = date.format(formatType);
        return LocalDate.parse(formattedDate);
    }
}
