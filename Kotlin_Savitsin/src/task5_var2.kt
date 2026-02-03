import java.lang.NumberFormatException
fun main()
{
    try {
    var num: Int
    var units: Int
    var tens: Int
    println("Введите двухзначное число 10-99:")
    num = readln()!!.toInt()
    if (num < 10 || num > 99)
    {
        println("Число должно быть от 10 до 99")
    }
    else
    {
        units = num % 10
        tens = num / 10
        if (units == 2 || units == 7 || tens == 2 || tens == 7)
        {
            println("В числе $num присутствует 2 или 7")
        }
        else
        {
            println("В числе $num не присутсвует 2 или 7")
        }
    }
}catch (e:NumberFormatException)
{
    println("Неверный формат ввода")
}}