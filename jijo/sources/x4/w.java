package x4;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18477c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f18479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a5.d f18480f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f18475a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4.b f18476b = new t4.b(1, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18478d = true;

    public w(v vVar) {
        this.f18479e = new WeakReference(null);
        this.f18479e = new WeakReference(vVar);
    }

    public final float a(String str) {
        if (!this.f18478d) {
            return this.f18477c;
        }
        float fMeasureText = str == null ? 0.0f : this.f18475a.measureText((CharSequence) str, 0, str.length());
        this.f18477c = fMeasureText;
        this.f18478d = false;
        return fMeasureText;
    }

    public final void b(a5.d dVar, Context context) {
        if (this.f18480f != dVar) {
            this.f18480f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f18475a;
                t4.b bVar = this.f18476b;
                dVar.f(context, textPaint, bVar);
                v vVar = (v) this.f18479e.get();
                if (vVar != null) {
                    textPaint.drawableState = vVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                this.f18478d = true;
            }
            v vVar2 = (v) this.f18479e.get();
            if (vVar2 != null) {
                vVar2.a();
                vVar2.onStateChange(vVar2.getState());
            }
        }
    }
}
