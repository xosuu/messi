package a5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class c extends t.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f25b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextPaint f26d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t.a f27f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f28h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context, TextPaint textPaint, t.a aVar) {
        super(4);
        this.f28h = dVar;
        this.f25b = context;
        this.f26d = textPaint;
        this.f27f = aVar;
    }

    @Override // t.a
    public final void k(int i10) {
        this.f27f.k(i10);
    }

    @Override // t.a
    public final void l(Typeface typeface, boolean z9) {
        this.f28h.g(this.f25b, this.f26d, typeface);
        this.f27f.l(typeface, z9);
    }
}
