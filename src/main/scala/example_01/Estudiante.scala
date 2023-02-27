package org.example.scala_01
package example_01

class Estudiante(override val nombre: String, override val edad: Int) extends Persona(nombre, edad) {

  override def mostrarDatos(): String = {
    s"$nombre-$edad"
  }
}

abstract case class Persona(nombre: String, edad: Int) {
  def mostrarDatos(): String
}
