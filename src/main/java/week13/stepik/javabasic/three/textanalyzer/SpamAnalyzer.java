package week13.stepik.javabasic.three.textanalyzer;

public class SpamAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] strings){
        keywords = strings;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
