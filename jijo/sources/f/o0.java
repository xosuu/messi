package f;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f12948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12949b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f12950d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f12951f;

    public o0(View view, String str) {
        this.f12948a = view;
        this.f12949b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f12950d == null) {
            View view2 = this.f12948a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f12949b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbK = fb1.k("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbK.append(view2.getClass());
                    sbK.append(str);
                    throw new IllegalStateException(sbK.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f12950d = method;
                        this.f12951f = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f12950d.invoke(this.f12951f, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
