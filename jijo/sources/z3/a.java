package z3;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.PopupWindow;
import androidx.core.app.NotificationCompat;
import b7.u;
import c2.o;
import c2.w;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.ik0;
import com.google.android.gms.internal.ads.kc;
import com.google.android.gms.internal.ads.uh;
import com.google.android.gms.internal.ads.yn0;
import e4.e;
import f.q;
import f7.b0;
import g0.n;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import l.d0;
import o0.g0;
import o0.l;
import o0.u0;
import o0.v0;
import org.jasypt.digest.StandardStringDigester;
import q2.c;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.widgets.SystemNative;
import team.dev.epro.apkcustom.widgets.j;
import w1.m;
import x1.f;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f20685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f20686b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f20687d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f20688f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f20689h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f20690q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f20691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Method f20692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f20693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Field f20694v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Uri f20695w;

    public static String A(q qVar, Uri uri) {
        String string = null;
        if (uri.getScheme().equals("content")) {
            Cursor cursorQuery = qVar.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    }
                } finally {
                    cursorQuery.close();
                }
            }
        }
        if (string != null) {
            return string;
        }
        String path = uri.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        return iLastIndexOf != -1 ? path.substring(iLastIndexOf + 1) : path;
    }

    public static PropertyValuesHolder B(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        int i13 = 1;
        boolean z9 = typedValuePeekValue != null;
        int i14 = z9 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z10 = typedValuePeekValue2 != null;
        int i15 = z10 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z9 && M(i14)) || (z10 && M(i15))) ? 3 : 0;
        }
        boolean z11 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 != 2) {
            f fVar = i10 == 3 ? f.f18308a : null;
            if (z11) {
                if (z9) {
                    float dimension = i14 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                    if (z10) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i15 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i15 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z9) {
                int dimension2 = i14 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : M(i14) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
                if (z10) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i15 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : M(i15) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z10) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i15 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : M(i15) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            }
            if (propertyValuesHolderOfInt == null || fVar == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(fVar);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i11);
        String string2 = typedArray.getString(i12);
        g0.f[] fVarArrC = p7.q.c(string);
        g0.f[] fVarArrC2 = p7.q.c(string2);
        if (fVarArrC == null && fVarArrC2 == null) {
            return null;
        }
        if (fVarArrC == null) {
            if (fVarArrC2 != null) {
                return PropertyValuesHolder.ofObject(str, new m(i13), fVarArrC2);
            }
            return null;
        }
        m mVar = new m(i13);
        if (fVarArrC2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, mVar, fVarArrC);
        } else {
            if (!p7.q.a(fVarArrC, fVarArrC2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, mVar, fVarArrC, fVarArrC2);
        }
        return propertyValuesHolderOfObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String C(android.content.Context r16, android.net.Uri r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.C(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static String D(DatagramPacket datagramPacket) {
        if (datagramPacket == null) {
            return "<NA/NA:0>";
        }
        return "<" + d(datagramPacket.getAddress()) + ":" + datagramPacket.getPort() + ">";
    }

    public static String E(Socket socket) {
        if (socket == null) {
            return "<NA/NA:0>";
        }
        return "<" + d(socket.getInetAddress()) + ":" + socket.getPort() + ">";
    }

    public static File F(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static int G(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(fb1.h("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static o H(int i10) {
        if (i10 == 0) {
            return o.f1537a;
        }
        if (i10 == 1) {
            return o.f1538b;
        }
        if (i10 == 2) {
            return o.f1539d;
        }
        if (i10 == 3) {
            return o.f1540f;
        }
        if (i10 == 4) {
            return o.f1541h;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(fb1.h("Could not convert ", i10, " to NetworkType"));
        }
        return o.f1542q;
    }

    public static int I(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(fb1.h("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    public static w J(int i10) {
        if (i10 == 0) {
            return w.f1547a;
        }
        if (i10 == 1) {
            return w.f1548b;
        }
        if (i10 == 2) {
            return w.f1549d;
        }
        if (i10 == 3) {
            return w.f1550f;
        }
        if (i10 == 4) {
            return w.f1551h;
        }
        if (i10 == 5) {
            return w.f1552q;
        }
        throw new IllegalArgumentException(fb1.h("Could not convert ", i10, " to State"));
    }

    public static boolean K() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean L() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean M(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static synchronized boolean N(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f20685a;
        if (context2 != null && (bool = f20686b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f20686b = null;
        if (K()) {
            f20686b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f20686b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f20686b = Boolean.FALSE;
            }
        }
        f20685a = applicationContext;
        return f20686b.booleanValue();
    }

    public static ValueAnimator O(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayV = u.v(resources, theme, attributeSet, x1.a.f18291g);
        TypedArray typedArrayV2 = u.v(resources, theme, attributeSet, x1.a.f18295k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j10 = u.q(xmlResourceParser, "duration") ? typedArrayV.getInt(1, 300) : 300;
        int resourceId = 0;
        long j11 = !u.q(xmlResourceParser, "startOffset") ? 0 : typedArrayV.getInt(2, 0);
        int i10 = !u.q(xmlResourceParser, "valueType") ? 4 : typedArrayV.getInt(7, 4);
        if (u.q(xmlResourceParser, "valueFrom") && u.q(xmlResourceParser, "valueTo")) {
            if (i10 == 4) {
                TypedValue typedValuePeekValue = typedArrayV.peekValue(5);
                boolean z9 = typedValuePeekValue != null;
                int i11 = z9 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayV.peekValue(6);
                boolean z10 = typedValuePeekValue2 != null;
                i10 = ((z9 && M(i11)) || (z10 && M(z10 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = B(typedArrayV, i10, 5, 6, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(j10);
        valueAnimator3.setStartDelay(j11);
        valueAnimator3.setRepeatCount(!u.q(xmlResourceParser, "repeatCount") ? 0 : typedArrayV.getInt(3, 0));
        valueAnimator3.setRepeatMode(!u.q(xmlResourceParser, "repeatMode") ? 1 : typedArrayV.getInt(4, 1));
        if (typedArrayV2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strO = u.o(typedArrayV2, xmlResourceParser, "pathData", 1);
            if (strO != null) {
                String strO2 = u.o(typedArrayV2, xmlResourceParser, "propertyXName", 2);
                String strO3 = u.o(typedArrayV2, xmlResourceParser, "propertyYName", 3);
                if (strO2 == null && strO3 == null) {
                    throw new InflateException(typedArrayV2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathD = p7.q.d(strO);
                PathMeasure pathMeasure = new PathMeasure(pathD, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathD, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f10 = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                typedArray = typedArrayV;
                int i12 = 0;
                float f11 = 0.0f;
                while (true) {
                    if (resourceId >= iMin) {
                        break;
                    }
                    int i13 = iMin;
                    pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i12)).floatValue(), fArr3, null);
                    fArr[resourceId] = fArr3[0];
                    fArr2[resourceId] = fArr3[1];
                    f11 += f10;
                    int i14 = i12 + 1;
                    if (i14 < arrayList.size() && f11 > ((Float) arrayList.get(i14)).floatValue()) {
                        pathMeasure2.nextContour();
                        i12 = i14;
                    }
                    resourceId++;
                    iMin = i13;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strO2 != null ? PropertyValuesHolder.ofFloat(strO2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strO3 != null ? PropertyValuesHolder.ofFloat(strO3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayV;
                objectAnimator2.setPropertyName(u.o(typedArrayV2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = typedArrayV;
        }
        if (u.q(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayV2 != null) {
            typedArrayV2.recycle();
        }
        return valueAnimator2;
    }

    public static MappedByteBuffer P(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorA = n.a(context.getContentResolver(), uri, "r", null);
            if (parcelFileDescriptorA == null) {
                if (parcelFileDescriptorA != null) {
                    parcelFileDescriptorA.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorA.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorA.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static String Q(byte[] bArr) {
        char[] charArray = new String(Base64.decode(SystemNative.abc("b858b0005992331f81564e396a459a9eecb0697e5271ecc1d15430103821070eef496c9723846499a6f55ffccf48ab20d4c3ed045bfb2684116a40bdbf6dcba0ac5dc4dcda1702c48f507cb5933096922ae7a26b666b0cfeb8c2d491dbc7513411ad5c6760efddf449b4b2fb10e355bbb5f62f3f8bdc1a6d041def0ef49430c3ca81088cd02e816edcaf992d51510e585abde36f072ee3c3dee27c724bd0555da31f194527fe01b6dd349b2c5d54592b1645b0162fd6fa3a7d901a85d563c16964a7f49641a7f83a", 1), 2)).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (byte b10 : bArr) {
            sb.append(charArray[(b10 & 240) >> 4]);
            sb.append(charArray[b10 & 15]);
        }
        return sb.toString();
    }

    public static void R(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void U(d0 d0Var, boolean z9) {
        if (Build.VERSION.SDK_INT >= 23) {
            s0.m.c(d0Var, z9);
            return;
        }
        if (!f20690q) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f20689h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f20690q = true;
        }
        Field field = f20689h;
        if (field != null) {
            try {
                field.set(d0Var, Boolean.valueOf(z9));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void V(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            s0.m.d(popupWindow, i10);
            return;
        }
        if (!f20688f) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f20687d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f20688f = true;
        }
        Method method = f20687d;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }

    public static int W(w wVar) {
        int iOrdinal = wVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3) {
                    i10 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + wVar + " to int");
                    }
                }
            }
        }
        return i10;
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, int i10, String str) throws IOException {
        if (i10 >= 0 && i10 <= 255) {
            byteArrayOutputStream.write(i10);
            return;
        }
        throw new IOException(str + ". The value " + i10 + " is not within the allowed range for bytes");
    }

    public static float Y(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static int Z(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static int a0(int i10, ik0 ik0Var) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return ik0Var.v() + 1;
            case 7:
                return ik0Var.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long b0(int i10, long j10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        return (i10 & 1) == 0 ? b0(i11, j11) % 1073807359 : ((b0(i11, j11) % 1073807359) * j10) % 1073807359;
    }

    public static void c(String str) {
        e("Error : " + str);
    }

    public static void c0(a4.a aVar, Throwable th, String str) {
        cr.a((Context) a4.b.a0(aVar)).f(th, str, ((Double) uh.f9485g.k()).floatValue());
    }

    public static String d(InetAddress inetAddress) {
        if (inetAddress == null) {
            return "NA/NA";
        }
        return inetAddress.getHostName() + "/" + inetAddress.getHostAddress();
    }

    public static long d0(String str) {
        int i10 = yn0.f10944a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            j11 += Long.parseLong(strArrSplit[1]);
        }
        return j11 * 1000;
    }

    public static void e(String str) {
        String strY = g1.a.y(str, "\r\n");
        if (!App.f17100w.f17415a.getBoolean("log_direct_proxy", false) || strY == null || strY.contains("Cli data") || strY.contains("Srv data") || strY.toLowerCase().startsWith("error")) {
            return;
        }
        try {
            j jVar = App.f17101x;
            if (Boolean.parseBoolean(jVar.l0(jVar.i0())[2])) {
                return;
            }
            j jVar2 = App.f17101x;
            if (Boolean.parseBoolean(jVar2.l0(jVar2.i0())[15])) {
                return;
            }
            u.r("log", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] " + strY.replace("<", "&lt;").replace(">", "&gt;").replace("\r\n", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        } catch (Exception unused) {
        }
    }

    public static String e0(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            zzm.zzg("Unable to construct shingle");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 >= i13) {
                sb.append(strArr[i13]);
                return sb.toString();
            }
            sb.append(strArr[i10]);
            sb.append(' ');
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f0(com.google.android.gms.internal.ads.ik0 r21, com.google.android.gms.internal.ads.m0 r22, int r23, com.google.android.gms.internal.ads.k0 r24) {
        /*
            r0 = r21
            r1 = r22
            int r2 = r0.f5634b
            long r3 = r21.D()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r23
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L17
            return r9
        L17:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L21
            r5 = 1
            goto L22
        L21:
            r5 = 0
        L22:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r10
            long r3 = r3 & r7
            r19 = 15
            long r9 = r15 & r19
            int r10 = (int) r9
            r9 = 7
            r15 = -1
            if (r10 > r9) goto L42
            int r9 = r1.f6790g
            int r9 = r9 + r15
            if (r10 != r9) goto L3f
            goto L4b
        L3f:
            r0 = 0
            goto Lc0
        L42:
            r9 = 10
            if (r10 > r9) goto L3f
            int r9 = r1.f6790g
            r10 = 2
            if (r9 != r10) goto L3f
        L4b:
            r9 = 7
            long r9 = r17 & r9
            int r10 = (int) r9
            if (r10 != 0) goto L53
            goto L57
        L53:
            int r9 = r1.f6792i
            if (r10 != r9) goto L3f
        L57:
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L3f
            long r3 = r21.F()     // Catch: java.lang.NumberFormatException -> L3f
            if (r5 == 0) goto L64
        L61:
            r5 = r24
            goto L6a
        L64:
            int r5 = r1.f6785b
            long r7 = (long) r5
            long r3 = r3 * r7
            goto L61
        L6a:
            r5.f6130a = r3
            long r3 = r11 & r19
            int r4 = (int) r3
            int r3 = a0(r4, r0)
            if (r3 == r15) goto L3f
            int r4 = r1.f6785b
            if (r3 > r4) goto L3f
            long r3 = r13 & r19
            int r4 = (int) r3
            if (r4 != 0) goto L7f
            goto La3
        L7f:
            r3 = 11
            if (r4 > r3) goto L88
            int r1 = r1.f6789f
            if (r4 == r1) goto La3
            goto L3f
        L88:
            int r1 = r1.f6788e
            if (r4 != r6) goto L95
            int r3 = r21.v()
            int r3 = r3 * 1000
            if (r3 != r1) goto L3f
            goto La3
        L95:
            r3 = 14
            if (r4 > r3) goto L3f
            int r5 = r21.z()
            if (r4 != r3) goto La1
            int r5 = r5 * 10
        La1:
            if (r5 != r1) goto L3f
        La3:
            int r1 = r21.v()
            int r3 = r0.f5634b
            byte[] r0 = r0.f5633a
            int r3 = r3 + r15
            int r4 = com.google.android.gms.internal.ads.yn0.f10944a
            r4 = 0
        Laf:
            if (r2 >= r3) goto Lbd
            r5 = r0[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 ^ r5
            int[] r5 = com.google.android.gms.internal.ads.yn0.f10956m
            r4 = r5[r4]
            int r2 = r2 + 1
            goto Laf
        Lbd:
            if (r1 != r4) goto L3f
            r0 = 1
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.f0(com.google.android.gms.internal.ads.ik0, com.google.android.gms.internal.ads.m0, int, com.google.android.gms.internal.ads.k0):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x003b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static c2.e g(byte[] r6) {
        /*
            c2.e r0 = new c2.e
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L43
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        L17:
            if (r6 <= 0) goto L38
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            c2.d r5 = new c2.d     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.util.HashSet r3 = r0.f1525a     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r3.add(r5)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            int r6 = r6 + (-1)
            goto L17
        L32:
            r6 = r2
            goto L4e
        L34:
            r6 = move-exception
            goto L45
        L36:
            goto L32
        L38:
            r2.close()     // Catch: java.io.IOException -> L3b
        L3b:
            r1.close()     // Catch: java.io.IOException -> L54
            goto L54
        L3f:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L45
        L43:
            goto L4e
        L45:
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L4a
        L4a:
            r1.close()     // Catch: java.io.IOException -> L4d
        L4d:
            throw r6
        L4e:
            if (r6 == 0) goto L3b
            r6.close()     // Catch: java.io.IOException -> L3b
            goto L3b
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.g(byte[]):c2.e");
    }

    public static void g0(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        kc kcVar = new kc(i11, str, j10);
        if ((priorityQueue.size() != i10 || (((kc) priorityQueue.peek()).f6246c <= i11 && ((kc) priorityQueue.peek()).f6244a <= j10)) && !priorityQueue.contains(kcVar)) {
            priorityQueue.add(kcVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    public static long h0(String[] strArr, int i10) {
        long jW = (((long) b4.f.W(strArr[0])) + 2147483647L) % 1073807359;
        for (int i11 = 1; i11 < i10; i11++) {
            jW = (((((long) b4.f.W(strArr[i11])) + 2147483647L) % 1073807359) + ((jW * 16785407) % 1073807359)) % 1073807359;
        }
        return jW;
    }

    public static void i(e eVar) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != eVar.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + eVar.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void j(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void k(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void l(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void n(String str, boolean z9) {
        if (!z9) {
            throw new IllegalStateException(str);
        }
    }

    public static void o(b0 b0Var, c cVar) {
        f7.d0 d0Var;
        cVar.getClass();
        if (b0Var == null || (d0Var = b0Var.f13225s) == null || d0Var.c() == null) {
            return;
        }
        try {
            d0Var.c().close();
        } catch (Exception unused) {
        }
    }

    public static void p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String q(Context context, Uri uri) {
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        int columnIndex = cursorQuery.getColumnIndex("_display_name");
        int columnIndex2 = cursorQuery.getColumnIndex("_size");
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(columnIndex);
        Long.toString(cursorQuery.getLong(columnIndex2));
        File file = new File(context.getExternalFilesDir("temp"), string);
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[Math.min(inputStreamOpenInputStream.available(), 1048576)];
            while (true) {
                int i10 = inputStreamOpenInputStream.read(bArr);
                if (i10 == -1) {
                    inputStreamOpenInputStream.close();
                    fileOutputStream.close();
                    return file.getPath();
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception unused) {
            return String.valueOf(uri);
        }
    }

    public static boolean r(File file, Resources resources, int i10) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i10);
            try {
                boolean zS = s(file, inputStreamOpenRawResource);
                p(inputStreamOpenRawResource);
                return zS;
            } catch (Throwable th) {
                th = th;
                p(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean s(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    p(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            p(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            p(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x039c, code lost:
    
        if (r31 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x039e, code lost:
    
        if (r13 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a0, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03af, code lost:
    
        if (r3.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b1, code lost:
    
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03bd, code lost:
    
        if (r32 != 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03bf, code lost:
    
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c3, code lost:
    
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c6, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator t(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.t(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static String u(String str) {
        String str2 = new String(Base64.decode(SystemNative.abc("b858b0005992331f81564e396a459a9eecb0697e5271ecc1d15430103821070eef496c9723846499a6f55ffccf48ab20d4c3ed045bfb2684116a40bdbf6dcba0ac5dc4dcda1702c48f507cb5933096922ae7a26b666b0cfeb8c2d491dbc7513411ad5c6760efddf449b4b2fb10e355bbb5f62f3f8bdc1a6d041def0ef49430c3ca81088cd02e816edcaf992d51510e585abde36f072ee3c3dee27c724bd0555da31f194527fe01b6dd349b2c5d54592b1645b0162fd6fa3a7d901a85d563c16964a7f49641a7f83a", 1), 2));
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((str2.indexOf(charArray[i11 + 1]) + (str2.indexOf(charArray[i11]) * 16)) & 255);
        }
        try {
            return new String(bArr, StandardStringDigester.MESSAGE_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static boolean v(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = v0.f16075a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = u0.f16069d;
        u0 u0Var = (u0) view.getTag(R.id.ve);
        if (u0Var == null) {
            u0Var = new u0();
            u0Var.f16070a = null;
            u0Var.f16071b = null;
            u0Var.f16072c = null;
            view.setTag(R.id.ve, u0Var);
        }
        WeakReference weakReference2 = u0Var.f16072c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        u0Var.f16072c = new WeakReference(keyEvent);
        if (u0Var.f16071b == null) {
            u0Var.f16071b = new SparseArray();
        }
        SparseArray sparseArray = u0Var.f16071b;
        if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !g0.b(view2) || (arrayList = (ArrayList) view2.getTag(R.id.vf)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        fb1.t(arrayList.get(size));
        throw null;
    }

    public static boolean w(l lVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        if (lVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return lVar.b(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f20691s) {
                        try {
                            f20692t = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f20691s = true;
                    }
                    Method method = f20692t;
                    if (method != null) {
                        try {
                            Object objInvoke = method.invoke(actionBar, keyEvent);
                            if (objInvoke != null) {
                                if (((Boolean) objInvoke).booleanValue()) {
                                    return true;
                                }
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (v0.c(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && v0.c(view, keyEvent)) || lVar.b(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f20693u) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f20694v = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f20693u = true;
        }
        Field field = f20694v;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (v0.c(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }

    public static String x(byte[] bArr) {
        int length = ((int) (8.0d - (((double) (bArr.length % 5)) * 1.6d))) % 8;
        byte[] bArr2 = new byte[bArr.length + length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length; i10 += 5) {
            long j10 = (((long) (bArr2[i10] & 255)) << 32) + (((long) (bArr2[i10 + 1] & 255)) << 24) + ((long) ((bArr2[i10 + 2] & 255) << 16)) + ((long) ((bArr2[i10 + 3] & 255) << 8)) + ((long) (bArr2[i10 + 4] & 255));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j10 >> 35) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j10 >> 30) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j10 >> 25) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j10 >> 20) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j10 >> 15) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j10 >> 10) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j10 >> 5) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) (j10 & 31)));
        }
        return sb.substring(0, sb.length() - length) + "======".substring(0, length);
    }

    public static String y(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String z(Context context, Uri uri) {
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        int columnIndex = cursorQuery.getColumnIndex("_display_name");
        int columnIndex2 = cursorQuery.getColumnIndex("_size");
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(columnIndex);
        Long.toString(cursorQuery.getLong(columnIndex2));
        File file = new File(context.getCacheDir(), string);
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[Math.min(inputStreamOpenInputStream.available(), 1048576)];
            while (true) {
                int i10 = inputStreamOpenInputStream.read(bArr);
                if (i10 == -1) {
                    inputStreamOpenInputStream.close();
                    fileOutputStream.close();
                    return file.getPath();
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception unused) {
            return String.valueOf(uri);
        }
    }

    public abstract View S(int i10);

    public abstract boolean T();
}
