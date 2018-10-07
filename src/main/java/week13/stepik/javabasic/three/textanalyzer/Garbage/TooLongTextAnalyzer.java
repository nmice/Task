package week13.stepik.javabasic.three.textanalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private static int DEFAULT_MAX_TEXT_LENGTH = Integer.MAX_VALUE;
    private int maxLength;

    public TooLongTextAnalyzer() {
        this(DEFAULT_MAX_TEXT_LENGTH);
    }

    public TooLongTextAnalyzer(int maxTextLength) {
        maxLength = maxTextLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
