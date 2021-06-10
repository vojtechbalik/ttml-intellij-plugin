package language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TtmlFileType extends LanguageFileType {
    public static final TtmlFileType INSTANCE = new TtmlFileType();

    private TtmlFileType() {
        super(TtmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "TTML File";
    }

    @Override
    public String getDescription() {
        return "TTML (Teletype markup language) file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ttml";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return TtmlIcons.FILE;
    }
}
