package com.exp

import org.specs2._

object SimpleParserSpec extends Specification { def is = s2"""
  This is a specification to check the 'Hello world' string

  The 'Hello world' string should
    contain 11 characters                                         $e1
    start with 'Hello'                                            $e2
    end with 'world'                                              $e3
                                                                  """

  def e1 = "Hello world" must have size(11)
  def e2 = "Hello world" must startWith("Hello")
  def e3 = "Hello world" must endWith("world")

  // don't know how to test it in specs2...
  val parser = new SimpleParser()
  val tweet = """{"id":1,"text":"foo"}"""
  parser.parse(tweet) match {
    case Some(parsed) => {
      parsed.text must be_==("foo")
      parsed.id must be_==(1)
    }
    case _ => println ("fail: didn't parse tweet")
  }
}
