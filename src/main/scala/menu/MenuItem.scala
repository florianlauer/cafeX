package menu

trait MenuItem {

  val itemType: MenuItemType.Value
  val temperature: Temperature.Value
  val price: BigDecimal

}
