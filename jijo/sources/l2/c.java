package l2;

import android.database.Cursor;
import java.util.ArrayList;
import n1.p;
import n1.q;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f15128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15129b;

    public c(p pVar, int i10) {
        if (i10 == 1) {
            this.f15128a = pVar;
            this.f15129b = new b(this, pVar, 1);
        } else if (i10 == 2) {
            this.f15128a = pVar;
            this.f15129b = new b(this, pVar, 3);
        } else if (i10 != 3) {
            this.f15128a = pVar;
            this.f15129b = new b(this, pVar, 0);
        } else {
            this.f15128a = pVar;
            this.f15129b = new b(this, pVar, 6);
        }
    }

    public final ArrayList a(String str) {
        q qVarA = q.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            qVarA.A(1);
        } else {
            qVarA.D(1, str);
        }
        p pVar = this.f15128a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            qVarA.E();
        }
    }

    public final Long b(String str) {
        q qVarA = q.a(1, "SELECT long_value FROM Preference where `key`=?");
        qVarA.D(1, str);
        p pVar = this.f15128a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            qVarA.E();
        }
    }

    public final ArrayList c(String str) {
        q qVarA = q.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            qVarA.A(1);
        } else {
            qVarA.D(1, str);
        }
        p pVar = this.f15128a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            qVarA.E();
        }
    }

    public final boolean d(String str) {
        q qVarA = q.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            qVarA.A(1);
        } else {
            qVarA.D(1, str);
        }
        p pVar = this.f15128a;
        pVar.b();
        Cursor cursorG = pVar.g(qVarA);
        try {
            boolean z9 = false;
            if (cursorG.moveToFirst()) {
                z9 = cursorG.getInt(0) != 0;
            }
            return z9;
        } finally {
            cursorG.close();
            qVarA.E();
        }
    }

    public final void e(d dVar) {
        p pVar = this.f15128a;
        pVar.b();
        pVar.c();
        try {
            this.f15129b.e(dVar);
            pVar.h();
        } finally {
            pVar.f();
        }
    }
}
