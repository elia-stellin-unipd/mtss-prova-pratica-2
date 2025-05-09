////////////////////////////////////////////////////////////////////
// Elia Ernesto Stellin 2101084
// Mattia Scomparin 2110992
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {

        String[] chars = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values =   {100,  90,  50,   40,  10,    9,   5,    4,   1};

        if(number > values[0] || number < values[values.length-1]) {
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