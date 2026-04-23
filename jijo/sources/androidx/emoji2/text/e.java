package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f595b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f596a;

    public e() {
        TextPaint textPaint = new TextPaint();
        this.f596a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
