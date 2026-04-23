package org.jasypt.encryption.pbe.config;

import org.jasypt.commons.CommonUtils;
import org.jasypt.web.pbeconfig.WebPBEConfigRegistry;

/* JADX INFO: loaded from: classes.dex */
public class WebPBEConfig extends SimplePBEConfig {
    private String name = null;
    private String validationWord = null;

    public WebPBEConfig() {
        WebPBEConfigRegistry.getInstance().registerConfig(this);
    }

    public String getName() {
        return this.name;
    }

    public String getValidationWord() {
        return this.validationWord;
    }

    public boolean isComplete() {
        return CommonUtils.isNotEmpty(this.name) && CommonUtils.isNotEmpty(this.validationWord);
    }

    public void setName(String str) {
        CommonUtils.validateNotEmpty(str, "Name cannot be set empty");
        this.name = str;
    }

    public void setValidationWord(String str) {
        CommonUtils.validateNotEmpty(str, "Validation word cannot be set empty");
        this.validationWord = str;
    }
}
