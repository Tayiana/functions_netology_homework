package ru.netology

/**Задача №1 - «Только что»*/

const val seconds = 3 * 60 * 60 + 50
const val minutes: Int = seconds / 60
const val hours: Int = seconds / 3600


fun main() {
    agoToText()
}


fun agoToText(): Unit {
    val minuteText = getMinutesText(minutes)
    val hourText = getHoursText(hours)
    return when (seconds) {
        in 0..60 -> println("был(а) только что")
        in 61..60 * 60 -> println("был(а) $minutes $minuteText  назад")
        in 60 * 60 + 1..24 * 60 * 60 -> println("был(а) $hours $hourText назад")
        in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 -> println("был(а) сегодня")
        in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 -> println("был(а) вчера")
        else -> println("был(а) давно")
    }
}

fun getMinutesText(minutes: Int): String {
    return when (minutes) {
        1, 21, 31, 41, 51 -> { "минуту" }
        in 2..4, in 22..24, in 32..34, in 42..44, in 52..54 -> { "минуты" }
        in 5..60 -> { "минут" }
        else -> { "" }
    }
}

fun getHoursText(hours: Int): String {
    return when (hours) {
        1, 21 -> { "час" }
        in 2..4, in 22..24 -> { "часа" }
        else -> { "часов" }
    }
}

