package androidx.core.app;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static l0 a(Person person) {
        IconCompat iconCompatA;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.f543k;
            iconCompatA = h0.d.a(icon);
        } else {
            iconCompatA = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        l0 l0Var = new l0();
        l0Var.f497a = name;
        l0Var.f498b = iconCompatA;
        l0Var.f499c = uri;
        l0Var.f500d = key;
        l0Var.f501e = zIsBot;
        l0Var.f502f = zIsImportant;
        return l0Var;
    }

    public static Person b(l0 l0Var) {
        Person.Builder name = new Person.Builder().setName(l0Var.f497a);
        IconCompat iconCompat = l0Var.f498b;
        return name.setIcon(iconCompat != null ? iconCompat.j(null) : null).setUri(l0Var.f499c).setKey(l0Var.f500d).setBot(l0Var.f501e).setImportant(l0Var.f502f).build();
    }
}
