package team.dev.epro.apkcustom.widgets.jsonhighlight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;
import f7.h;
import g9.a;
import g9.b;
import g9.c;
import g9.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import l.x;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public class CodeView extends x {
    public static final Pattern J;
    public static final Pattern K;
    public boolean A;
    public boolean B;
    public final Handler C;
    public MultiAutoCompleteTextView.Tokenizer D;
    public final TreeMap E;
    public final HashMap F;
    public List G;
    public final h H;
    public c I;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f17437t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Paint f17438u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f17440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17441x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17442y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f17443z;

    static {
        NativeUtil.classesInit0(23);
        J = Pattern.compile(Crypt.a(Crypt.xrc("\u0019:?Njh\u001c99\u0019<cAkc\u001b:h\u001bi8\u001a9oJfbOmjNm")), 8);
        K = Pattern.compile(Crypt.a(Crypt.xrc("\u001elcAgcI:?Im9\u0019gb\u001ck?H=>Mg9\u001eh<AlbNl")), 8);
    }

    public CodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f17436s = false;
        this.f17439v = 2;
        this.f17440w = 2;
        this.f17443z = 500;
        this.A = true;
        this.C = new Handler();
        float f10 = getResources().getDisplayMetrics().density;
        this.E = new TreeMap();
        this.F = new HashMap();
        this.G = Arrays.asList('{', '+', '-', '*', '/', '=');
        this.H = new h(8, this);
        b bVar = new b(this);
        this.f17437t = new Rect();
        Paint paint = new Paint();
        this.f17438u = paint;
        paint.setAntiAlias(true);
        this.f17438u.setStyle(Paint.Style.FILL);
        this.f17438u.setColor(-1);
        this.f17438u.setTextSize(getTextSize() - 2);
        if (this.D == null) {
            this.D = new f();
        }
        setFilters(new InputFilter[]{new a(this)});
        addTextChangedListener(bVar);
    }

    public final native void c(Pattern pattern, int i10);

    public final native Editable d(Editable editable);

    public final native void e(Editable editable);

    public final native void f(Editable editable);

    public native List<Character> getAutoIndentCharacterList();

    public native int getErrorsSize();

    public native int getLineNumberMarginGap();

    public native int getLineNumberTextColor();

    public native int getSyntaxPatternsSize();

    public native String getTextWithoutTrailingSpace();

    public native int getUpdateDelayTime();

    @Override // android.widget.TextView, android.view.View
    public final native void onDraw(Canvas canvas);

    @Override // l.x, android.widget.EditText, android.widget.TextView
    public final native boolean onTextContextMenuItem(int i10);

    public native void setAutoCompleteTokenizer(MultiAutoCompleteTextView.Tokenizer tokenizer);

    public native void setAutoIndentCharacterList(List<Character> list);

    public native void setLineNumberMarginGap(int i10);

    public native void setLineNumberTextColor(int i10);

    public native void setLineNumberVisible(boolean z9);

    public native void setOnPasteListener(c cVar);

    public native void setRemoveErrorsWhenTextChanged(boolean z9);

    public native void setSyntaxPatternsMap(Map<Pattern, Integer> map);

    public native void setTabWidth(int i10);

    public native void setTextHighlighted(CharSequence charSequence);

    public native void setUpdateDelayTime(int i10);
}
