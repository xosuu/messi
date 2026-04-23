package m7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15796c;

    public f(ArrayList arrayList) {
        this.f15794a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = g7.b.f13889b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f15795b = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        List list = this.f15794a;
        if (zEquals && objArr.length == 0) {
            return list;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list2 = (List) obj2;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (list.contains(list2.get(i10))) {
                        String str = (String) list2.get(i10);
                        this.f15796c = str;
                        return str;
                    }
                }
                String str2 = (String) list.get(0);
                this.f15796c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f15796c = (String) objArr[0];
        return null;
    }
}
