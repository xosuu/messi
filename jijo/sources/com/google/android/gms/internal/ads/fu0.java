package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fu0 implements iu0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fu0 f4664e = new fu0(new ju0());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Date f4665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ju0 f4667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4668d;

    public fu0(ju0 ju0Var) {
        this.f4667c = ju0Var;
    }

    @Override // com.google.android.gms.internal.ads.iu0
    public final void b(boolean z9) {
        if (!this.f4668d && z9) {
            Date date = new Date();
            Date date2 = this.f4665a;
            if (date2 == null || date.after(date2)) {
                this.f4665a = date;
                if (this.f4666b) {
                    Iterator it = Collections.unmodifiableCollection(hu0.f5402c.f5404b).iterator();
                    while (it.hasNext()) {
                        qu0 qu0Var = ((yt0) it.next()).f11033d;
                        Date date3 = this.f4665a;
                        qu0Var.c(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f4668d = z9;
    }
}
