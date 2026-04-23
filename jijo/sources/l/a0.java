package l;

import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mmkv.MMKV;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.widgets.SystemNative;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a0 {
    public static /* synthetic */ byte a(int i10) {
        switch (i10) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 7;
            case 9:
                return (byte) 8;
            default:
                throw null;
        }
    }

    public static /* synthetic */ boolean b(int i10) {
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ boolean c(int i10) {
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            return true;
        }
        throw null;
    }

    public static int d(team.dev.epro.apkcustom.models.config.d dVar, int i10, int i11) {
        return Integer.parseInt(SystemNative.abc(dVar.d(), i10, i11));
    }

    public static String e(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.y());
        return sb.toString();
    }

    public static String f(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String g(String str, long j10) {
        return str + j10;
    }

    public static String h(StringBuilder sb, int i10, String str) {
        sb.append(i10);
        sb.append(str);
        return sb.toString();
    }

    public static String i(StringBuilder sb, List list, char c10) {
        sb.append(list);
        sb.append(c10);
        return sb.toString();
    }

    public static /* synthetic */ String j(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ",");
            }
        }
        return sb.toString();
    }

    public static StringBuilder k(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder l(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void m(Intent intent, String str, Intent intent2) {
        intent.setAction(str);
        b4.f.Q(App.b(), intent2);
    }

    public static void n(CheckBox checkBox, SharedPreferences.Editor editor, String str) {
        editor.putBoolean(str, checkBox.isChecked()).commit();
    }

    public static void o(MMKV mmkv, String str, boolean z9) {
        mmkv.edit().putBoolean(str, z9).commit();
    }

    public static /* synthetic */ void p(String str) {
        if (str != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void q(t3.b bVar) {
        if (bVar != null) {
            throw new ClassCastException();
        }
    }

    public static void r(team.dev.epro.apkcustom.widgets.j jVar, StringBuilder sb, String str) {
        sb.append(jVar.E());
        sb.append(str);
    }

    public static void s(team.dev.epro.apkcustom.widgets.j jVar, StringBuilder sb, String str) {
        sb.append(jVar.F());
        sb.append(str);
    }

    public static /* synthetic */ String t(int i10) {
        switch (i10) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String u(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String v(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "v6v4" : "v4v6" : "v6only" : "v4only";
    }

    public static /* synthetic */ String w(int i10) {
        switch (i10) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case 4:
                return "LEFT";
            case 5:
                return "RIGHT";
            case 6:
                return "TOP";
            case 7:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }
}
