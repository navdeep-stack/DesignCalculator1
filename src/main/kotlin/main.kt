import java.lang.invoke.SwitchPoint
import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    println("Enter an operator to perform calculation: +, -, *, /, %")
    val obj = readLine()
    println("Enter first number:")
    val num1 = input.nextDouble()
    println("Enter second number:")
    val num2 = input.nextDouble()
    println("Enter Third number:")
    val num3 = input.nextDouble()
    println("Enter Fourth number:")
    val num4 = input.nextDouble()
    println("Enter Fifth number:")
    val num5 = input.nextDouble()

    val result = when (obj) {

        "+" -> num1 + num2 / num3
        "-" -> num3 - num2 + num1
        "*" -> num1 * num2 * num4
        "/" -> num1 / num2 * num5
        "%" -> num1 % num2 + num4

        else -> "$obj Invalid operator  "
    }

    println("Result of entered operation: $result")



}