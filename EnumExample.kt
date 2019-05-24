package kz.fa.onlinekassa.persistense

enum class Color {
    GOLD, BLACK, GREEN, PURPLE
}

fun main(args: Array<String>) {
    println(Color.GOLD)
    println(ColorMolor.GOLD.rgb)
}

enum class ColorMolor(val rgb: Int) {
    GOLD(123), BLACK(123123), GREEN(123123123), PURPLE(1231231231)
}