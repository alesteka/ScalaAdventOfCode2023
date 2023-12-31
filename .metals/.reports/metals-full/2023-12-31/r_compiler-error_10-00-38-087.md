file://<WORKSPACE>/proj/src/main/scala/Main.scala
### java.lang.StringIndexOutOfBoundsException: begin 1620, end 1613, length 1660

occurred in the presentation compiler.

action parameters:
offset: 1613
uri: file://<WORKSPACE>/proj/src/main/scala/Main.scala
text:
```scala
import scala.collection.immutable._
import java.lang.Character
import util.control.Breaks._
import scala.util.Try
import scala.runtime.RichChar
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer

//@main def hello: Unit =
//  println("Hello world!")
//  println(msg)
//
//def msg = "I was compiled by Scala 3. :)"

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val lines = scala.io.Source.fromFile("../Data/data.txt").mkString
    println(getNumber(lines))
    

  }

  def getNumber(lines: String): Unit = {
    
    var finalBuffer = ArrayBuffer[String]()
    val arrBuffer = ArrayBuffer[String]()
//    var f: String = "0"

    println("aaaa")
      for (c <- lines) {
          //Thread.sleep(100)
          if (c.isDigit){
            arrBuffer += c.toString
          }

          else if (c.isWhitespace) {
            var f: String = "0"
            println("Size is")
            println(arrBuffer.size)

            if (arrBuffer.size >= 2) {
              var min = arrBuffer.head.toString
              var max = arrBuffer.last.toString
              var f = min + max
              println("f1 is ")
              println(f)
            }
            else if (arrBuffer.size == 1){
              var min = arrBuffer.head.toString
              var f = min
              println("f2 is")
              println(f)              
            }
            else{
              
            }
              finalBuffer += f
              arrBuffer.clear()                        
          }
          else {}
      }   
    
  var i=0
  while (i < f@@.length) {
  sum += array(i)
  i += 1
}
  }

}

```



#### Error stacktrace:

```
java.base/java.lang.String.checkBoundsBeginEnd(String.java:4606)
	java.base/java.lang.String.substring(String.java:2709)
	scala.meta.internal.pc.completions.CompletionPos$.infer(CompletionPos.scala:55)
	scala.meta.internal.pc.completions.CompletionPos$.infer(CompletionPos.scala:45)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:64)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:136)
```
#### Short summary: 

java.lang.StringIndexOutOfBoundsException: begin 1620, end 1613, length 1660