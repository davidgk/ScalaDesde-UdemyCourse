package org.example.scala_01
package seccion7_clases

import org.scalatest.funspec.AnyFunSpec

class PruebasClases extends AnyFunSpec{

  describe("testing clases") {
    it("mi primera clase") {
      val alumno = Alumno(nombre = "David" , edad = 47)
      assert(alumno.nombre == "David")
      assert(alumno.edad == 47)
      assert(alumno.aprenderLenguaje("scala") == "estoy aprendiendo scala")
      assert(alumno.codear("scala") == "estoy codeando scala")
    }

    it("clase con muchos traits") {
      val profesor = Profesor(nombre = "carlos", edad = 47)
      assert(profesor.correr() == "voy a correr 5k")
      assert(profesor.desayunar("caramelos") == "estoy comiendo caramelos")
      assert(profesor.nombre == "carlos")
      assert(profesor.edad == 47)
      profesor.edad = 50
      assert(profesor.edad == 50)

    }
    it("producto01") {
      var prod = Producto("tornillo")
      assert(prod.mostrar_codigo() == "mi codigo es tornillo-1000")
      val prod1 = new Producto("tornillo", dpto = "tools")
      assert(prod1.mostrar_codigo() == "mi codigo es tornillo-tools-1000")
    }
  }
}

case class Producto (var name: String) {
  private val codigo = 1000

  def this(name: String, dpto: String) = {
    this(s"$name-$dpto")
  }

  private def codigo_init(): Unit = {
    name = s"$name-$codigo"

  }

  codigo_init()

  def mostrar_codigo():String = {
    s"mi codigo es $name"
  }
}


case class Alumno(nombre: String, edad: Int) extends Estudiar {
  override def aprenderLenguaje(lenguaje: String): String = {
    s"estoy aprendiendo $lenguaje"
  }
}

case class Profesor(val nombre: String, var edad: Int) extends Comer with Deportista {
  override def desayunar(comida: String): String = {
    s"estoy comiendo $comida"
  }

  override def correr(): String = {
    "voy a correr 5k"
  }
}

trait Deportista {
  def correr(): String
}


trait Comer {
  def desayunar(comida: String): String
}
trait Estudiar {
  def aprenderLenguaje(lenguaje:String): String
  def codear(lenguaje:String): String = {
    s"estoy codeando $lenguaje"
  }
}