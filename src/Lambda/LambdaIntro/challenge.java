package Lambda.LambdaIntro;

import java.util.SplittableRandom;
import java.util.function.Consumer;

public class challenge {
    public static void main(String[] args) {

    }

    public void accept(String sentence) {
        String[] parts = sentence.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
    }

    //    Write above as lambda
    Consumer<String> printWordsLambda = sentence -> {
        String[] parts = sentence.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
    };

    public class challenge2 {
        public static String everySecondChar(String source) {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        }
        // writing above as lambda

        Consumer<String> everySecondChars = sentence -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < sentence.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(sentence.charAt(i));
                }
            }
        };
    }

}

