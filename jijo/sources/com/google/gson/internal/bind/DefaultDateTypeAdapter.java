package com.google.gson.internal.bind;

import com.google.android.gms.internal.ads.fb1;
import com.google.gson.JsonSyntaxException;
import com.google.gson.x;
import g4.a0;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12080b;

    public DefaultDateTypeAdapter(b bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f12080b = arrayList;
        Objects.requireNonNull(bVar);
        this.f12079a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (com.google.gson.internal.e.f12183a >= 9) {
            arrayList.add(a0.l(i10, i11));
        }
    }

    @Override // com.google.gson.x
    public final Object b(s5.a aVar) throws IOException {
        Date dateB;
        if (aVar.T() == 9) {
            aVar.P();
            return null;
        }
        String strR = aVar.R();
        synchronized (this.f12080b) {
            try {
                Iterator it = this.f12080b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = p5.a.b(strR, new ParsePosition(0));
                            break;
                        } catch (ParseException e10) {
                            StringBuilder sbK = fb1.k("Failed parsing '", strR, "' as Date; at path ");
                            sbK.append(aVar.F(true));
                            throw new JsonSyntaxException(sbK.toString(), e10);
                        }
                    }
                    try {
                        dateB = ((DateFormat) it.next()).parse(strR);
                    } catch (ParseException unused) {
                    }
                }
            } finally {
            }
        }
        return this.f12079a.b(dateB);
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.G();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f12080b.get(0);
        synchronized (this.f12080b) {
            str = dateFormat.format(date);
        }
        bVar.N(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f12080b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
