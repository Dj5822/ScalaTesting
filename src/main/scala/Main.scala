import scala.io.StdIn.readLine

/*
Notes: 
val is final.
var is variable.
*/

class Slime(name: String, hp: Int, mp: Int):
  def printStatus() = 
    println(s"Name: ${name}")
    println(s"HP: ${hp}")
    println(s"MP: ${mp}")

def controlTesting(): Unit =
  if true then print("true\n") else print("false\n")
  
  for i <- List(1, 2, 3) do println(i)

  val powers = for i <- Range(0, 5) yield i * i
  println(powers)

  var count = 0
  while count < 5 do
    println(count)
    count += 1

def sumToNumbers(): Unit =
  println("Input the first number: ")
  val num1: String = readLine()

  println("Input the second number: ")
  val num2: String = readLine()

  println("Result: " + num1 + " + " + num2 + " = " + (num1.toInt + num2.toInt))

@main def start(): Unit = 
  val slime1 = new Slime("Rimiru Tempest", 1000, 100)
  slime1.printStatus()

