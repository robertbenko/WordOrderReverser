

public class WordOrderReverser {

    public static void main(String[] args) {

        String SENTENCE = "Ala ma kota burego";
        String[] splitedWords = SENTENCE.split(" ");

        StringBuilder reversedSENTENCE = new StringBuilder();

        for (int i = splitedWords.length -1; i >= 0; i--){
            reversedSENTENCE.append(splitedWords[i]);
            if(i !=0){
                reversedSENTENCE.append(" ");
            }
        }
        System.out.println(reversedSENTENCE);

    }




}
