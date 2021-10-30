package com.example;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {
    Feline feline = new Feline();


    @Test
    public void getKittensOneKittenTest() throws Exception{
        Lion lion = new Lion(feline,"Самец");
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeHaveManeTest() throws Exception{
        Lion lion = new Lion(feline,"Самец");
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception{
        Lion lion = new Lion(feline,"Самец");
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

}
