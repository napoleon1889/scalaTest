package com.nssc.scala.hello

object MapOperation {
  def main(args: Array[String]): Unit = {
    val ages = Map("Rocky"->27,"spark"->5)
    
//    for((k,v)<-ages) println("Key is "+ k +",value is "+v)
    for((k,_)<-ages) println(k)
  }
}