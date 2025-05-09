////////////////////////////////////////////////////////////////////
// Elia Ernesto Stellin 2101084
// Mattia Scomparin 2110992
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {

        String[] chars = {"X", "IX", "V", "IV", "I"};
        int[] values = {10, 9, 5, 4, 1};

        if(number > 20 || number < values[values.length-1]) {
            return null;
        }

        StringBuilder res = new StringBuilder();

        for (int index = 0; index < values.length; index++) {
            while(number - values[index] >= 0){
                number -= values[index];
                res.append(chars[index]);
            }
        }
        return res.toString();
    }
}