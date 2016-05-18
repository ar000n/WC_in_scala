package test

import main.WordCount
import org.junit.Test
import org.junit.Assert._
import org.scalatest.junit.AssertionsForJUnit

class WordCountTest extends AssertionsForJUnit {

  @Test def hasWordsOf_is_a_word_counter() {
    var pt = new WordCount("just count howmany words i have");
    assertEquals(pt.hasWordsOf,6);
  }
  @Test def hasLinesOf_is_a_line_counter() {
    var text  = new WordCount("this contain\n this many\nlines of\n words");
    assertEquals(text.hasLinesOf,4)
  }
  @Test def hasCharactersOf_is_character_counter(){
    var text = new WordCount("lets check how many contains here");
    assertEquals(text.hasCharactersOf,33)
  }
}