package org.example.scala_01
package example_01

class MyExample {
  def chooseColor(aValue: String) :String= {
    aValue match {
      case "green" => {
          "es precioso"
      }
      case "red" | "yellow" => {
          "muyBonito"
      }
      case color if(color == "naranja") => {
        "churry"
      }
      case _ => {
        "otro color"
      }
    }
  }


  def helloWorld(aName: String): String = {
    if(aName == null) {
      return s"hello World"
    }
    s"hello World, ${aName}"
  }
}
