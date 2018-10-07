package week13.stepik.javabasic.three.textanalyzer;

public abstract class KeywordAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel(String word, String[] keyWords);
}
