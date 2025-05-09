////////////////////////////////////////////////////////////////////
// Elia Ernesto Stellin 2101084
// Mattia Scomparin 2110992
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void TestLetteraOutOfBounds() {
        int toTest = -1;
        String expected = null;

        String obtained = RomanPrinter.print(toTest);

        assertEquals(expected, obtained);
    }

    @Test
    public void TestLetteraI() {
        int toTest = 1;
        String expected = " _____  \n|_   _| \n  | |  " +
        " \n  | |   \n _| |_  \n|_____| \n";

        var printer = new RomanPrinter();
        String obtained = printer.print(toTest);

        assertEquals(expected, obtained);
    }

    @Test
    public void TestLetteraV() {
        int toTest = 5;
        String expected =   "__      __" + " \n"+
                            "\\ \\    / /" + " \n"+
                            " \\ \\  / / "+ " \n"+
                            "  \\ \\/ /  "+ " \n"+
                            "   \\  /   "+ " \n"+
                            "    \\/    "+ " \n";

        String obtained = RomanPrinter.print(toTest);

        assertEquals(expected, obtained);
    }

    @Test
    public void TestLetteraX() {
        int toTest = 10;
        String expected =    "__   __" +" \n"+
                            "\\ \\ / /" +" \n"+
                            " \\ V / " +" \n"+
                            "  > <  " +" \n"+
                            " / . \\ " +" \n"+
                            "/_/ \\_\\" +" \n";

        String obtained = RomanPrinter.print(toTest);

        assertEquals(expected, obtained);
    }

    @Test
    public void TestLetteraL() {
        int toTest = 50;
        String expected =   " _       \n" +
                            "| |      \n" +
                            "| |      \n" +
                            "| |      \n" +
                            "| |____  \n" +
                            "|______| \n";

        String obtained = RomanPrinter.print(toTest);

        assertEquals(expected, obtained);
    }

    @Test
    public void TestLetteraC() {
        int toTest = 100;
        String expected =   "  _____  \n" +
                            " / ____| \n" +
                            "| |      \n" +
                            "| |      \n" +
                            "| |____  \n" +
                            " \\_____| \n";

        String obtained = RomanPrinter.print(toTest);

        assertEquals(expected, obtained);
    }

    @Test
    public void TestLetteraD() {
        int toTest = 500;
        String expected =   " _____   \n" +
                            "|  __ \\  \n" +
                            "| |  | | \n" +
                            "| |  | | \n" +
                            "| |__| | \n" +
                            "|_____/  \n";

        String obtained = RomanPrinter.print(toTest);

        assertEquals(expected, obtained);
    }

    @Test
    public void TestLetteraM() {
        int toTest = 1000;
        String expected =   " __  __  \n"  +
                            "|  \\/  | \n" +
                            "| \\  / | \n" +
                            "| |\\/| | \n" +
                            "| |  | | \n"  +
                            "|_|  |_| \n";

        String obtained = RomanPrinter.print(toTest);

        assertEquals(expected, obtained);
    }

    @Test
    public void TestNumero51() {
        int toTest = 51;
        String expected =   " _        _____  \n" +
                            "| |      |_   _| \n" +
                            "| |        | |   \n" +
                            "| |        | |   \n" +
                            "| |____   _| |_  \n" +
                            "|______| |_____| \n";

        String obtained = RomanPrinter.print(toTest);

        assertEquals(expected, obtained);
    }

    @Test
    public void TestNumero104() {
        int toTest = 104;
        String expected =   "  _____  "  + " _____  " + "__      __ \n"  +   
                            " / ____| "  + "|_   _| " + "\\ \\    / / \n" +
                            "| |      "  + "  | |   " + " \\ \\  / /  \n" +
                            "| |      "  + "  | |   " + "  \\ \\/ /   \n" +
                            "| |____  "  + " _| |_  " + "   \\  /    \n"  +
                            " \\_____| " + "|_____| " + "    \\/     \n";

        String obtained = RomanPrinter.print(toTest);

        assertEquals(expected, obtained);
    }
}