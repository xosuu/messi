package f6;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c9.a f13173a;

    public g(c9.a aVar) {
        this.f13173a = aVar;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        c9.a aVar = this.f13173a;
        return new PasswordAuthentication(aVar.f1604c, aVar.f1605d.toCharArray());
    }
}
