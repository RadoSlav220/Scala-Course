import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class test extends AnyFlatSpec with Matchers:
  "+" should "sum two numbers" in {
    2 + 3 shouldBe 5
  }