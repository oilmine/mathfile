//> using scala 3.6.3

@main def math(x: Int, y: Int, fn: String ): Unit =
    if fn == "add" then
        val added = x + y
        println(s"Result: $added")

    else if fn == "subtract" then
        val subtracted = x - y
        println(s"Result: $subtracted")
    
    else if fn == "multiply" then
        val multiplied = x * y
        println(s"Result: $multiplied")
    
    else if fn == "divide" then
        val divided = x / y
        if y == 0 then
            println("Division by 0 is not possible.")
        else
            println(s"Result: $divided")
    else
        println("Please enter a proper function.")