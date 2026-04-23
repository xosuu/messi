package x4;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Exception {
    public t(Exception exc) {
        super("Error thrown initializing StaticLayout " + exc.getMessage(), exc);
    }
}
