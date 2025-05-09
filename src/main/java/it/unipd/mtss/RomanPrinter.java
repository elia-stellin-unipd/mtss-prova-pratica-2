////////////////////////////////////////////////////////////////////
// Elia Ernesto Stellin 2101084
// Mattia Scomparin 2110992
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.Map;

public class RomanPrinter {

    public static String print (int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if(romanNumber == null) {
            return null;
        }

        Map<String, Integer> characterToindex = Map.of(
            "I", 0,
            "V", 1,
            "X", 2,
            "L", 3,
            "C", 4,
            "D", 5,
            "M", 6
        );

        String[][] Matrix = {
            {" _____ ", "__      __",     "__   __",   
            " _      ", "  _____ ",  " _____  ",   " __  __ "},
            {"|_   _|", "\\ \\    / /",  "\\ \\ / /",  
            "| |     ", " / ____|",  "|  __ \\ ",  "|  \\/  |"},
            {"  | |  ", " \\ \\  / / ",  " \\ V / ",   
            "| |     ", "| |     ",  "| |  | |",   "| \\  / |"},
            {"  | |  ", "  \\ \\/ /  ",   "  > <  ",   
            "| |     ", "| |     ",  "| |  | |",   "| |\\/| |"},
            {" _| |_ ", "   \\  /   ",    " / . \\ ",  
            "| |____ ", "| |____ ",  "| |__| |",   "| |  | |"},
            {"|_____|", "    \\/    ",    "/_/ \\_\\", 
            "|______|", " \\_____|", "|_____/ ",   "|_|  |_|"}
        };

        StringBuilder result = new StringBuilder();
        for(int i=0;i<6;i++) {
            for (String chara : romanNumber.split("")) {
                result.append(Matrix[i][characterToindex.get(chara)]);
                result.append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}