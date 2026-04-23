package g9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CodeView f13900a;

    static {
        NativeUtil.classesInit0(48);
    }

    public d(CodeView codeView) {
        this.f13900a = codeView;
    }

    @Override // android.text.style.ReplacementSpan
    public final native void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint);

    @Override // android.text.style.ReplacementSpan
    public final native int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt);
}
