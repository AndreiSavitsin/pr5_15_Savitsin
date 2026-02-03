import java.lang.NumberFormatException
fun main()
{
    try{
    var num1: Int
    var num2: Int
    var num3: Int
    var min: Int
    var text: String
    println("Количество желудей и Ниф-Нифа:")
    num1 = readln()!!.toInt()
    while (num1 < 0)
    {
        println("Количество не можеть быть меньше 0")
        println("Количество желудей и Ниф-Нифа:")
        num1 = readln()!!.toInt()
    }
    println("Количество желудей и Нуф-Нуфа:")
    num2 = readln()!!.toInt()
    while (num2 < 0)
    {
        println("Количество не можеть быть меньше 0")
        println("Количество желудей и Нуф-Нуфа:")
        num2 = readln()!!.toInt()
    }
    println("Количество желудей и Наф-Нафа:")
    num3 = readln()!!.toInt()
    while (num3 < 0)
    {
        println("Количество не можеть быть меньше 0")
        println("Количество желудей и Наф-Нафа:")
        num3 = readln()!!.toInt()
    }
    min = num1
    text = "у Ниф-Нифа"
    if (num2 < min)
    {
        min = num2
        text = "у Нуф-Нуфа"
    }
    else if (num3 < min)
    {
        min = num3
        text = "у Наф-Нафа"
    }
    println("Минимальное количество желудей $text: $min")
}catch (e:NumberFormatException)
{
    println("Неверный формат ввода")
}}