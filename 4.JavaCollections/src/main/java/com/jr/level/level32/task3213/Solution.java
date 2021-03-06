package com.jr.level.level32.task3213;

import java.io.IOException;
import java.io.StringReader;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if(reader == null) return "";
        StringBuilder sb = new StringBuilder("");
        int tmpChar;
        while (-1 < (tmpChar = reader.read()))
            sb.append((char) (tmpChar + key));

        return sb.toString();
    }
}
