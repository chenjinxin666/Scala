package day05.viewBound

object MyPredef {
  /*implicit def gril2OrderedDef(gril: Gril) = new Ordered[Gril] {
    override def compare(that: Gril): Int = {
      println("gril2OrderedDef")
      gril.works - that.works
    }
  }*/

/*  implicit object gril2Orderingobj extends Ordering[Gril] {
    override def compare(x: Gril, y: Gril): Int = {
      println("gril2Orderingobj")
      x.works - y.works
    }
  }*/
  implicit val gril2OrderedVal = (gril:Gril) => new Ordered[Gril] {
    override def compare(that: Gril): Int = {
      println("gril2OrderedVal")
      -(that.works - gril.works)
    }
  }


}
