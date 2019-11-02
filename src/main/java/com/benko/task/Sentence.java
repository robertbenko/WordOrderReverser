package com.benko.task;

import java.util.Objects;

class Sentence {

    final private String words;

    Sentence(String words) {
        if (words == null) {
            throw new IllegalArgumentException();
        }
        this.words = words;
    }

    Sentence reverse() {
        String[] wordsArray = words.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = wordsArray.length - 1; i >= 0; i--) {
            sb.append(wordsArray[i]).append(" ");
        }

        return new Sentence(sb.toString().trim());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
