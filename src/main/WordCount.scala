package main

class WordCount(val inputText: String) {
  
   def hasWordsOf:Int = {
     return (inputText.split(" ").length)
   }
   
   def hasLinesOf:Int = {
     return (inputText.split("\n").length)
   }
   def hasCharactersOf:Int = {
     return (inputText.split("").length)
   }
}