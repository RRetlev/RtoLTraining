package com.example.demo;

public class Translator
{
    public String translate(String romanNumbers){
        int result = 0;
        if (romanNumbers.equals("I")){
            result++;
        }
        return String.valueOf(result);
    }
}
