package language.psi;

import com.intellij.psi.tree.IElementType;
import language.TtmlLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TtmlElementType extends IElementType {

    public TtmlElementType(@NotNull @NonNls String debugName) {
        super(debugName, TtmlLanguage.INSTANCE);
    }

}