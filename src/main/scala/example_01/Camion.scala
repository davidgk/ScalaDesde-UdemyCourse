package org.example.scala_01
package example_01

class Camion(marca: String, patente: String) {

  def mostrarDatos(): String = {
    s"$marca-$patente"
  }
}

object Camion {
  def apply(marca: String, patente: String): Camion = {
    new Camion(marca, patente)
  }
}
