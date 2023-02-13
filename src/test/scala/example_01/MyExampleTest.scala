import org.example.scala_01.example_01.MyExample
import org.scalatest.funspec.AnyFunSpec

class SetSpec extends AnyFunSpec {

  describe("A hello world greeting") {

    describe("when empty") {
      it("should return just hello world") {
        val myClass = new MyExample()
        assert (myClass.helloWorld( null) == "hello World")
      }

      it("should a correct greet with salute") {
        val myClass = new MyExample()
        assert(myClass.helloWorld("carlos") == "hello World, carlos")
      }
    }
  }
}