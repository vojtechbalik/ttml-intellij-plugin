// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class TtmlColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Modifier", TtmlSyntaxHighlighter.MODIFIER),
            new AttributesDescriptor("Text", TtmlSyntaxHighlighter.TEXT),
            new AttributesDescriptor("Bad value", TtmlSyntaxHighlighter.BAD_CHARACTER)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return TtmlIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new TtmlSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "^F^W^V^ATTML: TeleType Markup Language^M\n" +
                "\n" +
                "^[https://esolangs.org/wiki/TTML^_Definition.^]\n" +
                "\n" +
                "^B^ATTML^B is a simple markup language that can be used for all kinds of documents.^M\n" +
                "the appearance of ^ATTML^B text is meant to evoke the look of mathematical and^M\n" +
                "scientific papers of the mid 20th century. ^ATTML^B uses simple ^Edirectives^B^M\n" +
                "which alter the appearance of text, reposition the flow of text, or allow stylistic^M\n" +
                "beauty within a minimalistic and retro aesthetic.^M\n" +
                "TTML directives consist of ascii control codes, or, for easier typing, the^M\n" +
                "caret-notation for those codes. Note the ^^^^ directive is used to insert a caret^M\n" +
                "into a TTML document.^M\n" +
                "Note that this documentation is best read by following its TTML source and rendered^M\n" +
                "version in parallel.^M\n" +
                "\n" +
                "\n" +
                "^WTTML Appearance Directives^M\n" +
                "^BThe most important appearance directive is ^^B which returns the appearance of^M\n" +
                "text to be entirely normal. ^^B cancels all previous appearance directives.^M\n" +
                "The ^^A directive creates ^Abold^B text for important terms. The ^^C directive^M\n" +
                "creates ^Csmall^B text for footnotes. The ^^E directive creates ^Eitalic^B text,^M\n" +
                "which can be used for the titles of works, and for ^Eemphasis^B. The ^^F directive^M\n" +
                "makes ^Funderlined^B text. The ^^G directive creates ^Ghighlighted^B text.^M\n" +
                "Finally the ^^U directive creates ^Ustruck thru^B text.^M\n" +
                "For coloring, use directives ^P^^P, ^Q^^Q, ^R^^R, ^S^^S, ^T^^T, ^Yand ^^Y to^M\n" +
                "return to black.^M\n" +
                "The ^^V directive doubles the ^Vwidth^B of text, while the ^^W directive doubles^M\n" +
                "the ^Wheight^B of text. For titles use both to create large text.^M\n" +
                "\n" +
                "\n" +
                "^WTTML Text Flow Directives^M\n" +
                "^BThe most important text flow directives are ^^M and ^^J which are used together^M\n" +
                "to end a line. You may also know ^^J as the newline character on UNIX. Alone,^M\n" +
                "^^J moves the flow of text to the next line, while ^^M moves the flow of text to the^M\n" +
                "beginning of the line. To insert a newline in TTML source without inserting^M\n" +
                "a ^^J you may escape it with the ^^\\ directive.^M\n" +
                "Other text flow directives are used mostly for formatting mathematical symbols.^M\n" +
                "The ^^H directive allows one character to be superimposed on another, like these:^M\n" +
                "=^H/ a^H` L^H=. In literal terms it simply moves the cursor one space backward.^M\n" +
                "The ^^I directive moves one half character forward. It is used to centre fractions,^M\n" +
                "like so:^M\n" +
                "   __^H^H^I1^B^M\n" +
                "   22^M\n" +
                "The ^^K directive moves by one half-line down. It is used to create subscripts^M\n" +
                "and superscripts like so:^M\n" +
                "C H O + 3O  -> 2CO  + 3H O^M^K^\\\n" +
                " 2 6      2       2     2^M\n" +
                " 0    -1    -2^M^K^\\\n" +
                "2  + 2   + 2   + ... = 2^M\n" +
                "\n" +
                "Example of an invalid modifier: ^1\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "TTML";
    }

}
