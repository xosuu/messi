package x4;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f18459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f18460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Constructor f18461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static TextDirectionHeuristic f18462p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f18463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f18464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18466d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18473k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f18467e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18468f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18469g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18470h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18471i = f18459m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18472j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f18474l = null;

    static {
        f18459m = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public u(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f18463a = charSequence;
        this.f18464b = textPaint;
        this.f18465c = i10;
        this.f18466d = charSequence.length();
    }

    public final StaticLayout a() throws t {
        if (this.f18463a == null) {
            this.f18463a = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        int iMax = Math.max(0, this.f18465c);
        CharSequence charSequenceEllipsize = this.f18463a;
        int i10 = this.f18468f;
        TextPaint textPaint = this.f18464b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f18474l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f18466d);
        this.f18466d = iMin;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (!f18460n) {
                try {
                    f18462p = this.f18473k && i11 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    f18461o = declaredConstructor;
                    declaredConstructor.setAccessible(true);
                    f18460n = true;
                } catch (Exception e10) {
                    throw new t(e10);
                }
            }
            try {
                Constructor constructor = f18461o;
                constructor.getClass();
                TextDirectionHeuristic textDirectionHeuristic = f18462p;
                textDirectionHeuristic.getClass();
                return (StaticLayout) constructor.newInstance(charSequenceEllipsize, 0, Integer.valueOf(this.f18466d), textPaint, Integer.valueOf(iMax), this.f18467e, textDirectionHeuristic, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f18472j), null, Integer.valueOf(iMax), Integer.valueOf(this.f18468f));
            } catch (Exception e11) {
                throw new t(e11);
            }
        }
        if (this.f18473k && this.f18468f == 1) {
            this.f18467e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f18467e);
        builderObtain.setIncludePad(this.f18472j);
        builderObtain.setTextDirection(this.f18473k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f18474l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f18468f);
        float f10 = this.f18469g;
        if (f10 != 0.0f || this.f18470h != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f18470h);
        }
        if (this.f18468f > 1) {
            builderObtain.setHyphenationFrequency(this.f18471i);
        }
        return builderObtain.build();
    }
}
