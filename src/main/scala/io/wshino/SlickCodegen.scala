package io.wshino

import scala.slick.codegen.SourceCodeGenerator

/**
 * Created by wshino on 2014/11/17.
 */
object SlickCodegen {
  val slickDriver = "scala.slick.driver.H2Driver"
  val jdbcDriver = "org.h2.Driver"
  val url = "jdbc:h2:mem:test;INIT=runscript from 'src/main/resources/1.sql'"
  val outputFolder = "src/main/scala"
  val pkg = "io.wshino"

  def main(args: Array[String]): Unit = {
    SourceCodeGenerator.main(
      Array(
        slickDriver, jdbcDriver, url, outputFolder, pkg
      )
    )
  }
}

