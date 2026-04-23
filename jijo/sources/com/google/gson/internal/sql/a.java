package com.google.gson.internal.sql;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.google.gson.internal.bind.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Class cls, int i10) {
        super(cls);
        this.f12223c = i10;
    }

    @Override // com.google.gson.internal.bind.b
    public final Date b(Date date) {
        switch (this.f12223c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
