package go;

import go.Seq1;

/* JADX INFO: loaded from: classes.dex */
public abstract class Universe1 {

    public static final class proxyerror extends Exception implements Seq1.Proxy, error {
        private final int refnum;

        public proxyerror(int i10) {
            this.refnum = i10;
            Seq1.trackGoRef(i10, this);
        }

        @Override // go.error
        public native String error();

        @Override // java.lang.Throwable
        public String getMessage() {
            return error();
        }

        @Override // go.Seq1.GoObject
        public final int incRefnum() {
            Seq1.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    static {
        Seq1.touch();
        _init();
    }

    private Universe1() {
    }

    private static native void _init();

    public static void touch() {
    }
}
