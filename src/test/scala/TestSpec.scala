package $package

import org.scalatest._

class TestSpec extends FlatSpec with Matchers {
  "The Test object" should "say hello" in {
    "hello" shouldEqual "hello"
  }
}
