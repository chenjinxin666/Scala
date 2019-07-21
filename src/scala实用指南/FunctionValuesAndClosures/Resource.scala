package scala实用指南.FunctionValuesAndClosures

import com.sun.deploy.model

class Resource private() {
  println("Starting ...")

  private def cleanUp: Unit = {
    println("Ending...")
  }

  def op1(): Unit = println("op1")

  def op2(): Unit = println("op2")

  def op3(): Unit = println("op3")
}

object Resource extends App {
  def use(codeBlock:Resource=>Unit):Unit={
    val resource=new Resource
    try {
      codeBlock(resource)
    }finally {
      resource.cleanUp
    }
  }
  Resource.use{resource=>
    resource.op1()
    resource.op2()
    resource.op3()
    resource.op1()
  }
}
