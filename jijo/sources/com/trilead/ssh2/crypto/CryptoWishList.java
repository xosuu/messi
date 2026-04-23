package com.trilead.ssh2.crypto;

import c6.a;
import com.trilead.ssh2.compression.CompressionFactory;
import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.digest.MessageMac;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CryptoWishList {
    public String[] c2s_comp_algos;
    public String[] c2s_enc_algos;
    public String[] c2s_mac_algos;
    public String[] kexAlgorithms;
    public String[] s2c_comp_algos;
    public String[] s2c_enc_algos;
    public String[] s2c_mac_algos;
    public String[] serverHostKeyAlgorithms;

    public CryptoWishList() {
        a aVar = f6.a.f13102o;
        this.kexAlgorithms = new String[]{"diffie-hellman-group-exchange-sha256", "diffie-hellman-group-exchange-sha1", "diffie-hellman-group14-sha1", "diffie-hellman-group1-sha1"};
        ArrayList arrayList = f6.a.f13103p;
        this.serverHostKeyAlgorithms = (String[]) arrayList.toArray(new String[arrayList.size()]);
        this.c2s_enc_algos = BlockCipherFactory.getDefaultCipherList();
        this.s2c_enc_algos = BlockCipherFactory.getDefaultCipherList();
        this.c2s_mac_algos = MessageMac.getMacs();
        this.s2c_mac_algos = MessageMac.getMacs();
        this.c2s_comp_algos = CompressionFactory.getDefaultCompressorList();
        this.s2c_comp_algos = CompressionFactory.getDefaultCompressorList();
    }
}
