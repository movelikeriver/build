package com.exp

import com.exp._

object Hw {
  def main(args: Array[String]) {
    val tweet = """{"id":1,"text":"foo"}"""
    val parser = new SimpleParser
    println(parser.parse(tweet))
  }
}