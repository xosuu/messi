package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f12188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f12189b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12190d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f12191f;

    public i(k kVar) {
        this.f12191f = kVar;
        this.f12188a = kVar.f12207q.f12195f;
        this.f12190d = kVar.f12206h;
    }

    public final j a() {
        j jVar = this.f12188a;
        k kVar = this.f12191f;
        if (jVar == kVar.f12207q) {
            throw new NoSuchElementException();
        }
        if (kVar.f12206h != this.f12190d) {
            throw new ConcurrentModificationException();
        }
        this.f12188a = jVar.f12195f;
        this.f12189b = jVar;
        return jVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12188a != this.f12191f.f12207q;
    }

    @Override // java.util.Iterator
    public final void remove() {
        j jVar = this.f12189b;
        if (jVar == null) {
            throw new IllegalStateException();
        }
        k kVar = this.f12191f;
        kVar.c(jVar, true);
        this.f12189b = null;
        this.f12190d = kVar.f12206h;
    }
}
