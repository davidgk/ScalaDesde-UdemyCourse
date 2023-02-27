package org.example.scala_01
package seccion5_funciones

import org.scalatest.BeforeAndAfter
import org.scalatest.funspec.AnyFunSpec

import scala.collection.mutable.{ArrayBuffer, HashMap, ListBuffer}

case class Prueba() {
  def f1(pepe: String) = {
    "carlos"
  }

  def f2 = {
    "carlos"
  }

  def datosPersonales (nombre: String, edad: Int, colorPelo: String = "casaño"): String = {
    s"hola me llamo $nombre y tengo $edad años y tengo pelo color $colorPelo"
  }

  def sumarMuchos (valores: Int*): Int = {
    var res = 0
    valores.foreach (value => res += value)
    res
  }

}



class FuncionesSpec extends AnyFunSpec with BeforeAndAfter{

  var myExample = null

  describe("funciones01") {
    it("t1") {
      val p = Prueba()
      assert(p.f1("") == "carlos")
      assert(p.f2 == "carlos")
     }
    it("sumarMuchos") {
      val p = Prueba()
      assert(p.sumarMuchos(1,1,1,1) == 4)
      assert(p.sumarMuchos(1,1,1,1,5,8) == 17)
    }
    it("datos personales") {
      val p = Prueba()
      assert(p.datosPersonales("carlos" , 20) == "hola me llamo carlos y tengo 20 años y tengo pelo color casaño")
      assert(p.datosPersonales(nombre="carlos" , edad=20) == "hola me llamo carlos y tengo 20 años y tengo pelo color casaño")
      assert(p.datosPersonales(nombre="carlos" , 20) == "hola me llamo carlos y tengo 20 años y tengo pelo color casaño")
      assert(p.datosPersonales(nombre="carlos" , 20, "naranja") == "hola me llamo carlos y tengo 20 años y tengo pelo color naranja")
      assert(p.datosPersonales(edad=20, nombre="carlos") == "hola me llamo carlos y tengo 20 años y tengo pelo color casaño")
      assert(p.datosPersonales(edad=20, nombre="carlos", colorPelo="rubio") == "hola me llamo carlos y tengo 20 años y tengo pelo color rubio")
    }
  }
}

