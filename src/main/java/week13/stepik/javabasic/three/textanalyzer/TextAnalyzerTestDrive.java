package week13.stepik.javabasic.three.textanalyzer;

public class TextAnalyzerTestDrive {
    String[] spamWords = {"spam", "rich", "millionaire"};
    TextAnalyzer[] myAnalyzers = {new NegativeTextAnalyzer(), new SpamAnalyzer(spamWords), new TooLongTextAnalyzer(55)};

    public static void main(String[] args) {
        TextAnalyzerTestDrive testObject = new TextAnalyzerTestDrive();
        System.out.println(testObject.checkLabels(testObject.myAnalyzers, "I feel so bad :("));
        System.out.println(testObject.checkLabels(testObject.myAnalyzers, "Cool movie by the way how to become a millionaire !"));
        System.out.println(testObject.checkLabels(testObject.myAnalyzers, "cccccccc10cccccccc20cccccccc30cccccccc40cccccccc50ooo55...oops"));
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers)
            if (analyzer.processText(text) != Label.OK) {
                return analyzer.processText(text);
            }
        return Label.OK;
    }

    abstract class KeywordAnalyzer implements TextAnalyzer {

        protected abstract String[] getKeywords();

        protected abstract Label getLabel();

        @Override
        public Label processText(String text) {
            for (String key : getKeywords()) {
                if (text.contains(key)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }


    class SpamAnalyzer extends KeywordAnalyzer {
        private String keywords[];

        public SpamAnalyzer(String keywords[]) {
            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords() {
            return this.keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }

    class NegativeTextAnalyzer extends KeywordAnalyzer {

        public NegativeTextAnalyzer() {
        }

        @Override
        protected String[] getKeywords() {
            return new String[]{":(", "=(", ":|"};
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    class TooLongTextAnalyzer implements TextAnalyzer {
        private int maxLength;

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
} 