package org.example.scala_01
package example_01

import org.scalatest.funspec.AnyFunSpec


class StringSpec extends AnyFunSpec{

  describe("strings"){
    it("var1") {
       val nombre ="pepe"
       val lucy ="lucy"
       val edad =47
       assert(s"me llamo $nombre y tengo $edad años" == "me llamo pepe y tengo 47 años")
       assert(s"me llamo $lucy y tengo ${edad + 2 } años" == "me llamo lucy y tengo 49 años")
    }
  }
}
