package ru.kuvaldin;
import ru.kuvaldin.test.TestMashine;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Transformmer transformmer = new Transformmer();
        WordGenerator wordGenerator1 = new WordGenerator();
        ConsoleInput consoleInput = new ConsoleInput();
        TestMashine testMashine = new TestMashine();

        ConsoleInput.print("Введите целое число до миллиона и тип варюты USD или RUB");
        String inputValue = consoleInput.dateInput();
        String[] InputedStrings = transformmer.AmountSegmentation(inputValue);
        int[] digAmount = transformmer.SharedAmountOnClass(InputedStrings[0]);
        String typeOfCurrency = InputedStrings[1];


        String [] testW = wordGenerator1.wordCollectionMaker(digAmount, typeOfCurrency);

        String phrase = testMashine.clueFinalPhrase(testW);

        System.out.println(phrase);

//        typeOfCurrency = "USD";
//        if (typeOfCurrency.equals(Currencies.USD.name())) ConsoleInput.print(Currencies.USD.getNameCurrency(0));
//        if(typeOfCurrency.equals(Currencies.RUB.name())) ConsoleInput.print(Currencies.RUB.getNameCurrency(0));





    }
}
