package language.psi;

import com.intellij.psi.tree.IElementType;
import language.TtmlLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TtmlTokenType extends IElementType {

    public TtmlTokenType(@NotNull @NonNls String debugName) {
        super(debugName, TtmlLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "TtmlTokenType." + super.toString();
    }

}