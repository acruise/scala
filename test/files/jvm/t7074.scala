import scala.xml.UnprefixedAttribute

object Test extends App {
  val a = new UnprefixedAttribute("a","3", Null)
  val b = new UnprefixedAttribute("b","3", a)
  val c = new UnprefixedAttribute("c","1", Null)
  val d = new UnprefixedAttribute("d","5", c)

  println(d.copy(b))
}