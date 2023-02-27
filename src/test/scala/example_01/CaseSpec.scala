package org.example.scala_01
package example_01

import org.scalatest.funspec.AnyFunSpec



class PatternMatchSpec extends AnyFunSpec{

  describe("pattern matching o case"){
    it("var1") {
       var ex = new MyExample()
       val color = ex.chooseColor("red")
       assert(color == "muyBonito")
       assert(ex.chooseColor("green") == "es precioso")
       assert(ex.chooseColor("naranja") == "churry")
       assert(ex.chooseColor("yellow") == "muyBonito")
//       assertThrows[scala.MatchError] {
//         ex.chooseColor("black")
//       }
      assert(ex.chooseColor("black") == "otro color")
    }
  }
}
