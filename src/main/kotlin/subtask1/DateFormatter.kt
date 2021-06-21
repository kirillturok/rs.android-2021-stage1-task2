package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE")
            .withLocale(Locale.forLanguageTag("Ru"));
        try {
            return LocalDate.of(year.toInt(),month.toInt(),day.toInt()).format(formatter);
        }catch (e:Exception){
            return "Такого дня не существует"
        }
        throw NotImplementedError("Not implemented")
    }
}
