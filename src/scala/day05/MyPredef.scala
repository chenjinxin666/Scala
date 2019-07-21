package scala.day05

object MyPredef {
//  implicit def gril2OrderedGril(gril: Gril) = new Ordered[Gril]{
//    override def compare(that: Gril): Int = {
//      println("method gril2OrderedGril")
//      -(that.works - gril.works)
//    }
//  }

//  implicit object gril2OrderingGril extends Ordering[Gril] {
//    override def compare(x: Gril, y: Gril): Int = {
//      println("fun gril2OrderedGril")
//      x.works - y.works
//    }
//  }

  implicit val gril2OrderdGril = (gril:Gril) => new Ordered[Gril] {
    override def compare(that: Gril): Int = {
      println("func gril2OrderedGril")
      -(that.works - gril.works)
    }
  }
}
