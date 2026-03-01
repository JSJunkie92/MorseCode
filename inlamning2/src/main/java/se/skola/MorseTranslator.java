package se.skola;

import java.util.HashMap;

public class MorseTranslator {

    private HashMap<Character, String> morseMap;
    private HashMap<String, Character> textMap;

    public MorseTranslator() {
        morseMap = new HashMap<>();
        textMap = new HashMap<>();

        add('A', ".-");
        add('B', "-...");
        add('C', "-.-.");
        add('D', "-..");
        add('E', ".");
        add('F', "..-.");
        add('G', "--.");
        add('H', "....");
        add('I', "..");
        add('J', ".---");
        add('K', "-.-");
        add('L', ".-..");
        add('M', "--");
        add('N', "-.");
        add('O', "---");
        add('P', ".--.");
        add('Q', "--.-");
        add('R', ".-.");
        add('S', "...");
        add('T', "-");
        add('U', "..-");
        add('V', "...-");
        add('W', ".--");
        add('X', "-..-");
        add('Y', "-.--");
        add('Z', "--..");
    }

    private void add(char letter, String morse) {
        morseMap.put(letter, morse);
        textMap.put(morse, letter);
    }

    public String textToMorse(String text) {
        text = text.toUpperCase().replace(" ", "");
        String result = "";

        for (char c : text.toCharArray()) {
            if (!morseMap.containsKey(c)) {
                throw new IllegalArgumentException("Ogiltigt tecken: " + c);
            }
            result += morseMap.get(c) + " ";
        }
        return result.trim();
    }

    public String morseToText(String morse) {
        String[] parts = morse.split(" ");
        String result = "";

        for (String p : parts) {
            if (!textMap.containsKey(p)) {
                throw new IllegalArgumentException("Ogiltig morsekod: " + p);
            }
            result += textMap.get(p);
        }
        return result;
    }
}