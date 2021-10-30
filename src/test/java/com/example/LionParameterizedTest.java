package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean hasMane;


    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] doesHaveMane() {
        return new Object[][]{
                {"Самец", true}, //позитивный сценарий: лев имеет гриву
                {"Самка", false},//позитивный сценарий: львица не имеет гривы

        };
    }


    @Test
    public void doesHaveManeParameterizedShouldEquals(){

        {
            try {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(hasMane, actual);
            } catch (Exception MaleExeption) {
                System.out.println("Используйте допустимые значения пола животного - самец или самка");
            }
        }


    }
}
