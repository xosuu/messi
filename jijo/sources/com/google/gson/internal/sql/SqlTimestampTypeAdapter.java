package com.google.gson.internal.sql;

import com.google.gson.j;
import com.google.gson.x;
import com.google.gson.y;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
class SqlTimestampTypeAdapter extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f12221b = new y() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, r5.a aVar) {
            if (aVar.f16536a != Timestamp.class) {
                return null;
            }
            jVar.getClass();
            return new SqlTimestampTypeAdapter(jVar.c(new r5.a(Date.class)));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f12222a;

    public SqlTimestampTypeAdapter(x xVar) {
        this.f12222a = xVar;
    }

    @Override // com.google.gson.x
    public final Object b(s5.a aVar) {
        Date date = (Date) this.f12222a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) {
        this.f12222a.c(bVar, (Timestamp) obj);
    }
}
