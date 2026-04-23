package com.google.gson.internal.sql;

import com.google.android.gms.internal.ads.fb1;
import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
final class SqlDateTypeAdapter extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f12217b = new y() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, r5.a aVar) {
            if (aVar.f16536a == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f12218a;

    public /* synthetic */ SqlDateTypeAdapter(int i10) {
        this();
    }

    @Override // com.google.gson.x
    public final Object b(s5.a aVar) throws IOException {
        java.util.Date date;
        if (aVar.T() == 9) {
            aVar.P();
            return null;
        }
        String strR = aVar.R();
        try {
            synchronized (this) {
                date = this.f12218a.parse(strR);
            }
            return new Date(date.getTime());
        } catch (ParseException e10) {
            StringBuilder sbK = fb1.k("Failed parsing '", strR, "' as SQL Date; at path ");
            sbK.append(aVar.F(true));
            throw new JsonSyntaxException(sbK.toString(), e10);
        }
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.G();
            return;
        }
        synchronized (this) {
            str = this.f12218a.format((java.util.Date) date);
        }
        bVar.N(str);
    }

    private SqlDateTypeAdapter() {
        this.f12218a = new SimpleDateFormat("MMM d, yyyy");
    }
}
