package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        fun sumInt (array: Array<*>): Int
        {
            var sum = 0
            for (i in array)
                if (i is Int)
                    sum+=i
            return sum
        }

        fun strings (array: Array<*>):String
        {
            var word = ""
            for (i in array)
                if (i is String)
                    word = word.plus(i)
            return word
        }
        when (blockB) {
            Int::class -> return sumInt(blockA)
            String::class -> return strings(blockA)
            LocalDate::class -> {
                var date = LocalDate.MIN
                for (i in blockA)
                    if (i is LocalDate)
                        if (date.isBefore(i))
                            date = i
                return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
        }
        throw NotImplementedError("Not implemented")
    }
}
