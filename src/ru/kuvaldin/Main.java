package ru.kuvaldin;
import ru.kuvaldin.test.TestMashine;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Transformmer transformmer = new Transformmer();
        WordGenerator wordGenerator1 = new WordGenerator();
        ConsoleInput consoleInput = new ConsoleInput();
        TestMashine testMashine = new TestMashine();

        String inputValue = consoleInput.dateInput();
        String[] test = transformmer.AmountSegmentation(inputValue);
        int[] digAmount = transformmer.SharedAmountOnClass(test[0]);


        String [] testW = wordGenerator1.wordCollectionMaker(digAmount);


        String phrase = testMashine.clueFinalPhrase(testW);
        System.out.println(phrase);


    }
}
