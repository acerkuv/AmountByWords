package ru.kuvaldin;

import java.util.HashMap;

public class KeywordDataMaker {
    private HashMap <Integer, String> hundredsThousandsMap = new HashMap();
    private HashMap <Integer, String> unitsMap = new HashMap();
    private HashMap <Integer, String> dozenMap = new HashMap();
    private HashMap<Integer, String> thousandMap = new HashMap<>();

    private String[] hundredsT = new String[] {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
            "восемьсот",  "девятьсот"};
    private String[] units = new String[] {"один", "два", "три", "четыре", " пять", "шесть", "семь", "восемь",  "девять",
            "десять",  "одиннадцать", "двенадцать", "триданцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать",
            "восемьнадцать", "девятнадцать"};
    private String[] thousand = new String[] {"одна тысяча", "две тысячи", "три тысячи", "четыре тысячи", " пять тысяч", "шесть тысяч", "семь тысяч",
            "восемь тысяч",  "девять тысяч", "десять тысяч",  "одиннадцать тысяч", "двенадцать тысяч",
            "триданцать тысяч", "четырнадцать тысяч", "пятнадцать тысяч", "шестнадцать тысяч", "семнадцать тысяч",
            "восемьнадцать тысяч", "девятнадцать тысяч"};
    private String [] dozens = new String[] {"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
            "восемьдесят",  "девяносто"};

    private void fillMaps( String[] values, HashMap map){
        int num = 1;
        for (String name: values){
            map.put(num, name);
            num++;
        }
    }
    protected void fillAllMaps(){
        fillMaps(hundredsT, hundredsThousandsMap);
        fillMaps(units,unitsMap);
        fillMaps(dozens, dozenMap);
        fillMaps(thousand, thousandMap);

    }

    public HashMap<Integer, String> getHundredsThousandsMap() {
        return hundredsThousandsMap;
    }

    public HashMap<Integer, String> getUnitsMap() {
        return unitsMap;
    }

    public HashMap<Integer, String> getDozenMap() {
        return dozenMap;
    }

    public HashMap<Integer, String> getThousandMap() {
        return thousandMap;
    }

}
