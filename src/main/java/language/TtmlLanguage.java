package language;

import com.intellij.lang.Language;

public class TtmlLanguage extends Language {

    public static final TtmlLanguage INSTANCE = new TtmlLanguage();

    private TtmlLanguage() {
        super("TTML");
    }
}
