package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends h1 {
    @Override // l.h1, l.j1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // l.j1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
