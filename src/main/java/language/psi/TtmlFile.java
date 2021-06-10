// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import language.TtmlFileType;
import language.TtmlLanguage;
import org.jetbrains.annotations.NotNull;

public class TtmlFile extends PsiFileBase {

    public TtmlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TtmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return TtmlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "TTML File";
    }

}