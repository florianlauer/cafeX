import Main.calculateBill
import menu._
import org.scalatest.FunSuite

class BillingSpec extends FunSuite {


  test("order with drinks only") {
    val firstOrder: List[MenuItem] = List(new Cola, new Coffee, new Coffee)
    assert(calculateBill(firstOrder).equals(2.5))
  }

  test("order with a cold sandwich") {
    val secondOrder: List[MenuItem] = List(new Cola, new Coffee, new SteakSandwich)
    assert(calculateBill(secondOrder).equals(7.2))
  }

  test("order with a hot sandwich") {
    val thirdOrder: List[MenuItem] = List(new Cola, new Coffee, new CheeseSandwich)
    assert(calculateBill(thirdOrder).equals(3.85))
  }

}
