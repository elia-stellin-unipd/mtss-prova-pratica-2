////////////////////////////////////////////////////////////////////
// Elia Ernesto Stellin 2101084
// Mattia Scomparin 2110992
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void TestNumeri_Uno_Tre() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals(converter.convert(1), "I");
        assertEquals(converter.convert(2), "II");
        assertEquals(converter.convert(3), "III");
        assertEquals(converter.convert(0), null);
    }

    @Test
    public void TestNumeri_4_6() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals(converter.convert(4), "IV");
        assertEquals(converter.convert(5), "V");
        assertEquals(converter.convert(6), "VI");
    }
}