package androidx.activity.result;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f185d;

    public c(Object obj, Serializable serializable, i iVar, int i10) {
        this.f182a = i10;
        this.f185d = obj;
        this.f183b = serializable;
        this.f184c = iVar;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) throws Exception {
        int i10 = this.f182a;
        i iVar = this.f184c;
        Object obj2 = this.f185d;
        Serializable serializable = this.f183b;
        switch (i10) {
            case 0:
                f fVar = (f) obj2;
                String str = (String) serializable;
                Integer num = (Integer) fVar.f192c.get(str);
                if (num != null) {
                    fVar.f194e.add(str);
                    try {
                        ((f) obj2).b(num.intValue(), iVar, obj);
                        return;
                    } catch (Exception e10) {
                        fVar.f194e.remove(str);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + iVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            case 1:
                f fVar2 = (f) obj2;
                String str2 = (String) serializable;
                Integer num2 = (Integer) fVar2.f192c.get(str2);
                if (num2 != null) {
                    fVar2.f194e.add(str2);
                    try {
                        ((f) obj2).b(num2.intValue(), iVar, obj);
                        return;
                    } catch (Exception e11) {
                        fVar2.f194e.remove(str2);
                        throw e11;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + iVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                b bVar = (b) ((AtomicReference) serializable).get();
                if (bVar == null) {
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
                bVar.a(obj);
                return;
        }
    }

    @Override // androidx.activity.result.b
    public final void b() {
        int i10 = this.f182a;
        Object obj = this.f185d;
        Serializable serializable = this.f183b;
        switch (i10) {
            case 0:
                ((f) obj).f((String) serializable);
                break;
            case 1:
                ((f) obj).f((String) serializable);
                break;
            default:
                b bVar = (b) ((AtomicReference) serializable).getAndSet(null);
                if (bVar != null) {
                    bVar.b();
                }
                break;
        }
    }
}
