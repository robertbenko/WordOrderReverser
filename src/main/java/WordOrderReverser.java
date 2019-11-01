public class WordOrderReverser {

    private static final String SENTENCE = "Ala ma kota burego";

    private static String[] getWordSentence(){ return SENTENCE.split(" ");}


    public static void main(String[] args){

        String reversedSentence = "";

        for (int i = 0; i<getWordSentence().length; i++ ){
            if(i == getWordSentence().length-1 )
                reversedSentence = getWordSentence()[i] + reversedSentence;
            else
                reversedSentence = " " + getWordSentence()[i] + reversedSentence;

        }
        System.out.println(reversedSentence);
    }



}
