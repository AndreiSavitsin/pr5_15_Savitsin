import java.lang.NumberFormatException
fun main()
{
    try{
    var age: Int
    println("Введите возраст")
    age = readln()!!.toInt()
    if (age < 0 || age > 150)
    {
        println("Невозможный возраст")
    }
    else
    {
        when
        {
            age in 0..2 -> println("младенец")
            age in 3..6 -> println("ребёнок")
            age in 7..16 -> println("школьник")
            age in 17..20 -> println("студент")
            age in 21..60 -> println("молодой человек")
            age > 60 -> println("пожилой человек")
        }
    }
}catch(e:NumberFormatException)
{
    println("Неверный формат ввода")
}}
