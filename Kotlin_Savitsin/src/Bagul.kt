import java.lang.NumberFormatException

fun main()
{
    try {
    var num: Int
    println("Введите цифру 0-9:")
    num = readln()!!.toInt()
    when (num)
    {
        0 -> println("ноль")
        1 -> println("один")
        2 -> println("два")
        3 -> println("три")
        4 -> println("четыре")
        5 -> println("пять")
        6 -> println("шесть")
        7 -> println("семь")
        8 -> println("восемь")
        9 -> println("девять")
        else -> println("$num не в диапазоне от 0 до 9")
    }
}catch (e:NumberFormatException)
{
    println("Неверный формат ввода")
}}