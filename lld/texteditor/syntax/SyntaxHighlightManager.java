package texteditor.syntax;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SyntaxHighlightManager {

    Map<Language, Supplier<SyntaxHighlighter>> mapLanguageToSyntax = new HashMap<>();
    public SyntaxHighlightManager() {
        mapLanguageToSyntax.put(Language.JAVA, () -> new JavaHighlighter());
    }

    public Supplier<SyntaxHighlighter> getSyntaxHighlighterForLanguage(Language language){
        return mapLanguageToSyntax.get(language);
    }

}
