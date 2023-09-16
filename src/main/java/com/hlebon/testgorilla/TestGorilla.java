package com.hlebon.testgorilla;

import java.util.*;

public class TestGorilla {

    public static String decryption(String input) {
        String[] split = input.split("[^a-zA-Z0-9]");
        // Map
        Comparator<Element> comparator = new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                int result = o1.sum - o2.sum;
                if (result == 0) {
                    o2.word = o1.word;
                }
                return result;
            }
        };

        Set<Element> set = new TreeSet<>(comparator);

        for (String word : split) {
            if (word.length() == 0) continue;
            Element element = getElement(word);
//            if (set.contains(element)) {
//                set.remove(element);
//            }
            set.add(element);
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (Element element : set) {
            if (flag) sb.append(" ");
            sb.append(element.word);
            flag = true;
        }

        return sb.toString();
    }

    private static Element getElement(String word) {
        StringBuilder wordSb = new StringBuilder();
        int sum = 0;
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            } else {
                wordSb.append(c);
            }
        }
        return Element.of(wordSb.toString(), sum);
    }

    private static class Element {
        public String word;
        public int sum;

        private Element(String word, int sum) {
            this.word = word;
            this.sum = sum;
        }

        static Element of(String word, int sum) {
            return new Element(word, sum);
        }
    }
}
