package test

import main.WordCount
import org.junit.Test
import org.junit.Assert._
import org.scalatest.junit.AssertionsForJUnit

class WordCountTest extends AssertionsForJUnit {
  
  @Test def hasWordsOf_is_a_word_counter() { 
  var pt = new WordCount("just count howmany words i have");
  assert(pt.hasWordsOf==6)
  }
}