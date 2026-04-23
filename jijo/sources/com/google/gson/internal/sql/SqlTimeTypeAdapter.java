package com.google.gson.internal.sql;

import com.google.android.gms.internal.ads.fb1;
import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
final class SqlTimeTypeAdapter extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f12219b = new y() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, r5.a aVar) {
            if (aVar.f16536a == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f12220a;

    public /* synthetic */ SqlTimeTypeAdapter(int i10) {
        this();
    }

    @Override // com.google.gson.x
    public final Object b(s5.a aVar) throws IOException {
        Time time;
        if (aVar.T() == 9) {
            aVar.P();
            return null;
        }
        String strR = aVar.R();
        try {
            synchronized (this) {
                time = new Time(this.f12220a.parse(strR).getTime());
            }
            return time;
        } catch (ParseException e10) {
            StringBuilder sbK = fb1.k("Failed parsing '", strR, "' as SQL Time; at path ");
            sbK.append(aVar.F(true));
            throw new JsonSyntaxException(sbK.toString(), e10);
        }
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.G();
            return;
        }
        synchronized (this) {
            str = this.f12220a.format((Date) time);
        }
        bVar.N(str);
    }

    private SqlTimeTypeAdapter() {
        this.f12220a = new SimpleDateFormat("hh:mm:ss a");
    }
}
