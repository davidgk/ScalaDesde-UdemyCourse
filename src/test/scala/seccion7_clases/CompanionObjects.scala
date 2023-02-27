package org.example.scala_01
package seccion7_clases

import org.example.scala_01.example_01.{Automovil, Camion, Estudiante}
import org.scalatest.funspec.AnyFunSpec

// Es la forma de definir comportamiento statico
class CompanionObjects extends AnyFunSpec{

  describe("testing clases COmp OBjs") {
    it("mi primera clase") {
      var emp1 = new Empleado("carlos")
      assert(emp1.imprimir == "carlos-Argentina-18")
      var emp2 = new Empleado("carlos", "sanabria", 20)
      assert(emp2.imprimir == "carlos-sanabria-20")
      assert(Empleado.trabajar("sistemas") == "trabajar en sistemas")
    }
    it("Automovil") {
      var auto = new Automovil("ford", "abc 123")
      var camion = Camion("chevrolet", "abc 123")
    }

    it("abstracts") {
      var carlos = new Estudiante("carlos", 17)
      assert(carlos.mostrarDatos() == "carlos-17")
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

  object Empleado {
    def trabajar(empleo: String): String = {
      s"trabajar en $empleo"
    }
  }
}
