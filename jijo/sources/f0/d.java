package f0;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import com.google.android.gms.ads.RequestConfiguration;
import f7.x;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13016d;

    public d() {
        this.f13013a = 1;
        this.f13014b = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01fc, code lost:
    
        if (r7 == 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fe, code lost:
    
        if (r7 == 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0200, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0202, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0206, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0209, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        r3 = new android.graphics.LinearGradient(r11, r27, r26, r25, r15, r16, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0217, code lost:
    
        r1 = 0;
        r3 = new android.graphics.SweepGradient(r22, r23, (int[]) r0.f12832b, (float[]) r0.f12833d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022a, code lost:
    
        r8 = r22;
        r15 = r23;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0232, code lost:
    
        if (r24 <= 0.0f) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0234, code lost:
    
        r19 = (int[]) r0.f12832b;
        r0 = (float[]) r0.f12833d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0241, code lost:
    
        if (r7 == 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0244, code lost:
    
        if (r7 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0246, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024c, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024f, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0252, code lost:
    
        r3 = new android.graphics.RadialGradient(r8, r15, r24, r19, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0264, code lost:
    
        return new f0.d(r3, (android.content.res.ColorStateList) null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cf, code lost:
    
        if (r14.size() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        r0 = new f.f(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d8, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        if (r19 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        r0 = new f.f(r5, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
    
        r0 = new f.f(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ea, code lost:
    
        if (r9 == 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ed, code lost:
    
        if (r9 == 2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r15 = (int[]) r0.f12832b;
        r16 = (float[]) r0.f12833d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f0.d a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):f0.d");
    }

    public static d d(String str) throws ProtocolException {
        int i10;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        x xVar = x.f13383b;
        if (zStartsWith) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                xVar = x.f13384d;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i12 = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                strSubstring = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i10 + 4);
            }
            return new d(xVar, i12, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final boolean b() {
        if (((Shader) this.f13015c) == null) {
            Object obj = this.f13016d;
            if (((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(int[] iArr) {
        if (b()) {
            ColorStateList colorStateList = (ColorStateList) this.f13016d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f13014b) {
                this.f13014b = colorForState;
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        switch (this.f13013a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append(((x) this.f13015c) == x.f13383b ? "HTTP/1.0" : "HTTP/1.1");
                sb.append(' ');
                sb.append(this.f13014b);
                if (((String) this.f13016d) != null) {
                    sb.append(' ');
                    sb.append((String) this.f13016d);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i10, l5.d dVar, g4.m mVar) {
        this.f13013a = 2;
        this.f13014b = i10;
        this.f13015c = dVar;
        this.f13016d = mVar;
    }

    public d(x xVar, int i10, String str) {
        this.f13013a = 3;
        this.f13015c = xVar;
        this.f13014b = i10;
        this.f13016d = str;
    }

    public d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f13013a = 0;
        this.f13015c = shader;
        this.f13016d = colorStateList;
        this.f13014b = i10;
    }
}
