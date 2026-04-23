package org.jasypt.web.pbeconfig;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.jasypt.encryption.pbe.config.WebPBEConfig;
import org.jasypt.exceptions.EncryptionInitializationException;

/* JADX INFO: loaded from: classes.dex */
final class WebPBEConfigHtmlUtils {
    private static final String HTTPS_SCHEME = "https";
    public static final String PASSWORD_PREFIX = "jasyptPw";
    public static final String PASSWORD_RETYPED_PREFIX = "jasyptRPw";
    public static final String PASSWORD_SETTING_FLAG = "jasyptPwSetting";
    public static final String VALIDATION_PREFIX = "jasyptVa";

    private WebPBEConfigHtmlUtils() {
    }

    private static void addFoot(StringBuffer stringBuffer) {
        stringBuffer.append("  </div>\n");
        stringBuffer.append(" </body>\n");
        stringBuffer.append("</html>\n");
    }

    private static void addHeader(StringBuffer stringBuffer) {
        stringBuffer.append("<html>\n");
        stringBuffer.append(" <head>\n");
        stringBuffer.append("  <title>Web Password Based Encryption Configuration</title>\n");
        stringBuffer.append("  <style type=\"text/css\">");
        stringBuffer.append("   html { background-color: #ccc; text-align: center; margin: 0px; padding: 0px;} body {text-align:center;} #page { width: 700px; background-color: white; margin-top: 10px; margin-left: auto; margin-right: auto; padding: 10px; border: 1px solid #000; text-align: left;} h1 { text-weight: bold;} #button { text-align: center; margin-top: 20px; } fieldset { margin-bottom: 20px; } label { font-style: italic; } legend { font-weight: bold; } div.warning { border: 1px dotted #000; margin: 15px; padding: 5px; background-color: eee; font-weight: bold; }");
        stringBuffer.append("  </style>\n");
        stringBuffer.append(" </head>\n");
        stringBuffer.append(" <body>\n");
        stringBuffer.append("  <div id=\"page\">\n");
        stringBuffer.append("   <h1>Web PBE Configuration</h1>\n");
    }

    public static String createConfigurationDoneHtml() {
        StringBuffer stringBuffer = new StringBuffer();
        addHeader(stringBuffer);
        stringBuffer.append("   <h2>All Configuration Done</h2>\n");
        addFoot(stringBuffer);
        return stringBuffer.toString();
    }

    public static String createInputFormHtml(HttpServletRequest httpServletRequest, boolean z9) {
        List<WebPBEConfig> configs = WebPBEConfigRegistry.getInstance().getConfigs();
        StringBuffer stringBuffer = new StringBuffer();
        addHeader(stringBuffer);
        stringBuffer.append("   <h2>Please enter the PBE configuration parameters</h2>\n");
        if (!HTTPS_SCHEME.equals(httpServletRequest.getScheme().toLowerCase())) {
            stringBuffer.append("   <div class=\"warning\">WARNING: NOT IN SECURE MODE (HTTPS)</div>\n");
        }
        if (z9) {
            stringBuffer.append("   <div class=\"warning\">Validation error!</div>\n");
        }
        StringBuffer stringBuffer2 = new StringBuffer("   <form action=\"");
        stringBuffer2.append(httpServletRequest.getRequestURI());
        stringBuffer2.append("\" method=\"POST\">\n");
        stringBuffer.append(stringBuffer2.toString());
        stringBuffer.append("    <div>\n");
        int i10 = 0;
        for (WebPBEConfig webPBEConfig : configs) {
            if (!webPBEConfig.isComplete()) {
                throw new EncryptionInitializationException("Incomplete WebPBEConfig object: all configs must specify both a name and a validation word");
            }
            stringBuffer.append("     <fieldset>\n");
            StringBuffer stringBuffer3 = new StringBuffer("      <legend>");
            stringBuffer3.append(webPBEConfig.getName());
            stringBuffer3.append("</legend>\n");
            stringBuffer.append(stringBuffer3.toString());
            StringBuffer stringBuffer4 = new StringBuffer("      <label for=\"jasyptVa");
            stringBuffer4.append(i10);
            stringBuffer4.append("\">Validation word</label>: <input type=\"password\" name=\"jasyptVa");
            stringBuffer4.append(i10);
            stringBuffer4.append("\" />\n");
            stringBuffer.append(stringBuffer4.toString());
            stringBuffer.append("      <br /><br />\n");
            StringBuffer stringBuffer5 = new StringBuffer("      <label for=\"jasyptPw");
            stringBuffer5.append(i10);
            stringBuffer5.append("\">Password</label>: <input type=\"password\" name=\"jasyptPw");
            stringBuffer5.append(i10);
            stringBuffer5.append("\" />\n");
            stringBuffer.append(stringBuffer5.toString());
            stringBuffer.append("      <br /><br />\n");
            StringBuffer stringBuffer6 = new StringBuffer("      <label for=\"jasyptRPw");
            stringBuffer6.append(i10);
            stringBuffer6.append("\">Retype password</label>: <input type=\"password\" name=\"jasyptRPw");
            stringBuffer6.append(i10);
            stringBuffer6.append("\" />\n");
            stringBuffer.append(stringBuffer6.toString());
            stringBuffer.append("     </fieldset>\n");
            i10++;
        }
        stringBuffer.append("    </div>\n");
        stringBuffer.append("    <div id=\"button\">\n");
        stringBuffer.append("     <input type=\"hidden\" name=\"jasyptPwSetting\" value=\"true\" />\n");
        stringBuffer.append("     <input type=\"submit\" value=\"Submit\" />\n");
        stringBuffer.append("    </div>\n");
        stringBuffer.append("   </form>\n");
        addFoot(stringBuffer);
        return stringBuffer.toString();
    }

    public static String createNotInitializedHtml() {
        return "<html>\n <head>\n  <title>Forbidden</title>\n </head>\n <body>\n   <h1>Access Forbidden</h1>\n </body>\n</html>\n";
    }
}
