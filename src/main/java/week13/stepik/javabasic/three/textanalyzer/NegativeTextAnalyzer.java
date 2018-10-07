package week13.stepik.javabasic.three.textanalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {


    public NegativeTextAnalyzer() {
    }

    @Override
    public Label processText(String text) {
        return getLabel(text, getKeywords());
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel(String text, String[] keyWords) {
        String[] wordsInText = text.split(" ", Integer.MAX_VALUE);
        for (String word : wordsInText) {
            for (String key : keyWords) {
                if (word.equals(key)) {
                    return Label.NEGATIVE_TEXT;
                }
            }
        }
        return Label.OK;
    }
}
