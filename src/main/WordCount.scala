package main

class WordCount(val inputText: String) {
  
   def hasWordsOf:Int = {
     return (inputText.split(" ").length)
   }
}