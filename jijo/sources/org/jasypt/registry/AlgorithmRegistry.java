package org.jasypt.registry;

import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class AlgorithmRegistry {
    private AlgorithmRegistry() {
    }

    public static Set getAllDigestAlgorithms() {
        ArrayList arrayList = new ArrayList(Security.getAlgorithms("MessageDigest"));
        Collections.sort(arrayList);
        return Collections.unmodifiableSet(new LinkedHashSet(arrayList));
    }

    public static Set getAllPBEAlgorithms() {
        ArrayList<String> arrayList = new ArrayList(Security.getAlgorithms("Cipher"));
        Collections.sort(arrayList);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : arrayList) {
            if (str != null && str.startsWith("PBE")) {
                linkedHashSet.add(str);
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
