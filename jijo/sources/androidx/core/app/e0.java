package androidx.core.app;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f459d = new Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f461f;

    public e0(CharSequence charSequence, long j10, l0 l0Var) {
        this.f456a = charSequence;
        this.f457b = j10;
        this.f458c = l0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e0 e0Var = (e0) arrayList.get(i10);
            e0Var.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = e0Var.f456a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", e0Var.f457b);
            l0 l0Var = e0Var.f458c;
            if (l0Var != null) {
                bundle.putCharSequence("sender", l0Var.f497a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", k0.b(l0Var));
                } else {
                    bundle.putBundle("person", l0Var.b());
                }
            }
            String str = e0Var.f460e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = e0Var.f461f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = e0Var.f459d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i10] = bundle;
        }
        return bundleArr;
    }

    public static ArrayList b(Parcelable[] parcelableArr) {
        l0 l0VarA;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                e0 e0Var = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            l0VarA = l0.a(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            l0VarA = k0.a(a5.f.h(bundle.getParcelable("sender_person")));
                        } else if (bundle.containsKey("sender")) {
                            CharSequence charSequence = bundle.getCharSequence("sender");
                            l0 l0Var = new l0();
                            l0Var.f497a = charSequence;
                            l0Var.f498b = null;
                            l0Var.f499c = null;
                            l0Var.f500d = null;
                            l0Var.f501e = false;
                            l0Var.f502f = false;
                            l0VarA = l0Var;
                        } else {
                            l0VarA = null;
                        }
                        e0 e0Var2 = new e0(bundle.getCharSequence("text"), bundle.getLong("time"), l0VarA);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            e0Var2.f460e = string;
                            e0Var2.f461f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            e0Var2.f459d.putAll(bundle.getBundle("extras"));
                        }
                        e0Var = e0Var2;
                    }
                } catch (ClassCastException unused) {
                }
                if (e0Var != null) {
                    arrayList.add(e0Var);
                }
            }
        }
        return arrayList;
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message messageC;
        int i10 = Build.VERSION.SDK_INT;
        long j10 = this.f457b;
        CharSequence charSequence = this.f456a;
        l0 l0Var = this.f458c;
        if (i10 >= 28) {
            p.A();
            messageC = a5.f.f(charSequence, j10, l0Var != null ? k0.b(l0Var) : null);
        } else {
            p.A();
            messageC = p.c(charSequence, j10, l0Var != null ? l0Var.f497a : null);
        }
        String str = this.f460e;
        if (str != null) {
            messageC.setData(str, this.f461f);
        }
        return messageC;
    }
}
