package f;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final k K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f12918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f12919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f12921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f12922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AlertController$RecycleListView f12923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f12924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12925i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f12927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f12928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Message f12929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f12930n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f12931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f12932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f12933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f12934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f12935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f12936t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f12937u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f12938v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NestedScrollView f12939w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f12941y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f12942z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12926j = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12940x = 0;
    public int E = -1;
    public final b L = new b(1, this);

    public m(Context context, m0 m0Var, Window window) {
        this.f12917a = context;
        this.f12918b = m0Var;
        this.f12919c = window;
        this.K = new k(m0Var);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, e.a.f12598e, R.attr.ai, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.G = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.H = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.I = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.J = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f12920d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        m0Var.f().i(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.K.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f12936t = charSequence;
            this.f12937u = messageObtainMessage;
            this.f12938v = null;
        } else if (i10 == -2) {
            this.f12932p = charSequence;
            this.f12933q = messageObtainMessage;
            this.f12934r = null;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f12928l = charSequence;
            this.f12929m = messageObtainMessage;
            this.f12930n = null;
        }
    }
}
