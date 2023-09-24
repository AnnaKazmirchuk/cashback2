package ru.netology.service;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemainWithNoCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemainWithCashback2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);

    }



}
