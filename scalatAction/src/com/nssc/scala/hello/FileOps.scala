package com.nssc.scala.hello

import scala.io.Source

object FileOps {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("C:\\Users\\Administrator\\Desktop\\TestMapReduceExamples.java")
    for(line <- file.getLines()) println(line)
  }
}