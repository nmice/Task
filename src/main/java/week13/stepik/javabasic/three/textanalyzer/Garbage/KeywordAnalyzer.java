package week13.stepik.javabasic.three.textanalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    @Override
    public Label processText(String text) {
        return getLabel(text, getKeywords());
    }

    protected abstract String[] getKeywords();

    protected abstract Label getLabel(String word, String[] keyWords);
}
