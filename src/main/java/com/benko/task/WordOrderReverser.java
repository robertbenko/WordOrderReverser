package com.benko.task;

class WordOrderReverser {
    static String reverse(String sentence) {
        if(sentence == null){
            throw new IllegalArgumentException();
        }

        StringBuilder sb = new StringBuilder();

        String[] splitedSentence = sentence.split(" ");

        for(int i=splitedSentence.length-1; i>=0; i--){
            sb.append(splitedSentence[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
