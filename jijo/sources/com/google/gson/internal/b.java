package com.google.gson.internal;

import com.google.android.gms.internal.ads.en1;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f12068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f12069b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Type[] f12070d;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z9 = true;
            boolean z10 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z10) {
                z9 = false;
            }
            en1.e(z9);
        }
        this.f12068a = type == null ? null : d.a(type);
        this.f12069b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f12070d = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f12070d[i10]);
            d.b(this.f12070d[i10]);
            Type[] typeArr3 = this.f12070d;
            typeArr3[i10] = d.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f12070d.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f12068a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f12069b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f12070d) ^ this.f12069b.hashCode();
        Type type = this.f12068a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f12070d;
        int length = typeArr.length;
        Type type = this.f12069b;
        if (length == 0) {
            return d.h(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.h(type));
        sb.append("<");
        sb.append(d.h(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb.append(", ");
            sb.append(d.h(typeArr[i10]));
        }
        sb.append(">");
        return sb.toString();
    }
}
