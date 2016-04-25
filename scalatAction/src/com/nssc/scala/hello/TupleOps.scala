package com.nssc.scala.hello

object TupleOps {
    def main(args: Array[String]): Unit = {
      val triple = (100,"scala","spark")
      /**
       * triple从一开始
       */
      println(triple._1)
      println(triple._2) 
    }
}