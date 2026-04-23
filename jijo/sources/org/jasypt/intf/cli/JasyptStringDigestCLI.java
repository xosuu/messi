package org.jasypt.intf.cli;

import java.util.Properties;
import org.jasypt.intf.service.JasyptStatelessService;

/* JADX INFO: loaded from: classes.dex */
public final class JasyptStringDigestCLI {
    static /* synthetic */ Class class$org$jasypt$intf$cli$JasyptStringDigestCLI;
    private static final String[][] VALID_REQUIRED_ARGUMENTS = {new String[]{"input"}};
    private static final String[][] VALID_OPTIONAL_ARGUMENTS = {new String[]{"verbose"}, new String[]{"algorithm"}, new String[]{"iterations"}, new String[]{"saltSizeBytes"}, new String[]{"saltGeneratorClassName"}, new String[]{"providerName"}, new String[]{"providerClassName"}, new String[]{"invertPositionOfSaltInMessageBeforeDigesting"}, new String[]{"invertPositionOfPlainSaltInEncryptionResults"}, new String[]{"useLenientSaltSizeCheck"}, new String[]{"unicodeNormalizationIgnored"}, new String[]{"stringOutputType"}, new String[]{"prefix"}, new String[]{"suffix"}};

    private JasyptStringDigestCLI() {
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError().initCause(e10);
        }
    }

    public static void main(String[] strArr) {
        String name;
        String[] strArr2 = strArr;
        boolean verbosity = CLIUtils.getVerbosity(strArr);
        try {
            String str = strArr2[0];
            if (str == null || str.indexOf("=") != -1) {
                Class clsClass$ = class$org$jasypt$intf$cli$JasyptStringDigestCLI;
                if (clsClass$ == null) {
                    clsClass$ = class$("org.jasypt.intf.cli.JasyptStringDigestCLI");
                    class$org$jasypt$intf$cli$JasyptStringDigestCLI = clsClass$;
                }
                name = clsClass$.getName();
            } else {
                name = strArr2[0];
                String[] strArr3 = new String[strArr2.length - 1];
                System.arraycopy(strArr2, 1, strArr3, 0, strArr2.length - 1);
                strArr2 = strArr3;
            }
            Properties argumentValues = CLIUtils.getArgumentValues(name, strArr2, VALID_REQUIRED_ARGUMENTS, VALID_OPTIONAL_ARGUMENTS);
            CLIUtils.showEnvironment(verbosity);
            JasyptStatelessService jasyptStatelessService = new JasyptStatelessService();
            String property = argumentValues.getProperty("input");
            CLIUtils.showArgumentDescription(argumentValues, verbosity);
            CLIUtils.showOutput(jasyptStatelessService.digest(property, argumentValues.getProperty("algorithm"), null, null, argumentValues.getProperty("iterations"), null, null, argumentValues.getProperty("saltSizeBytes"), null, null, argumentValues.getProperty("saltGeneratorClassName"), null, null, argumentValues.getProperty("providerName"), null, null, argumentValues.getProperty("providerClassName"), null, null, argumentValues.getProperty("invertPositionOfSaltInMessageBeforeDigesting"), null, null, argumentValues.getProperty("invertPositionOfPlainSaltInEncryptionResults"), null, null, argumentValues.getProperty("useLenientSaltSizeCheck"), null, null, argumentValues.getProperty("unicodeNormalizationIgnored"), null, null, argumentValues.getProperty("stringOutputType"), null, null, argumentValues.getProperty("prefix"), null, null, argumentValues.getProperty("suffix"), null, null), verbosity);
        } catch (Throwable th) {
            CLIUtils.showError(th, verbosity);
        }
    }
}
