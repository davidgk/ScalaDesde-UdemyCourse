package org.example.scala_01
package seccion4_colecciones

import org.example.scala_01.example_01.MyExample
import org.scalatest.{BeforeAndAfter, BeforeAndAfterEach}
import org.scalatest.funspec.AnyFunSpec

import scala.collection.mutable.HashMap
import scala.collection.mutable.{ArrayBuffer, ListBuffer}


class ColeccionesSpec extends AnyFunSpec with BeforeAndAfter{

  var myExample = null

  describe("Colecciones tests") {
    it("t1") {
      val lista = List(1, 2, 4)
      assert(lista.length == 3)
      val lista2 = List[String]("carlos", "juan", "alberto")
      assert(lista2(0) == "carlos")
      val listaSorted = lista2.sorted
      assert(listaSorted(0) == "alberto")
      val lista3 = List.fill(4)("carlos")
      assert(lista3(3) == "carlos")
      assert(lista3.length == 4)
    }
    it("t2"){
      var lista1 = List[Int]()
      assert(lista1.isEmpty)
      lista1=lista1:+5
      lista1=lista1:+6
      lista1=lista1:+7
      assert(!lista1.isEmpty)
      assert(lista1(0)== 5)
      assert(lista1(1)== 6)
      assert(lista1(2)== 7)
      lista1=4+:lista1
      assert(lista1(0)== 4)
      assert(lista1(1)== 5)
    }
    it("t3"){
      var lista1 = List(1,2)
      var lista2 = List(3,4)
      val lista3= lista1:::lista2
      assert(lista3.length == 4)
      assert(lista3(3) == 4)
      val lista4= lista1::lista2
      assert(lista4(0) == lista1)
      val lista5= lista1+:lista2
      assert(lista5(0) == lista1)
    }
    it("t4 list buffer") {
      val lista1 = ListBuffer(8,7,9)
      assert(lista1.length == 3)
      lista1.append(6)
      assert(lista1.length == 4)
      assert(lista1(3) == 6)
      lista1 += (7)
      assert(lista1.length == 5)
      assert(lista1(4) == 7)
      lista1(0)= 1000
      assert(lista1.length == 5)
      assert(lista1(0) == 1000)
      lista1 -= 8
      assert(lista1  == List(1000, 7, 9, 6, 7))
      lista1.remove(0,2)
      assert(lista1  == List(9, 6, 7))
    }
    it("t5 array es como un vector de tamaño definido") {
      var array1 = Array("pedro", "juan", "Andres")
      assert(array1.length == 3)
      array1(0) = "david"
      assert(array1(0) == "david")
      assert(array1(1) == "juan")
      assert(array1(2) == "Andres")
      var array2 = new Array[Int](5)
      assert(array2.length == 5)
      assert(array2(0) == 0)
      assert(array2(4) == 0)
      var array3 = (1 to 5).toArray
      assert(array3(0) == 1)
      assert(array3(4) == 5)
      var array4 = new Array[Int](array3.length)
      Array.copy(array3, 0, array4, 0, array3.size)
      assert(array4(0) == 1)
      assert(array4(4) == 5)
      var array5 = Array.concat(array4, Array(5,6,7,8,9))
      assert(array5.length == 10)
    }
    it("array buffer examples"){
      val arrayBuffer = ArrayBuffer(8, 7, 9)
      assert(arrayBuffer.length == 3)
      arrayBuffer.append(6)
      assert(arrayBuffer.length == 4)
      assert(arrayBuffer(3) == 6)
      arrayBuffer += (7)
      assert(arrayBuffer.length == 5)
      assert(arrayBuffer(4) == 7)
      arrayBuffer(0) = 1000
      assert(arrayBuffer.length == 5)
      assert(arrayBuffer(0) == 1000)
      arrayBuffer -= 8
      assert(arrayBuffer == List(1000, 7, 9, 6, 7))
      arrayBuffer.remove(0, 2)
      assert(arrayBuffer == List(9, 6, 7))
    }
    it("Set examples") {
      var set = Set(1, 2, 3)
      assert(set(1))
      assert(!set(5))
      assert(set.size == 3)
      set += 1
      assert(set.size == 3)
      set += 5
      assert(set.size == 4)
      var set5 = Set(4,5,6) ++ set
      assert(set5.size == 6)
      set5 -= 4
      assert(set5.size == 5)
      assert(!set5(4))
    }
    it("maps") {
      var myMap = Map((1, "raul"), (2, "Jose"))
      assert(myMap.size ==2 )
      assert(myMap(1) == "raul")
      val myMap2 = Map(1  -> "juan")
      assert(myMap2(1) == "juan")
      myMap += (3 -> "david")
      assert(myMap(3) == "david")
      myMap += ((4 , "carlos"))
      assert(myMap(4) == "carlos")
      val myHashMap = HashMap(1 -> "pepe")
      assert(myHashMap(1) == "pepe")
      myHashMap += (2 -> "pedro")
      assert(myHashMap(2) == "pedro")

    }
  }
}
