package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.sf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.joda.time.DateTimeConstants;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f20625d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f20626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f20627f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20628a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20629b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20630c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20626e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f20627f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Object obj = null;
            try {
                iIntValue = p.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f424y) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f424y.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static h d(Context context, AttributeSet attributeSet, boolean z9) {
        h hVar = new h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z9 ? q.f20634c : q.f20632a);
        int[] iArr = f20625d;
        SparseIntArray sparseIntArray = f20626e;
        String[] strArr = v.a.f17670a;
        k kVar = hVar.f20550b;
        l lVar = hVar.f20553e;
        j jVar = hVar.f20551c;
        i iVar = hVar.f20552d;
        int i10 = 3;
        if (z9) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            g gVar = new g();
            gVar.f20537a = new int[10];
            gVar.f20538b = new int[10];
            gVar.f20539c = 0;
            gVar.f20540d = new int[10];
            gVar.f20541e = new float[10];
            gVar.f20542f = 0;
            gVar.f20543g = new int[5];
            gVar.f20544h = new String[5];
            gVar.f20545i = 0;
            gVar.f20546j = new int[4];
            gVar.f20547k = new boolean[4];
            gVar.f20548l = 0;
            jVar.getClass();
            iVar.getClass();
            kVar.getClass();
            lVar.getClass();
            int i11 = 0;
            while (i11 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                switch (f20627f.get(index)) {
                    case 2:
                        gVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.I));
                        continue;
                        i11++;
                        i10 = 3;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case NotificationCompat.FLAG_NO_CLEAR /* 32 */:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 5:
                        gVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i11++;
                        i10 = 3;
                        break;
                    case 6:
                        gVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.C));
                        break;
                    case 7:
                        gVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.D));
                        break;
                    case 8:
                        gVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.J));
                        break;
                    case 11:
                        gVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.P));
                        break;
                    case 12:
                        gVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.Q));
                        break;
                    case 13:
                        gVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.M));
                        break;
                    case 14:
                        gVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.O));
                        break;
                    case 15:
                        gVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.R));
                        break;
                    case 16:
                        gVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.N));
                        break;
                    case 17:
                        gVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f20562d));
                        break;
                    case 18:
                        gVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f20564e));
                        break;
                    case 19:
                        gVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, iVar.f20566f));
                        break;
                    case 20:
                        gVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, iVar.f20593w));
                        break;
                    case sf.zzm /* 21 */:
                        gVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, iVar.f20560c));
                        break;
                    case 22:
                        gVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, kVar.f20607a)]);
                        break;
                    case 23:
                        gVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, iVar.f20558b));
                        break;
                    case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                        gVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.F));
                        break;
                    case 27:
                        gVar.b(27, typedArrayObtainStyledAttributes.getInt(index, iVar.E));
                        break;
                    case 28:
                        gVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.G));
                        break;
                    case 31:
                        gVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.K));
                        break;
                    case 34:
                        gVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.H));
                        break;
                    case 37:
                        gVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, iVar.f20594x));
                        break;
                    case 38:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, hVar.f20549a);
                        hVar.f20549a = resourceId;
                        gVar.b(38, resourceId);
                        break;
                    case 39:
                        gVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, iVar.U));
                        break;
                    case 40:
                        gVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, iVar.T));
                        break;
                    case 41:
                        gVar.b(41, typedArrayObtainStyledAttributes.getInt(index, iVar.V));
                        break;
                    case 42:
                        gVar.b(42, typedArrayObtainStyledAttributes.getInt(index, iVar.W));
                        break;
                    case 43:
                        gVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, kVar.f20609c));
                        break;
                    case 44:
                        gVar.d(44, true);
                        gVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, lVar.f20624m));
                        break;
                    case 45:
                        gVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, lVar.f20613b));
                        break;
                    case 46:
                        gVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, lVar.f20614c));
                        break;
                    case 47:
                        gVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, lVar.f20615d));
                        break;
                    case 48:
                        gVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, lVar.f20616e));
                        break;
                    case 49:
                        gVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, lVar.f20617f));
                        break;
                    case 50:
                        gVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, lVar.f20618g));
                        break;
                    case 51:
                        gVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, lVar.f20620i));
                        break;
                    case 52:
                        gVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, lVar.f20621j));
                        break;
                    case 53:
                        gVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, lVar.f20622k));
                        break;
                    case 54:
                        gVar.b(54, typedArrayObtainStyledAttributes.getInt(index, iVar.X));
                        break;
                    case 55:
                        gVar.b(55, typedArrayObtainStyledAttributes.getInt(index, iVar.Y));
                        break;
                    case 56:
                        gVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.Z));
                        break;
                    case 57:
                        gVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f20557a0));
                        break;
                    case 58:
                        gVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f20559b0));
                        break;
                    case 59:
                        gVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f20561c0));
                        break;
                    case 60:
                        gVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, lVar.f20612a));
                        break;
                    case 62:
                        gVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.A));
                        break;
                    case 63:
                        gVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, iVar.B));
                        break;
                    case NotificationCompat.FLAG_FOREGROUND_SERVICE /* 64 */:
                        gVar.b(64, f(typedArrayObtainStyledAttributes, index, jVar.f20598a));
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            gVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            gVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        gVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        gVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, jVar.f20602e));
                        break;
                    case 68:
                        gVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, kVar.f20610d));
                        break;
                    case 69:
                        gVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        gVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        break;
                    case 72:
                        gVar.b(72, typedArrayObtainStyledAttributes.getInt(index, iVar.f20567f0));
                        break;
                    case 73:
                        gVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f20569g0));
                        break;
                    case 74:
                        gVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        gVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f20583n0));
                        break;
                    case 76:
                        gVar.b(76, typedArrayObtainStyledAttributes.getInt(index, jVar.f20600c));
                        break;
                    case 77:
                        gVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        gVar.b(78, typedArrayObtainStyledAttributes.getInt(index, kVar.f20608b));
                        break;
                    case 79:
                        gVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, jVar.f20601d));
                        break;
                    case 80:
                        gVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f20579l0));
                        break;
                    case 81:
                        gVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f20581m0));
                        break;
                    case 82:
                        gVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, jVar.f20599b));
                        break;
                    case 83:
                        gVar.b(83, f(typedArrayObtainStyledAttributes, index, lVar.f20619h));
                        break;
                    case 84:
                        gVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, jVar.f20604g));
                        break;
                    case 85:
                        gVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, jVar.f20603f));
                        break;
                    case 86:
                        int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            jVar.f20606i = resourceId2;
                            gVar.b(89, resourceId2);
                            if (jVar.f20606i != -1) {
                                gVar.b(88, -2);
                            }
                        } else if (i12 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            jVar.f20605h = string;
                            gVar.c(90, string);
                            if (jVar.f20605h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                jVar.f20606i = resourceId3;
                                gVar.b(89, resourceId3);
                                gVar.b(88, -2);
                            } else {
                                gVar.b(88, -1);
                            }
                        } else {
                            gVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, jVar.f20606i));
                        }
                        break;
                    case 87:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 93:
                        gVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.L));
                        break;
                    case 94:
                        gVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.S));
                        break;
                    case 95:
                        g(gVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        g(gVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        gVar.b(97, typedArrayObtainStyledAttributes.getInt(index, iVar.f20585o0));
                        break;
                    case 98:
                        int i13 = y.a.E;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == i10) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            hVar.f20549a = typedArrayObtainStyledAttributes.getResourceId(index, hVar.f20549a);
                        }
                        break;
                    case 99:
                        gVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f20568g));
                        break;
                }
                i11++;
                i10 = 3;
            }
        } else {
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount2; i14++) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    jVar.getClass();
                    iVar.getClass();
                    kVar.getClass();
                    lVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        iVar.f20586p = f(typedArrayObtainStyledAttributes, index2, iVar.f20586p);
                        break;
                    case 2:
                        iVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.I);
                        break;
                    case 3:
                        iVar.f20584o = f(typedArrayObtainStyledAttributes, index2, iVar.f20584o);
                        break;
                    case 4:
                        iVar.f20582n = f(typedArrayObtainStyledAttributes, index2, iVar.f20582n);
                        break;
                    case 5:
                        iVar.f20595y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        iVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.C);
                        break;
                    case 7:
                        iVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.D);
                        break;
                    case 8:
                        iVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.J);
                        break;
                    case 9:
                        iVar.f20592v = f(typedArrayObtainStyledAttributes, index2, iVar.f20592v);
                        break;
                    case 10:
                        iVar.f20591u = f(typedArrayObtainStyledAttributes, index2, iVar.f20591u);
                        break;
                    case 11:
                        iVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.P);
                        break;
                    case 12:
                        iVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.Q);
                        break;
                    case 13:
                        iVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.M);
                        break;
                    case 14:
                        iVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.O);
                        break;
                    case 15:
                        iVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.R);
                        break;
                    case 16:
                        iVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.N);
                        break;
                    case 17:
                        iVar.f20562d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.f20562d);
                        break;
                    case 18:
                        iVar.f20564e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.f20564e);
                        break;
                    case 19:
                        iVar.f20566f = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f20566f);
                        break;
                    case 20:
                        iVar.f20593w = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f20593w);
                        break;
                    case sf.zzm /* 21 */:
                        iVar.f20560c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, iVar.f20560c);
                        break;
                    case 22:
                        kVar.f20607a = iArr[typedArrayObtainStyledAttributes.getInt(index2, kVar.f20607a)];
                        break;
                    case 23:
                        iVar.f20558b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, iVar.f20558b);
                        break;
                    case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                        iVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.F);
                        break;
                    case 25:
                        iVar.f20570h = f(typedArrayObtainStyledAttributes, index2, iVar.f20570h);
                        break;
                    case 26:
                        iVar.f20572i = f(typedArrayObtainStyledAttributes, index2, iVar.f20572i);
                        break;
                    case 27:
                        iVar.E = typedArrayObtainStyledAttributes.getInt(index2, iVar.E);
                        break;
                    case 28:
                        iVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.G);
                        break;
                    case 29:
                        iVar.f20574j = f(typedArrayObtainStyledAttributes, index2, iVar.f20574j);
                        break;
                    case 30:
                        iVar.f20576k = f(typedArrayObtainStyledAttributes, index2, iVar.f20576k);
                        break;
                    case 31:
                        iVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.K);
                        break;
                    case NotificationCompat.FLAG_NO_CLEAR /* 32 */:
                        iVar.f20589s = f(typedArrayObtainStyledAttributes, index2, iVar.f20589s);
                        break;
                    case 33:
                        iVar.f20590t = f(typedArrayObtainStyledAttributes, index2, iVar.f20590t);
                        break;
                    case 34:
                        iVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.H);
                        break;
                    case 35:
                        iVar.f20580m = f(typedArrayObtainStyledAttributes, index2, iVar.f20580m);
                        break;
                    case 36:
                        iVar.f20578l = f(typedArrayObtainStyledAttributes, index2, iVar.f20578l);
                        break;
                    case 37:
                        iVar.f20594x = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f20594x);
                        break;
                    case 38:
                        hVar.f20549a = typedArrayObtainStyledAttributes.getResourceId(index2, hVar.f20549a);
                        break;
                    case 39:
                        iVar.U = typedArrayObtainStyledAttributes.getFloat(index2, iVar.U);
                        break;
                    case 40:
                        iVar.T = typedArrayObtainStyledAttributes.getFloat(index2, iVar.T);
                        break;
                    case 41:
                        iVar.V = typedArrayObtainStyledAttributes.getInt(index2, iVar.V);
                        break;
                    case 42:
                        iVar.W = typedArrayObtainStyledAttributes.getInt(index2, iVar.W);
                        break;
                    case 43:
                        kVar.f20609c = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f20609c);
                        break;
                    case 44:
                        lVar.f20623l = true;
                        lVar.f20624m = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f20624m);
                        break;
                    case 45:
                        lVar.f20613b = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f20613b);
                        break;
                    case 46:
                        lVar.f20614c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f20614c);
                        break;
                    case 47:
                        lVar.f20615d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f20615d);
                        break;
                    case 48:
                        lVar.f20616e = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f20616e);
                        break;
                    case 49:
                        lVar.f20617f = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f20617f);
                        break;
                    case 50:
                        lVar.f20618g = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f20618g);
                        break;
                    case 51:
                        lVar.f20620i = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f20620i);
                        break;
                    case 52:
                        lVar.f20621j = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f20621j);
                        break;
                    case 53:
                        lVar.f20622k = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f20622k);
                        break;
                    case 54:
                        iVar.X = typedArrayObtainStyledAttributes.getInt(index2, iVar.X);
                        break;
                    case 55:
                        iVar.Y = typedArrayObtainStyledAttributes.getInt(index2, iVar.Y);
                        break;
                    case 56:
                        iVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.Z);
                        break;
                    case 57:
                        iVar.f20557a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f20557a0);
                        break;
                    case 58:
                        iVar.f20559b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f20559b0);
                        break;
                    case 59:
                        iVar.f20561c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f20561c0);
                        break;
                    case 60:
                        lVar.f20612a = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f20612a);
                        break;
                    case 61:
                        iVar.f20596z = f(typedArrayObtainStyledAttributes, index2, iVar.f20596z);
                        break;
                    case 62:
                        iVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.A);
                        break;
                    case 63:
                        iVar.B = typedArrayObtainStyledAttributes.getFloat(index2, iVar.B);
                        break;
                    case NotificationCompat.FLAG_FOREGROUND_SERVICE /* 64 */:
                        jVar.f20598a = f(typedArrayObtainStyledAttributes, index2, jVar.f20598a);
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            jVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            jVar.getClass();
                        }
                        break;
                    case 66:
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        jVar.getClass();
                        break;
                    case 67:
                        jVar.f20602e = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f20602e);
                        break;
                    case 68:
                        kVar.f20610d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f20610d);
                        break;
                    case 69:
                        iVar.f20563d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        iVar.f20565e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        iVar.f20567f0 = typedArrayObtainStyledAttributes.getInt(index2, iVar.f20567f0);
                        break;
                    case 73:
                        iVar.f20569g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f20569g0);
                        break;
                    case 74:
                        iVar.f20575j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        iVar.f20583n0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f20583n0);
                        break;
                    case 76:
                        jVar.f20600c = typedArrayObtainStyledAttributes.getInt(index2, jVar.f20600c);
                        break;
                    case 77:
                        iVar.f20577k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        kVar.f20608b = typedArrayObtainStyledAttributes.getInt(index2, kVar.f20608b);
                        break;
                    case 79:
                        jVar.f20601d = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f20601d);
                        break;
                    case 80:
                        iVar.f20579l0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f20579l0);
                        break;
                    case 81:
                        iVar.f20581m0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f20581m0);
                        break;
                    case 82:
                        jVar.f20599b = typedArrayObtainStyledAttributes.getInteger(index2, jVar.f20599b);
                        break;
                    case 83:
                        lVar.f20619h = f(typedArrayObtainStyledAttributes, index2, lVar.f20619h);
                        break;
                    case 84:
                        jVar.f20604g = typedArrayObtainStyledAttributes.getInteger(index2, jVar.f20604g);
                        break;
                    case 85:
                        jVar.f20603f = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f20603f);
                        break;
                    case 86:
                        int i15 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i15 == 1) {
                            jVar.f20606i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i15 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            jVar.f20605h = string2;
                            if (string2.indexOf("/") > 0) {
                                jVar.f20606i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, jVar.f20606i);
                        }
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 91:
                        iVar.f20587q = f(typedArrayObtainStyledAttributes, index2, iVar.f20587q);
                        break;
                    case 92:
                        iVar.f20588r = f(typedArrayObtainStyledAttributes, index2, iVar.f20588r);
                        break;
                    case 93:
                        iVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.L);
                        break;
                    case 94:
                        iVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.S);
                        break;
                    case 95:
                        g(iVar, typedArrayObtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        g(iVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        iVar.f20585o0 = typedArrayObtainStyledAttributes.getInt(index2, iVar.f20585o0);
                        break;
                }
            }
            if (iVar.f20575j0 != null) {
                iVar.f20573i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return hVar;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(d dVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i10 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i10 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        dVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f20630c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (this.f20629b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    h hVar = (h) map.get(Integer.valueOf(id));
                    if (hVar != null) {
                        if (childAt instanceof Barrier) {
                            i iVar = hVar.f20552d;
                            iVar.f20571h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(iVar.f20567f0);
                            barrier.setMargin(iVar.f20569g0);
                            barrier.setAllowsGoneWidget(iVar.f20583n0);
                            int[] iArr = iVar.f20573i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = iVar.f20575j0;
                                if (str != null) {
                                    int[] iArrC = c(barrier, str);
                                    iVar.f20573i0 = iArrC;
                                    barrier.setReferencedIds(iArrC);
                                }
                            }
                        }
                        d dVar = (d) childAt.getLayoutParams();
                        dVar.a();
                        hVar.a(dVar);
                        HashMap map2 = hVar.f20554f;
                        Class<?> cls = childAt.getClass();
                        for (String strQ : map2.keySet()) {
                            a aVar = (a) map2.get(strQ);
                            if (!aVar.f20469a) {
                                strQ = g1.a.q("set", strQ);
                            }
                            try {
                                try {
                                    switch (u.h.b(aVar.f20470b)) {
                                        case 0:
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                                cls.getMethod(strQ, clsArr).invoke(childAt, Integer.valueOf(aVar.f20471c));
                                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                e.getMessage();
                                            }
                                            break;
                                        case 1:
                                            cls.getMethod(strQ, Float.TYPE).invoke(childAt, Float.valueOf(aVar.f20472d));
                                            break;
                                        case 2:
                                            cls.getMethod(strQ, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar.f20475g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strQ, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(aVar.f20475g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            cls.getMethod(strQ, CharSequence.class).invoke(childAt, aVar.f20473e);
                                            break;
                                        case 5:
                                            cls.getMethod(strQ, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f20474f));
                                            break;
                                        case 6:
                                            cls.getMethod(strQ, Float.TYPE).invoke(childAt, Float.valueOf(aVar.f20472d));
                                            break;
                                        case 7:
                                            try {
                                                cls.getMethod(strQ, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar.f20471c));
                                                break;
                                            } catch (IllegalAccessException | InvocationTargetException unused3) {
                                            }
                                            break;
                                    }
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                }
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                            }
                        }
                        childAt.setLayoutParams(dVar);
                        k kVar = hVar.f20550b;
                        if (kVar.f20608b == 0) {
                            childAt.setVisibility(kVar.f20607a);
                        }
                        childAt.setAlpha(kVar.f20609c);
                        l lVar = hVar.f20553e;
                        childAt.setRotation(lVar.f20612a);
                        childAt.setRotationX(lVar.f20613b);
                        childAt.setRotationY(lVar.f20614c);
                        childAt.setScaleX(lVar.f20615d);
                        childAt.setScaleY(lVar.f20616e);
                        if (lVar.f20619h != -1) {
                            if (((View) childAt.getParent()).findViewById(lVar.f20619h) != null) {
                                float bottom = (r6.getBottom() + r6.getTop()) / 2.0f;
                                float right = (r6.getRight() + r6.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(lVar.f20617f)) {
                                childAt.setPivotX(lVar.f20617f);
                            }
                            if (!Float.isNaN(lVar.f20618g)) {
                                childAt.setPivotY(lVar.f20618g);
                            }
                        }
                        childAt.setTranslationX(lVar.f20620i);
                        childAt.setTranslationY(lVar.f20621j);
                        childAt.setTranslationZ(lVar.f20622k);
                        if (lVar.f20623l) {
                            childAt.setElevation(lVar.f20624m);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            h hVar2 = (h) map.get(num);
            if (hVar2 != null) {
                i iVar2 = hVar2.f20552d;
                if (iVar2.f20571h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = iVar2.f20573i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = iVar2.f20575j0;
                        if (str2 != null) {
                            int[] iArrC2 = c(barrier2, str2);
                            iVar2.f20573i0 = iArrC2;
                            barrier2.setReferencedIds(iArrC2);
                        }
                    }
                    barrier2.setType(iVar2.f20567f0);
                    barrier2.setMargin(iVar2.f20569g0);
                    d dVarG = ConstraintLayout.g();
                    barrier2.i();
                    hVar2.a(dVarG);
                    constraintLayout.addView(barrier2, dVarG);
                }
                if (iVar2.f20556a) {
                    View oVar = new o(constraintLayout.getContext());
                    oVar.setId(num.intValue());
                    d dVarG2 = ConstraintLayout.g();
                    hVar2.a(dVarG2);
                    constraintLayout.addView(oVar, dVarG2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof b) {
                ((b) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i10;
        int i11;
        m mVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = mVar.f20630c;
        map.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            d dVar = (d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (mVar.f20629b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new h());
            }
            h hVar = (h) map.get(Integer.valueOf(id));
            if (hVar == null) {
                i10 = childCount;
            } else {
                HashMap map2 = mVar.f20628a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    a aVar = (a) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            try {
                                map3.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                            i11 = childCount;
                        } else {
                            i11 = childCount;
                            try {
                                map3.put(str, new a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                            }
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                        i11 = childCount;
                    }
                    childCount = i11;
                }
                i10 = childCount;
                hVar.f20554f = map3;
                hVar.f20549a = id;
                int i13 = dVar.f20492e;
                i iVar = hVar.f20552d;
                iVar.f20570h = i13;
                iVar.f20572i = dVar.f20494f;
                iVar.f20574j = dVar.f20496g;
                iVar.f20576k = dVar.f20498h;
                iVar.f20578l = dVar.f20500i;
                iVar.f20580m = dVar.f20502j;
                iVar.f20582n = dVar.f20504k;
                iVar.f20584o = dVar.f20506l;
                iVar.f20586p = dVar.f20508m;
                iVar.f20587q = dVar.f20510n;
                iVar.f20588r = dVar.f20512o;
                iVar.f20589s = dVar.f20518s;
                iVar.f20590t = dVar.f20519t;
                iVar.f20591u = dVar.f20520u;
                iVar.f20592v = dVar.f20521v;
                iVar.f20593w = dVar.E;
                iVar.f20594x = dVar.F;
                iVar.f20595y = dVar.G;
                iVar.f20596z = dVar.f20514p;
                iVar.A = dVar.f20516q;
                iVar.B = dVar.f20517r;
                iVar.C = dVar.T;
                iVar.D = dVar.U;
                iVar.E = dVar.V;
                iVar.f20566f = dVar.f20488c;
                iVar.f20562d = dVar.f20484a;
                iVar.f20564e = dVar.f20486b;
                iVar.f20558b = ((ViewGroup.MarginLayoutParams) dVar).width;
                iVar.f20560c = ((ViewGroup.MarginLayoutParams) dVar).height;
                iVar.F = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                iVar.G = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                iVar.H = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                iVar.I = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                iVar.L = dVar.D;
                iVar.T = dVar.I;
                iVar.U = dVar.H;
                iVar.W = dVar.K;
                iVar.V = dVar.J;
                iVar.f20579l0 = dVar.W;
                iVar.f20581m0 = dVar.X;
                iVar.X = dVar.L;
                iVar.Y = dVar.M;
                iVar.Z = dVar.P;
                iVar.f20557a0 = dVar.Q;
                iVar.f20559b0 = dVar.N;
                iVar.f20561c0 = dVar.O;
                iVar.f20563d0 = dVar.R;
                iVar.f20565e0 = dVar.S;
                iVar.f20577k0 = dVar.Y;
                iVar.N = dVar.f20523x;
                iVar.P = dVar.f20525z;
                iVar.M = dVar.f20522w;
                iVar.O = dVar.f20524y;
                iVar.R = dVar.A;
                iVar.Q = dVar.B;
                iVar.S = dVar.C;
                iVar.f20585o0 = dVar.Z;
                iVar.J = dVar.getMarginEnd();
                iVar.K = dVar.getMarginStart();
                int visibility = childAt.getVisibility();
                k kVar = hVar.f20550b;
                kVar.f20607a = visibility;
                kVar.f20609c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                l lVar = hVar.f20553e;
                lVar.f20612a = rotation;
                lVar.f20613b = childAt.getRotationX();
                lVar.f20614c = childAt.getRotationY();
                lVar.f20615d = childAt.getScaleX();
                lVar.f20616e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    lVar.f20617f = pivotX;
                    lVar.f20618g = pivotY;
                }
                lVar.f20620i = childAt.getTranslationX();
                lVar.f20621j = childAt.getTranslationY();
                lVar.f20622k = childAt.getTranslationZ();
                if (lVar.f20623l) {
                    lVar.f20624m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    iVar.f20583n0 = barrier.getAllowsGoneWidget();
                    iVar.f20573i0 = barrier.getReferencedIds();
                    iVar.f20567f0 = barrier.getType();
                    iVar.f20569g0 = barrier.getMargin();
                }
            }
            i12++;
            mVar = this;
            childCount = i10;
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    h hVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        hVarD.f20552d.f20556a = true;
                    }
                    this.f20630c.put(Integer.valueOf(hVarD.f20549a), hVarD);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
