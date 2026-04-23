package j6;

import android.content.ContextWrapper;
import android.os.ParcelFileDescriptor;
import de.blinkt.openvpn.core.LogItem;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class s extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f14413b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14414d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14415f;

    public /* synthetic */ s(ContextWrapper contextWrapper, Serializable serializable, Object obj, int i10) {
        this.f14412a = i10;
        this.f14415f = contextWrapper;
        this.f14413b = serializable;
        this.f14414d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0411, code lost:
    
        r2 = r2.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0413, code lost:
    
        if (r2 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0415, code lost:
    
        r2.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0418, code lost:
    
        r2 = r10[0];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018f  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.s.run():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(t tVar, ParcelFileDescriptor[] parcelFileDescriptorArr, LogItem[] logItemArr) {
        super("pushLogs");
        this.f14412a = 0;
        this.f14415f = tVar;
        this.f14413b = parcelFileDescriptorArr;
        this.f14414d = logItemArr;
    }
}
