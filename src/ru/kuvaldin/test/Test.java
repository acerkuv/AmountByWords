package ru.kuvaldin.test;


public class Test {
    public static void main(String[] args) {
    TestMashine testMashine = new TestMashine();
    testMashine.check("1", "один ");
    testMashine.check("101", "сто один ");
    testMashine.check("100027", "сто тысяч двадцать семь ");
    testMashine.check("77709", "семьдесят семь тысяч семьсот девять ");
    testMashine.check("889759", "восемьсот восемьдесят девять тысяч семьсот пятьдесят девять ");
    testMashine.check("100001", "сто тысяч один ");
    testMashine.check("127988","сто двадцать семь тысяч девятьсот восемьдесят восемь ");





    }
}
