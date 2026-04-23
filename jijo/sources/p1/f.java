package p1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f16225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f16226d;

    public f(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.f16223a = str;
        this.f16224b = Collections.unmodifiableMap(map);
        this.f16225c = Collections.unmodifiableSet(hashSet);
        this.f16226d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static f a(s1.b bVar, String str) {
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        Cursor cursorU = bVar.u("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorU.getColumnCount() > 0) {
                int columnIndex = cursorU.getColumnIndex("name");
                int columnIndex2 = cursorU.getColumnIndex("type");
                int columnIndex3 = cursorU.getColumnIndex("notnull");
                int columnIndex4 = cursorU.getColumnIndex("pk");
                int columnIndex5 = cursorU.getColumnIndex("dflt_value");
                while (cursorU.moveToNext()) {
                    String string = cursorU.getString(columnIndex);
                    map.put(string, new b(cursorU.getInt(columnIndex4), 2, string, cursorU.getString(columnIndex2), cursorU.getString(columnIndex5), cursorU.getInt(columnIndex3) != 0));
                }
            }
            cursorU.close();
            HashSet hashSet = new HashSet();
            cursorU = bVar.u("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorU.getColumnIndex("id");
                int columnIndex7 = cursorU.getColumnIndex("seq");
                int columnIndex8 = cursorU.getColumnIndex("table");
                int columnIndex9 = cursorU.getColumnIndex("on_delete");
                int columnIndex10 = cursorU.getColumnIndex("on_update");
                ArrayList<d> arrayListB = b(cursorU);
                int count = cursorU.getCount();
                int i13 = 0;
                while (i13 < count) {
                    cursorU.moveToPosition(i13);
                    if (cursorU.getInt(columnIndex7) != 0) {
                        i10 = columnIndex6;
                        i11 = columnIndex7;
                        arrayList = arrayListB;
                        i12 = count;
                    } else {
                        int i14 = cursorU.getInt(columnIndex6);
                        i10 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i11 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        for (d dVar : arrayListB) {
                            ArrayList arrayList4 = arrayListB;
                            int i15 = count;
                            if (dVar.f16216a == i14) {
                                arrayList2.add(dVar.f16218d);
                                arrayList3.add(dVar.f16219f);
                            }
                            arrayListB = arrayList4;
                            count = i15;
                        }
                        arrayList = arrayListB;
                        i12 = count;
                        hashSet.add(new c(cursorU.getString(columnIndex8), cursorU.getString(columnIndex9), cursorU.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i13++;
                    columnIndex6 = i10;
                    columnIndex7 = i11;
                    arrayListB = arrayList;
                    count = i12;
                }
                cursorU.close();
                cursorU = bVar.u("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorU.getColumnIndex("name");
                    int columnIndex12 = cursorU.getColumnIndex("origin");
                    int columnIndex13 = cursorU.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (cursorU.moveToNext()) {
                        if ("c".equals(cursorU.getString(columnIndex12))) {
                            e eVarC = c(bVar, cursorU.getString(columnIndex11), cursorU.getInt(columnIndex13) == 1);
                            if (eVarC == null) {
                                break;
                            }
                            hashSet3.add(eVarC);
                        }
                    }
                    cursorU.close();
                    hashSet2 = hashSet3;
                    return new f(str, map, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new d(cursor.getString(columnIndex3), cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static e c(s1.b bVar, String str, boolean z9) {
        Cursor cursorU = bVar.u("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorU.getColumnIndex("seqno");
            int columnIndex2 = cursorU.getColumnIndex("cid");
            int columnIndex3 = cursorU.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorU.moveToNext()) {
                    if (cursorU.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorU.getInt(columnIndex)), cursorU.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                e eVar = new e(str, arrayList, z9);
                cursorU.close();
                return eVar;
            }
            cursorU.close();
            return null;
        } catch (Throwable th) {
            cursorU.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = fVar.f16223a;
        String str2 = this.f16223a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = fVar.f16224b;
        Map map2 = this.f16224b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = fVar.f16225c;
        Set set3 = this.f16225c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f16226d;
        if (set4 == null || (set = fVar.f16226d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f16223a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f16224b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f16225c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f16223a + "', columns=" + this.f16224b + ", foreignKeys=" + this.f16225c + ", indices=" + this.f16226d + '}';
    }
}
