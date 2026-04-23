package t3;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    Set a();

    void disconnect();

    void disconnect(String str);

    int getMinApkVersion();

    void getRemoteService(v3.i iVar, Set set);

    boolean requiresSignIn();
}
