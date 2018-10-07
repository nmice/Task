package week13.stepik.javabasic.three.textanalyzer;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] strings) {
        keywords = strings;
    }

    @Override
    public Label processText(String text) {
        return getLabel(text, getKeywords());
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel(String text, String[] keyWords) {
        String[] wordsInText = text.split(" ", Integer.MAX_VALUE);
        for (String word : wordsInText) {
            for (String key : keyWords) {
                if (word.equals(key)) {
                    return Label.SPAM;
                }
            }
        }
        return Label.OK;
    }
}
