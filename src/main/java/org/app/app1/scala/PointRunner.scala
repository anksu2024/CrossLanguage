package org.app.app1.scala

import org.app.app1.java.Point

// This uses Java Class in Scala Runner

object PointRunner {
  def main(args: Array[String]): Unit = {
    println("Scala Runner")
    val point = new Point(5, 10)
    point.move(5, 10)
    println(point)
  }
}