package ru.kuvaldin.test;
import ru.kuvaldin.*;


public class TestMashine {
   private   Transformmer transformmer = new Transformmer();
   private WordGenerator wordGenerator1 = new WordGenerator();

   protected void check(String test, String answer){
       String[] SharedInput = transformmer.AmountSegmentation(test);
       int[] digAmount = transformmer.SharedAmountOnClass(SharedInput[0]);
       String [] TestWordAnswer = wordGenerator1.wordCollectionMaker(digAmount, SharedInput[1]);
       String finalAnswer = clueFinalPhrase(TestWordAnswer);

       System.out.println("Ввод: " + answer);
       System.out.println("Вывод: " + finalAnswer );
       if (finalAnswer.equals(answer)) System.out.println("Да");
       else System.out.println("Нет");
   }
   public   String clueFinalPhrase( String [] Words){
       StringBuilder phrase = new StringBuilder();
       for (String word: Words){
           if (word != null) phrase.append(word).append(" ");
       }
       return phrase.toString();
   }


}
