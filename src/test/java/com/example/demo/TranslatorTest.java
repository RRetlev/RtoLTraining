package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslatorTest
{
    Translator translator = new Translator();

    @Test
    void testReturnCorrectNumberForSingleCharacter(){

        String input = "I";
        assertTrue(translator.translate(input).equals(1));

    }

    @Test
    void leygenitt(){}

}