package by.etc.task2.sentence.entity;

import by.etc.task2.word.entity.Word;

import java.util.Arrays;

public class Sentence {
    private Word[] words;

    public Sentence(Word[] words) {
        this.words = words;
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + Arrays.toString(words) +
                '}';
    }
}
