package ru.kuvaldin;


import java.util.HashMap;

public class WordGenerator {
    private KeywordDataMaker keywordDataMaker = new KeywordDataMaker();
    private String[] EndOfThousands = new String[] {"тысяча", "тысячи", "тысяч"};


    public String [] wordCollectionMaker(int[] amount){
        keywordDataMaker.fillAllMaps();
        String [] WordsCollected = new String[5];
        int numPos = 0;
        for (int digClass: amount){
            boolean isDozenTrue = (digClass % 10 == 0) ? true: false;
            switch (numPos){
                case 0 ->  WordsCollected[numPos] = keywordDataMaker.getHundredsThousandsMap().get(digClass);

                case 1 ->  WordsCollected[numPos] =(digClass < 20)? keywordDataMaker.getThousandMap().get(digClass):
                        (isDozenTrue)? keywordDataMaker.getDozenMap().get(digClass/10) + " тысяч":
                        (digClass% 10 == 1)?
                            keywordDataMaker.getDozenMap().get(digClass/10) + " " +
                            keywordDataMaker.getThousandMap().get(digClass % 10) + " тысяча":
                                        (digClass% 10 == 2)?
                                                keywordDataMaker.getDozenMap().get(digClass/10) + " " +
                                                keywordDataMaker.getUnitsMap().get(digClass % 10) + " тысячи":
                                                keywordDataMaker.getDozenMap().get(digClass/10) + " " +
                                                keywordDataMaker.getUnitsMap().get(digClass % 10) + " тысяч";


                case 2 ->  WordsCollected[numPos] = keywordDataMaker.getHundredsThousandsMap().get(digClass);
                case 3 ->  WordsCollected[numPos] =(digClass < 20)? keywordDataMaker.getUnitsMap().get(digClass):
                        (isDozenTrue)? keywordDataMaker.getDozenMap().get(digClass/10):
                                keywordDataMaker.getDozenMap().get(digClass/10) + " " +
                                        keywordDataMaker.getUnitsMap().get(digClass % 10);
            }
            numPos++;
        }

        return WordsCollected;
    }
}
