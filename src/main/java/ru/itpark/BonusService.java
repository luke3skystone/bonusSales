package ru.itpark;

public class BonusService {
    public int calculate(int[]sales){
              int startLevel = 10_000;
              int bonus=0;
        for (int sale : sales) {
            if(sale>=startLevel){
                int bonusAmount=((sale-startLevel)*5)/100;
               bonus+=bonusAmount;
            }
        }
        return bonus;
    }
}
