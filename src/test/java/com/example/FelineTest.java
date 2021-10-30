package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Animal animal = new Animal();
    Feline feline = new Feline();

    @Test
    public void felineEatMeatTest()throws Exception{
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyFelineTest(){
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);

    }

    @Test
    public void getKittensOneKittenTest(){
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);

    }



}
