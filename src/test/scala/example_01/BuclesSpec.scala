package org.example.scala_01
package example_01

import org.scalatest.funspec.AnyFunSpec

class BuclesSpec  extends AnyFunSpec {
  describe("bucles") {
    it("t1-while") {
      var x = 0
      while (x < 5) {
        x+=1
      }
      assert(x == 5)
    }
    it("t1-do") {
      var x = 0
      do {
        x+=1
      } while (x < 5)
      assert(x == 5)
    }
    it("t1-for") {
      var x = 0
      for(i <- 1 to 10 ) {
        x+=1
      }
      assert(x == 10)
    }
    it("t1-for until") {
        var x = 0
        for(i <- 1 until 10 ) {
          x+=1
        }
        assert(x == 9)
    }
    it("t1-for CON condicion") {
      var x = 0
      for (i <- 1 to 10 if i > 8 ) {
        x += 1
      }
      assert(x == 2)
    }
  }
  describe("ranges") {
    it("rango01") {
      var mirange = 1 to 5
      var x = 0
      for ( i <- mirange) {
        x += 1
      }
      assert(x == 5)
    }
    it ("rango 2") {
      var x = 1 to 10
      assert(x(0) == 1 )
      assert(x(9) == 10 )
    }
    it ("rango min") {
      var x = 'a' to 'z'
      assert(x(0) == 'a' )
      assert(x(1) == 'b' )
      assert(x(25) == 'z' )
    }
    it ("rango min2") {
      var x = 'a' to 'z' by 2
      assert(x(0) == 'a' )
      assert(x(1) == 'c' )
    }

    it ("rango 3 error") {
      var x = 1 to 10
      assertThrows[IndexOutOfBoundsException] {
        x(11)
      }
    }

  }
}
