package org.app.app2.scala

/**
  * Created by sarrafan on 5/9/17.
  */
class Point(var x: Int, var y: Int) {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}