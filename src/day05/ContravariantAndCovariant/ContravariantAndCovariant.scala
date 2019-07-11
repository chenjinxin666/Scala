package day05.ContravariantAndCovariant

class King extends Diamonds

class Diamonds extends Platinum

class Platinum

//逆变
class Card1[-T]

//协变
class Card2[+T]

class ContravariantAndCovariant {
  def enterMeet1(card1: Card1[Diamonds]): Unit = {
    println("钻石级别及以下可进入")
  }

  def enterMeet2(card2: Card2[Diamonds]): Unit = {
    println("钻石级别及以上可进入")
  }
}

object ContravariantAndCovariant {
  def main(args: Array[String]): Unit = {
    val t = new ContravariantAndCovariant

    val k1 = new Card1[King]
    val k2 = new Card2[King]
    val d1 = new Card1[Diamonds]
    val d2 = new Card2[Diamonds]
    val p1 = new Card1[Platinum]
    val p2 = new Card2[Platinum]
    // t.enterMeet1(k1) 语法错误
    t.enterMeet1(d1)
    t.enterMeet1(p1)
    t.enterMeet2(k2)
    t.enterMeet2(d2)
    // t.enterMeet2(p2) 语法错误
  }
}
