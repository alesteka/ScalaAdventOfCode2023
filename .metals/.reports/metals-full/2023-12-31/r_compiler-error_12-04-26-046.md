file://<WORKSPACE>/proj/src/main/scala/Main.scala
### java.lang.AssertionError: assertion failed: NoType

occurred in the presentation compiler.

action parameters:
offset: 605
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
    var lines = scala.io.Source.fromFile("../Data/data.txt").mkString
    
    //println(getNumber(lines))
    

  }

  def convert(): Unit = {
    var s = "seven8one3\tfive8one4"
    s.map{ c@@}
  }

  def getNumber(lines: String): Unit = {
    
    var finalBuffer = ArrayBuffer[String]()
    val arrBuffer = ArrayBuffer[String]()
    lines = lines + "\t"

//    var f: String = "0"

      for (c <- lines) {
          //Thread.sleep(100)
          if (c.isDigit){
            arrBuffer += c.toString
          }

          else if (c.isWhitespace) {
  
            var min = arrBuffer.head.toString
            var max = arrBuffer.last.toString
            var f = min + max
            finalBuffer += f
            arrBuffer.clear()                        
          }
          else {}
        }   
    
    var i=0
    var sum : Int = 0
    val intArray = finalBuffer.map(_.toInt)
    println(intArray)
    while (i < intArray.length) {

    sum += intArray(i)
    i += 1
    }
    println(sum)

  }

}

```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.core.Types$TypeBounds.<init>(Types.scala:5141)
	dotty.tools.dotc.core.Types$AliasingBounds.<init>(Types.scala:5220)
	dotty.tools.dotc.core.Types$TypeAlias.<init>(Types.scala:5242)
	dotty.tools.dotc.core.Types$TypeAlias$.apply(Types.scala:5279)
	dotty.tools.dotc.core.Types$Type.bounds(Types.scala:1732)
	scala.meta.internal.pc.completions.CaseKeywordCompletion$.contribute(MatchCaseCompletions.scala:156)
	scala.meta.internal.pc.completions.Completions.advancedCompletions(Completions.scala:442)
	scala.meta.internal.pc.completions.Completions.completions(Completions.scala:183)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:86)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:136)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: NoType