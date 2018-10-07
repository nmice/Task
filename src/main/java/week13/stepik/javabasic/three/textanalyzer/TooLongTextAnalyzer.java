package week13.stepik.javabasic.three.textanalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private static int DEFAULT_MAX_TEXT_LENGTH = Integer.MAX_VALUE;
    private int maxLength;

    public TooLongTextAnalyzer(int maxTextLength){
        maxLength = maxTextLength;

    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
