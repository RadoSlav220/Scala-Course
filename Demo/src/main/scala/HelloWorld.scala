@main
def hello = 
  println("Hello world!")
  val name: String = "Rado"
  val nameLength: Int = name.size
  println(name + ' ' + nameLength)
  println(com.scalafmi.a) 
  println(fib(4))
  val emptyList1 = List.empty
  val emptyList2 = Nil
  println(emptyList1 == emptyList2)
  val list = (1 until 5).toList
  println(list)


def fib(n: Int): Int =
  if n == 0 then 0
  else if n == 1 then 1
  else fib(n-1) + fib(n-2)


@main
def testSubstrings =
  val str = "aabacd"
  val result = substrings(str)
  println(result)  

def substrings(str: String): Seq[String] =
  val substringsWithDuplicates = for 
    i <- 0 until str.size
    j <- 0 until str.size - i
  yield str.drop(i).dropRight(j)

  substringsWithDuplicates.distinct 


