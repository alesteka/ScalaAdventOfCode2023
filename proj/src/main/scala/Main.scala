import scala.collection.immutable._
import java.lang.Character
import util.control.Breaks._
import scala.util.Try
import scala.runtime.RichChar
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer
import scala.compiletime.ops.string
import java.util.Arrays


object Advent2023 {
  def main(args: Array[String]): Unit = {
    
    //var lines = scala.io.Source.fromFile("../Data/data.txt").mkString
    //lines = lines.replace("one", "o1ne").replace("two", "t2wo").replace("three", "t3hree").replace("four", "f4our").replace("five", "f5ive").replace("six", "s6ix").replace("seven", "s7even").replace("eight", "e8ight").replace("nine", "n9ine")
    //lines = lines + "\t"
    //println(getNumber(lines))
    var puzzle = scala.io.Source.fromFile("../Data/puzle.txt").getLines.toList
    //Thread.sleep(1000)
    //var a = puzzle.map(listEl => firstPart(listEl.toString)).sum
    //println(a)
    println(puzzle.map(listEl => secondPart(listEl.toString)).sum)
    
  }
  
  def secondPart(s: String = "Game 96: 1 blue, 1 green, 1 red; 3 blue, 1 green, 5 red; 2 blue, 8 red, 10 green"): Int = {
    //var lines = scala.io.Source.fromFile("../Data/puzle.txt").mkString
    //var s : String = "Game 96: 1 blue, 1 green, 1 red; 3 blue, 1 green, 5 red; 2 blue, 8 red, 10 green"
    var values = Map.empty[String, String]
    var blueValues = ArrayBuffer[Int]()
    var redValues = ArrayBuffer[Int]()
    var greenValues = ArrayBuffer[Int]()
    var finalValues :Int = 0
    var game = s split ':' take 1
    var gameNumber = game.head split ' ' take 2
    var value = s split ':' take 2
  
    values = values + (gameNumber.last -> value.last)
    
    for (i <- values.values) {
      var colorValues = Map.empty[String, ArrayBuffer[Int]]
      var sl = i.replace(";", ",")   
      var sp = sl split ','
      //println(sp.toList)
      for (j <- sp) {
        var splitJ = j split ' '
        var color = splitJ(2).trim.toString
        var numberOfCubes = splitJ(1).trim.toInt
        color match {
          case "blue" => colorValues = colorValues + (color -> (blueValues += numberOfCubes))
          case "red" => colorValues = colorValues + (color -> (redValues += numberOfCubes))
          case "green" => colorValues = colorValues + (color -> (greenValues += numberOfCubes))
          case _ =>
        }
      }      
      var sumV = colorValues.values.map(_.max).toList
      finalValues = multiply(sumV)      
      return finalValues

    }
    return finalValues
  }

  def multiply(li: List[Int]) :Int = {
    var sum: Int = 1
    for (i <- li) {
      sum = sum * i.toInt
    }
    return sum
  }

  def firstPart(s: String): Int = {
    //var lines = scala.io.Source.fromFile("../Data/puzle.txt").mkString
    //var s : String = "Game 96: 1 blue, 1 green, 1 red; 3 blue, 1 green, 5 red; 2 blue, 8 red, 10 green"
    var values = Map.empty[String, String]
    var game = s split ':' take 1
    var gameNumber = game.head split ' ' take 2
    var value = s split ':' take 2
    var finalValues = Map.empty[Int, ArrayBuffer[Int]]
    var arr = new ArrayBuffer[Int]
    values = values + (gameNumber.last -> value.last)
    var check :Int = 0
    for (i <- values.values) {
      var sl = i.replace(";", ",")   
      var sp = sl split ','
      for (j <- sp) {
        
        var sp_color = j split " " take 3
        var sp_color_ = sp_color.toList.last.toString        
        var sp_value = j split " " take 2
        var sp_value_ = sp_value.toList.last.trim.toInt
        val z = sp_color_ match {
          case "blue" => if (sp_value_ > 14)  {check = 1} else { check = 0}
          case "green" => if (sp_value_ > 13) {check = 1} else { check = 0}
          case "red" => if (sp_value_ > 12) {check = 1} else { check = 0}
          case _ => 
        }
        arr += check
        //println(arr)
      }
    }
    
    finalValues = finalValues + (gameNumber.last.toInt -> arr)
    
    for ((i, j) <- finalValues){
      if ((j contains 0 )&& (j contains 1) ) {
        return 0
      } else {return i.toInt}
    }
    return 0
  }

  def getNumber(lines: String): Unit = {
    
    var finalBuffer = ArrayBuffer[String]()
    val arrBuffer = ArrayBuffer[String]()
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
    println(intArray.size)
    while (i < intArray.length) {

    sum += intArray(i)
    i += 1
    }
    println(sum)
  }
}
