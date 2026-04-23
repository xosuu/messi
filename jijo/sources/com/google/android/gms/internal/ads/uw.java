package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class uw extends rt0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public long D;
    public n5.a E;
    public final AtomicLong F;
    public final i10 G;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f9627h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hw0 f9628q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f9629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f9631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InputStream f9632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Uri f9634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile zzbah f9635y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9636z;

    public uw(Context context, hw0 hw0Var, String str, int i10, yw ywVar, i10 i10Var) {
        super(false);
        this.f9627h = context;
        this.f9628q = hw0Var;
        this.G = i10Var;
        this.f9629s = str;
        this.f9630t = i10;
        this.f9636z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = 0L;
        this.F = new AtomicLong(-1L);
        this.E = null;
        this.f9631u = ((Boolean) zzba.zzc().a(eg.G1)).booleanValue();
        a(ywVar);
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) throws IOException {
        if (!this.f9633w) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f9632v;
        int iB = inputStream != null ? inputStream.read(bArr, i10, i11) : this.f9628q.b(i10, bArr, i11);
        if (!this.f9631u || this.f9632v != null) {
            c(iB);
        }
        return iB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.iv] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) throws Throwable {
        zzbae zzbaeVarA;
        Long l9;
        boolean z9;
        boolean z10;
        long jElapsedRealtime;
        id idVar;
        String string = "ms";
        if (this.f9633w) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r22 = 1;
        this.f9633w = true;
        this.f9634x = iz0Var.f5730a;
        if (!this.f9631u) {
            n(iz0Var);
        }
        this.f9635y = zzbah.b(iz0Var.f5730a);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.Q3)).booleanValue();
        ?? sb = -1;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (!zBooleanValue) {
            if (this.f9635y != null) {
                this.f9635y.f11473t = iz0Var.f5732c;
                zzbah zzbahVar = this.f9635y;
                String str2 = this.f9629s;
                if (str2 != null) {
                    str = str2;
                }
                zzbahVar.f11474u = str;
                this.f9635y.f11475v = this.f9630t;
                zzbaeVarA = zzu.zzc().a(this.f9635y);
            } else {
                zzbaeVarA = null;
            }
            if (zzbaeVarA != null && zzbaeVarA.e()) {
                this.f9636z = zzbaeVarA.d();
                this.B = zzbaeVarA.g();
                this.C = zzbaeVarA.f();
                this.D = zzbaeVarA.b();
                this.A = true;
                if (!p()) {
                    this.f9632v = zzbaeVarA.c();
                    if (this.f9631u) {
                        n(iz0Var);
                    }
                    return -1L;
                }
            }
        } else if (this.f9635y != null) {
            this.f9635y.f11473t = iz0Var.f5732c;
            zzbah zzbahVar2 = this.f9635y;
            String str3 = this.f9629s;
            if (str3 != null) {
                str = str3;
            }
            zzbahVar2.f11474u = str;
            this.f9635y.f11475v = this.f9630t;
            if (this.f9635y.f11472s) {
                l9 = (Long) zzba.zzc().a(eg.S3);
            } else {
                l9 = (Long) zzba.zzc().a(eg.R3);
            }
            long jLongValue = l9.longValue();
            ((y3.b) zzu.zzB()).getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            zzu.zzd();
            ed edVarA = hd.a(this.f9627h, this.f9635y);
            try {
                try {
                    idVar = (id) edVarA.f8276a.get(jLongValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    r22 = sb;
                }
                try {
                    this.f9636z = idVar.f5564b;
                    this.B = idVar.f5565c;
                    this.C = idVar.f5567e;
                    this.D = idVar.f5566d;
                    if (!p()) {
                        this.f9632v = idVar.f5563a;
                        if (this.f9631u) {
                            n(iz0Var);
                        }
                        ((y3.b) zzu.zzB()).getClass();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        iv ivVar = ((yw) this.G.f5456b).f11061v;
                        if (ivVar != null) {
                            ivVar.f(jElapsedRealtime3, true);
                        }
                        this.A = true;
                        zze.zza("Cache connection took " + jElapsedRealtime3 + "ms");
                        return -1L;
                    }
                    ((y3.b) zzu.zzB()).getClass();
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    iv ivVar2 = ((yw) this.G.f5456b).f11061v;
                    if (ivVar2 != null) {
                        ivVar2.f(jElapsedRealtime4, true);
                    }
                    this.A = true;
                    string = "Cache connection took " + jElapsedRealtime4 + "ms";
                } catch (InterruptedException unused) {
                    z10 = true;
                    edVarA.cancel(true);
                    Thread.currentThread().interrupt();
                    ((y3.b) zzu.zzB()).getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    iv ivVar3 = ((yw) this.G.f5456b).f11061v;
                    if (ivVar3 != null) {
                        ivVar3.f(jElapsedRealtime, z10);
                    }
                    this.A = z10;
                    sb = new StringBuilder("Cache connection took ");
                    sb.append(jElapsedRealtime);
                    sb.append("ms");
                    string = sb.toString();
                } catch (ExecutionException | TimeoutException unused2) {
                    z9 = true;
                    edVarA.cancel(true);
                    ((y3.b) zzu.zzB()).getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    iv ivVar4 = ((yw) this.G.f5456b).f11061v;
                    if (ivVar4 != null) {
                        ivVar4.f(jElapsedRealtime, z9);
                    }
                    this.A = z9;
                    sb = new StringBuilder("Cache connection took ");
                    sb.append(jElapsedRealtime);
                    sb.append("ms");
                    string = sb.toString();
                } catch (Throwable th2) {
                    th = th2;
                    ((y3.b) zzu.zzB()).getClass();
                    long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    ?? r52 = ((yw) this.G.f5456b).f11061v;
                    if (r52 != 0) {
                        r52.f(jElapsedRealtime5, r22);
                    }
                    this.A = r22;
                    zze.zza("Cache connection took " + jElapsedRealtime5 + string);
                    throw th;
                }
            } catch (InterruptedException unused3) {
                z10 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                r22 = 0;
            }
            zze.zza(string);
        }
        this.A = false;
        if (this.f9635y != null) {
            Map map = iz0Var.f5731b;
            long j10 = iz0Var.f5732c;
            long j11 = iz0Var.f5733d;
            int i10 = iz0Var.f5734e;
            Uri uri = Uri.parse(this.f9635y.f11466a);
            if (uri == null) {
                throw new IllegalStateException("The uri must be set.");
            }
            iz0Var = new iz0(uri, map, j10, j11, i10);
        }
        return this.f9628q.g(iz0Var);
    }

    public final long o() {
        if (this.f9635y != null) {
            if (this.F.get() != -1) {
                return this.F.get();
            }
            synchronized (this) {
                try {
                    if (this.E == null) {
                        this.E = nu.f7383a.b(new du(2, this));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.E.isDone()) {
                try {
                    this.F.compareAndSet(-1L, ((Long) this.E.get()).longValue());
                    return this.F.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final boolean p() {
        if (!this.f9631u) {
            return false;
        }
        if (!((Boolean) zzba.zzc().a(eg.T3)).booleanValue() || this.B) {
            return ((Boolean) zzba.zzc().a(eg.U3)).booleanValue() && !this.C;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        return this.f9634x;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() throws IOException {
        if (!this.f9633w) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f9633w = false;
        this.f9634x = null;
        boolean z9 = (this.f9631u && this.f9632v == null) ? false : true;
        InputStream inputStream = this.f9632v;
        if (inputStream != null) {
            y3.c.b(inputStream);
            this.f9632v = null;
        } else {
            this.f9628q.zzd();
        }
        if (z9) {
            i();
        }
    }
}
