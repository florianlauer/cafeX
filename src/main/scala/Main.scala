import menu._

object Main extends App {



  val firstOrder: List[MenuItem] = List(new Cola, new Coffee, new SteakSandwich)
  val secondOrder: List[MenuItem] = List(new Cola, new Coffee, new Coffee)
  val thirdOrder: List[MenuItem] = List(new Cola, new Coffee, new CheeseSandwich)

  println("First order : "+calculateBill(firstOrder));
  println("Second order : "+calculateBill(secondOrder));
  println("Third  order : "+calculateBill(thirdOrder));


  def calculateBill(items :List[MenuItem]): BigDecimal = {
    var price: BigDecimal = 0
    items.foreach(mi => price += mi.price)
    items.foreach(mi => {
      if (mi.itemType.equals(MenuItemType.food)) {
        if (mi.temperature.equals(Temperature.hot)) {
          if (price * 0.2 > 20) {
            price = price + 20
          }
          else price = (price * 1.2).setScale(2, BigDecimal.RoundingMode.HALF_UP)
        }
        else price = (price * 1.1).setScale(2, BigDecimal.RoundingMode.HALF_UP)
      }
    })
    return price;
  }

}
