package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class lu0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f6703b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6704a = new ArrayList();

    public final void a(View view, au0 au0Var) {
        ku0 ku0Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f6703b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f6704a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                ku0Var = null;
                break;
            } else {
                ku0Var = (ku0) it.next();
                if (ku0Var.f6389a.get() == view) {
                    break;
                }
            }
        }
        if (ku0Var == null) {
            arrayList.add(new ku0(view, au0Var));
        }
    }
}
