import java.lang.NumberFormatException

fun main()
{
    try {
    var num1: Double
    var num2: Double
    println("Введите первое число:")
    num1 = readln()!!.toDouble()
    println("Введите второе число:")
    num2 = readln()!!.toDouble()
    if (num1 > num2)
    {
        num1 = num1 + 1
    }
    else if (num2 > num1)
    {
        num2 = num2 + 1
    }
    else
    {
        num1 = num1 * num1 * num1
    }
    println(num1)
    println(num2)
}catch (e:NumberFormatException)
{
    println("Неверный формат")
}}