package g4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.provider.Settings;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Xml;
import android.view.ActionMode;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.androidnetworking.error.ANError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.tp1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.zip.ZipException;
import org.jasypt.digest.StandardStringDigester;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f13827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f13828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f13830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f13831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f13832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f13833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static long f13834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f13835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c2.n f13836j = new c2.n(12, 0);

    public static boolean A(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return h0.c.b(drawable, i10);
        }
        if (!f13829c) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f13828b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f13829c = true;
        }
        Method method = f13828b;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception unused2) {
                f13828b = null;
            }
        }
        return false;
    }

    public static void B(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    public static void C(Drawable drawable, int i10) {
        h0.b.g(drawable, i10);
    }

    public static void D(Drawable drawable, ColorStateList colorStateList) {
        h0.b.h(drawable, colorStateList);
    }

    public static void E(Drawable drawable, PorterDuff.Mode mode) {
        h0.b.i(drawable, mode);
    }

    public static void F(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i10));
    }

    public static ActionMode.Callback G(ActionMode.Callback callback) {
        return (!(callback instanceof s0.s) || Build.VERSION.SDK_INT < 26) ? callback : ((s0.s) callback).f16655a;
    }

    public static int H(Parcel parcel) {
        int i10 = parcel.readInt();
        int iW = w(parcel, i10);
        char c10 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iW + iDataPosition;
        if (i11 < iDataPosition || i11 > parcel.dataSize()) {
            throw new SafeParcelReader$ParseException(l.a0.f("Size read is invalid start=", iDataPosition, " end=", i11), parcel);
        }
        return i11;
    }

    public static Drawable I(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof h0.h)) {
            return drawable;
        }
        h0.k kVar = new h0.k(drawable);
        if (h0.k.f13922t == null) {
            try {
                h0.k.f13922t = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return kVar;
    }

    public static ActionMode.Callback J(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof s0.s) || callback == null) ? callback : new s0.s(callback, textView);
    }

    public static synchronized String K(Context context) {
        String str;
        try {
            if (f13827a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || tp1.M()) {
                    string = "emulator";
                }
                for (int i10 = 0; i10 < 3; i10++) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(string.getBytes());
                        str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                        break;
                    } catch (ArithmeticException unused) {
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                }
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                f13827a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13827a;
    }

    public static void L(Parcel parcel, int i10, int i11) {
        int iW = w(parcel, i10);
        if (iW == i11) {
            return;
        }
        String hexString = Integer.toHexString(iW);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i11);
        sb.append(" got ");
        sb.append(iW);
        sb.append(" (0x");
        throw new SafeParcelReader$ParseException(g1.a.r(sb, hexString, ")"), parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            a(h0.a.c((InsetDrawable) drawable));
            return;
        }
        if (drawable instanceof h0.i) {
            a(((h0.j) ((h0.i) drawable)).f13921q);
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Drawable drawableB = h0.a.b(drawableContainerState, i10);
            if (drawableB != null) {
                a(drawableB);
            }
        }
    }

    public static Bundle b(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iW);
        return bundle;
    }

    public static byte[] c(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iW);
        return bArrCreateByteArray;
    }

    public static Parcelable d(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iW);
        return parcelable;
    }

    public static String e(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iW);
        return string;
    }

    public static String[] f(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iW);
        return strArrCreateStringArray;
    }

    public static ArrayList g(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateStringArrayList;
    }

    public static Object[] h(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return objArrCreateTypedArray;
    }

    public static void i(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new SafeParcelReader$ParseException(fb1.g("Overread allowed size end=", i10), parcel);
        }
    }

    public static androidx.emoji2.text.v j(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j10 = length - 22;
        if (j10 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j11 = length - 65558;
        long j12 = j11 >= 0 ? j11 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j10);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                androidx.emoji2.text.v vVar = new androidx.emoji2.text.v(1);
                vVar.f649b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                vVar.f648a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return vVar;
            }
            j10--;
        } while (j10 >= j12);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static Drawable k(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return s0.c.a(compoundButton);
        }
        if (!f13833g) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f13832f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f13833g = true;
        }
        Field field = f13832f;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f13832f = null;
            }
        }
        return null;
    }

    public static int l(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static void m(ANError aNError, q2.c cVar) {
        f7.d0 d0Var;
        cVar.getClass();
        try {
            f7.b0 b0Var = aNError.f1610a;
            if (b0Var == null || (d0Var = b0Var.f13225s) == null || d0Var.c() == null) {
                return;
            }
            p7.g gVarC = aNError.f1610a.f13225s.c();
            Logger logger = p7.n.f16294a;
            p7.e eVar = new p7.e();
            if (gVarC == null) {
                throw new NullPointerException("source == null");
            }
            eVar.J(gVarC);
            eVar.E();
        } catch (Exception unused) {
        }
    }

    public static int n(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return h0.c.a(drawable);
        }
        if (!f13831e) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f13830d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f13831e = true;
        }
        Method method = f13830d;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                f13830d = null;
            }
        }
        return 0;
    }

    public static m0.g o(TextView textView) {
        int iA;
        int iD;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new m0.g(s0.r.b(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        if (i10 >= 23) {
            iA = 1;
            iD = 1;
        } else {
            iA = 0;
            iD = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i10 >= 23) {
            iA = s0.p.a(textView);
            iD = s0.p.d(textView);
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i10 < 28 || (textView.getInputType() & 15) != 3) {
            boolean z9 = s0.o.b(textView) == 1;
            switch (s0.o.c(textView)) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z9) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(s0.r.a(s0.q.a(s0.o.d(textView)))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new m0.g(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static boolean p() {
        try {
            if (f13835i == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f13835i == null) {
                f13834h = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f13835i = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f13835i.invoke(null, Long.valueOf(f13834h))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static void q(Context context, String str) {
        if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                xmlSerializerNewSerializer.startDocument(StandardStringDigester.MESSAGE_CHARSET, Boolean.TRUE);
                xmlSerializerNewSerializer.startTag(null, "locales");
                xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                xmlSerializerNewSerializer.endTag(null, "locales");
                xmlSerializerNewSerializer.endDocument();
                if (fileOutputStreamOpenFileOutput == null) {
                    return;
                }
            } catch (Exception unused) {
                if (fileOutputStreamOpenFileOutput == null) {
                    return;
                }
            } catch (Throwable th) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
            try {
                fileOutputStreamOpenFileOutput.close();
            } catch (IOException unused3) {
            }
        } catch (FileNotFoundException unused4) {
            String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
    }

    public static boolean r(Parcel parcel, int i10) {
        L(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder s(Parcel parcel, int i10) {
        int iW = w(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iW);
        return strongBinder;
    }

    public static int t(Parcel parcel, int i10) {
        L(parcel, i10, 4);
        return parcel.readInt();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045 A[EXC_TOP_SPLITTER, PHI: r1
      0x0045: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v5 java.lang.String) binds: [B:29:0x0051, B:22:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String u(android.content.Context r8) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = r8.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L5e
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        L15:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            r6 = 1
            if (r5 == r6) goto L43
            r6 = 3
            if (r5 != r6) goto L2a
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            if (r7 <= r4) goto L43
            goto L2a
        L26:
            r8 = move-exception
            goto L4b
        L28:
            goto L51
        L2a:
            if (r5 == r6) goto L15
            r6 = 4
            if (r5 != r6) goto L30
            goto L15
        L30:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
            if (r5 == 0) goto L15
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        L43:
            if (r2 == 0) goto L54
        L45:
            r2.close()     // Catch: java.io.IOException -> L49
            goto L54
        L49:
            goto L54
        L4b:
            if (r2 == 0) goto L50
            r2.close()     // Catch: java.io.IOException -> L50
        L50:
            throw r8
        L51:
            if (r2 == 0) goto L54
            goto L45
        L54:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L5b
            goto L5e
        L5b:
            r8.deleteFile(r0)
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.z.u(android.content.Context):java.lang.String");
    }

    public static long v(Parcel parcel, int i10) {
        L(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int w(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void x(f7.b0 r3, java.lang.String r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            f7.d0 r3 = r3.f13225s     // Catch: java.lang.Throwable -> L4a
            p7.g r3 = r3.c()     // Catch: java.lang.Throwable -> L46
            p7.d r3 = r3.B()     // Catch: java.lang.Throwable -> L46
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L1e
            boolean r4 = r2.exists()     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L22
            r2.mkdirs()     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r4 = move-exception
            r5 = r1
        L20:
            r1 = r3
            goto L4c
        L22:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L1e
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1e
        L2c:
            int r4 = r3.read(r0)     // Catch: java.lang.Throwable -> L38
            r1 = -1
            if (r4 == r1) goto L3a
            r1 = 0
            r5.write(r0, r1, r4)     // Catch: java.lang.Throwable -> L38
            goto L2c
        L38:
            r4 = move-exception
            goto L20
        L3a:
            r5.flush()     // Catch: java.lang.Throwable -> L38
            r3.close()     // Catch: java.io.IOException -> L40
        L40:
            r5.close()     // Catch: java.io.IOException -> L43
        L43:
            return
        L44:
            r4 = r3
            goto L48
        L46:
            r3 = move-exception
            goto L44
        L48:
            r5 = r1
            goto L4c
        L4a:
            r4 = move-exception
            goto L48
        L4c:
            if (r1 == 0) goto L53
            r1.close()     // Catch: java.io.IOException -> L52
            goto L53
        L52:
        L53:
            if (r5 == 0) goto L58
            r5.close()     // Catch: java.io.IOException -> L58
        L58:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.z.x(f7.b0, java.lang.String, java.lang.String):void");
    }

    public static void y(TextView textView, int i10) {
        b7.u.b(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            s0.r.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = s0.n.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void z(TextView textView, int i10) {
        b7.u.b(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = s0.n.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }
}
