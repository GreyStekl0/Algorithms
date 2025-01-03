package grokking_algorithms

fun greet(name: String){
    println("hello $name!")
    greet2(name)
    println("getting ready to say bye...")
    bye()
}

fun greet2(name: String){
    println("how are you, $name?")
}

fun bye(){
    println("ok bye!")
}

fun main(){
    greet("Stekl0")
}
