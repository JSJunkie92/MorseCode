package se.skola;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MorseTranslatorTest {

    @Test
    void testHejToMorse() {
        MorseTranslator translator = new MorseTranslator();
        assertEquals(".... . .---",
                translator.textToMorse("HEJ"));
    }

    @Test
    void testMorseToHej() {
        MorseTranslator translator = new MorseTranslator();
        assertEquals("HEJ",
                translator.morseToText(".... . .---"));
    }

    @Test
    void testHelloWorldToText() {
        MorseTranslator translator = new MorseTranslator();
        assertEquals("HELLOWORLD",
                translator.morseToText(
                        ".... . .-.. .-.. --- .-- --- .-. .-.. -.."));
    }

    @Test
    void testTextWithSpaces() {
        MorseTranslator translator = new MorseTranslator();
        assertEquals(".... . .-.. .-.. ---",
                translator.textToMorse("HELLO"));
    }

    @Test
    void testInvalidCharacterThrowsException() {
        MorseTranslator translator = new MorseTranslator();
        assertThrows(IllegalArgumentException.class,
                () -> translator.textToMorse("ABC1"));
    }

    @Test
    void testInvalidMorseThrowsException() {
        MorseTranslator translator = new MorseTranslator();
        assertThrows(IllegalArgumentException.class,
                () -> translator.morseToText(".... ....-"));
    }
}