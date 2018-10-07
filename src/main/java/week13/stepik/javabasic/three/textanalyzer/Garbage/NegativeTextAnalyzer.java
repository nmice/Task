package week13.stepik.javabasic.three.textanalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {


    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel(String text, String[] keyWords) {
            for (String key : keyWords) {
                if (text.contains(key)) {
                    return Label.NEGATIVE_TEXT;
                }
            }
        return Label.OK;
    }
}
