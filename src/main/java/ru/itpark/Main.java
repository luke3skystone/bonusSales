package ru.itpark;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int[]sales = {12_000,8_000,15_000,8_000};
        int bonus = service.calculate(sales);
        System.out.println(bonus);
}}


