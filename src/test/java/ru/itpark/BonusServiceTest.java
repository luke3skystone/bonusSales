package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @Test
    public void calculateBonus(){
    BonusService service = new BonusService();
    int[]sales = {12_000,8_000,15_000,8_000};
    int startLevel = 10_000;
    int actual1 = ((sales[0]-startLevel)*5)/100;

        int actual3 = ((sales[2]-startLevel)*5)/100;

        int sum = actual1+actual3;
    assertEquals(sum,350);
    }

}