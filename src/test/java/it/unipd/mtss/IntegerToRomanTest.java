////////////////////////////////////////////////////////////////////
// Elia Ernesto Stellin 2101084
// Mattia Scomparin 2110992
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void TestNumeri_OutOfBounds() {
        assertEquals(IntegerToRoman.convert(0), null);
        assertEquals(IntegerToRoman.convert(11), null);
    }

    @Test
    public void TestNumeri_Uno_Tre() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals(converter.convert(1), "I");
        assertEquals(converter.convert(2), "II");
        assertEquals(converter.convert(3), "III");
    }

    @Test
    public void TestNumeri_4_6() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals(converter.convert(4), "IV");
        assertEquals(converter.convert(5), "V");
        assertEquals(converter.convert(6), "VI");
    }

    @Test
    public void TestNumeri_7_10() {
        assertEquals(IntegerToRoman.convert(7), "VII");
        assertEquals(IntegerToRoman.convert(8), "VIII");
        assertEquals(IntegerToRoman.convert(9), "IX");
        assertEquals(IntegerToRoman.convert(10), "X");
    }
}