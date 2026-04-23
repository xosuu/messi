package com.google.gson.internal.bind;

import com.google.android.gms.internal.ads.fb1;
import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.x;
import com.google.gson.y;
import g4.a0;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class DateTypeAdapter extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f12077b = new y() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, r5.a aVar) {
            if (aVar.f16536a == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12078a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f12078a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.google.gson.internal.e.f12183a >= 9) {
            arrayList.add(a0.l(2, 2));
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
        synchronized (this.f12078a) {
            try {
                Iterator it = this.f12078a.iterator();
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
        return dateB;
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.G();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f12078a.get(0);
        synchronized (this.f12078a) {
            str = dateFormat.format(date);
        }
        bVar.N(str);
    }
}
