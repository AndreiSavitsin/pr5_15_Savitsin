import java.lang.NumberFormatException
fun main()
{
    try{
    var num: Double
    println("Введите число")
    num = readln()!!.toDouble()
    when
    {
        num <= -3.0 -> println(9)
        num > -3.0 -> println(1/(num*num+1))
    }
}catch (e:NumberFormatException)
{
    println("Неверный формат ввода")
}}