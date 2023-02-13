package org.example.scala_01
package example_01

class MyExample {

  def helloWorld(aName: String): String = {
    if(aName == null) {
      return s"hello World"
    }
    s"hello World, ${aName}"
  }
}
