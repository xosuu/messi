package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i20 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f5462b;

    public i20(Context context) {
        super(context);
        this.f5461a = context;
    }

    public static i20 a(Context context, View view, fr0 fr0Var) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        i20 i20Var = new i20(context);
        boolean zIsEmpty = fr0Var.f4640u.isEmpty();
        Context context2 = i20Var.f5461a;
        if (!zIsEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((gr0) fr0Var.f4640u.get(0)).f5037a;
            float f11 = displayMetrics.density;
            i20Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r2.f5038b * f11)));
        }
        i20Var.f5462b = view;
        i20Var.addView(view);
        zzu.zzx();
        yu yuVar = new yu(i20Var, i20Var);
        View view2 = (View) ((WeakReference) yuVar.f7565a).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            yuVar.J0(viewTreeObserver);
        }
        zzu.zzx();
        xu xuVar = new xu(i20Var, i20Var);
        View view3 = (View) ((WeakReference) xuVar.f7565a).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            xuVar.J0(viewTreeObserver3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObject = fr0Var.f4615h0;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            i20Var.b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            i20Var.b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        i20Var.addView(relativeLayout);
        return i20Var;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        Context context = this.f5461a;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", 0.0d);
        zzay.zzb();
        int iZzy = zzf.zzy(context, (int) dOptDouble);
        textView.setPadding(0, iZzy, 0, iZzy);
        double dOptDouble2 = jSONObject.optDouble("height", 15.0d);
        zzay.zzb();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzf.zzy(context, (int) dOptDouble2));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f5462b.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f5462b.setY(-r0[1]);
    }
}
