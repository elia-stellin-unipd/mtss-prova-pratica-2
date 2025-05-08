////////////////////////////////////////////////////////////////////
// Elia Ernesto Stellin 2101084
// Mattia Scomparin 2110992
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        //Legacy Code 
        //switch(number) {
        //     case 1:
        //         return "I";
        //     case 2:
        //         return "II";
        //     case 3:
        //         return "III";
        //     case 4:
        //         return "IV";
        //     case 5:
        //         return "V";
        //     case 6:
        //         return "VI";
        //     default:
        //         return null;
        // }
        String[] chars = {"X", "IX", "V", "IV", "I"};
        int[] values = {10, 9, 5, 4, 1};

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