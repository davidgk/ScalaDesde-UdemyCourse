package org.example.scala_01
package seccion7_clases

import org.scalatest.funspec.AnyFunSpec

class PruebaClases2 extends AnyFunSpec{

  describe("testing clases 02") {
    it("mi primera clase") {
      var emp1 = new Empleado("carlos")
      assert(emp1.imprimir == "carlos-Argentina-18")
      var emp2 = new Empleado("carlos", "sanabria", 20)
      assert(emp2.imprimir == "carlos-sanabria-20")
    }
  }

  case class Empleado(){

    def initDefault (): Unit = {
      nombre = "juan"
      direccion = "Argentina"
      edad = 18
    }

    initDefault()

    private var nombre: String =_
    private var direccion: String =_
    private var edad: Int =_

    def imprimir: String = {
      s"$nombre-$direccion-$edad"
    }

    def this(nombre: String) = {
      this()
      this.nombre = nombre
    }
    def this(nombre: String, direccion: String, edad: Int) = {
      this(nombre)
      this.direccion = direccion
      this.edad = edad
    }

  }
}
