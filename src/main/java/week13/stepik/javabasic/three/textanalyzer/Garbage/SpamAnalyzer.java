package week13.stepik.javabasic.three.textanalyzer;

public class SpamAnalyzer extends KeywordAnalyzer{
    private String[] keywords;

    public SpamAnalyzer(String[] strings) {
        keywords = strings;
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel(String text, String[] keyWords) {
        for (String key : keyWords) {
            if (text.contains(key)) {
                return Label.SPAM;
            }
        }
        return Label.OK;
    }
}
