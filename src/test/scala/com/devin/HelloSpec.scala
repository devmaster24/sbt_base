import org.scalatest._

class HelloSpec extends FunSuite with DiagrammedAssertions {
  test("This is a test") {
    assert(1 == 1)
  }

  test("2 should equal 2") {
      assert(2 == 2)
  }
}
