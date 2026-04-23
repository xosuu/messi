package com.google.gson.internal;

import com.google.android.gms.internal.ads.en1;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f12180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f12181b;

    public c(Type[] typeArr, Type[] typeArr2) {
        en1.e(typeArr2.length <= 1);
        en1.e(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.b(typeArr[0]);
            this.f12181b = null;
            this.f12180a = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.b(typeArr2[0]);
        en1.e(typeArr[0] == Object.class);
        this.f12181b = d.a(typeArr2[0]);
        this.f12180a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f12181b;
        return type != null ? new Type[]{type} : d.f12182a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f12180a};
    }

    public final int hashCode() {
        Type type = this.f12181b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f12180a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f12181b;
        if (type != null) {
            return "? super " + d.h(type);
        }
        Type type2 = this.f12180a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.h(type2);
    }
}
