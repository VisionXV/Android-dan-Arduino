package com.google.appinventor.components.runtime.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class YailNumberToString {
    private static final double BIGBOUND = 1000000.0d;
    static final String LOG_TAG = "YailNumberToString";
    private static final double SMALLBOUND = 1.0E-6d;
    private static final String decPattern = "#####0.0####";
    static DecimalFormat decimalFormat = null;
    static Locale locale = null;
    static DecimalFormat sciFormat = null;
    private static final String sciPattern = "0.####E0";
    static DecimalFormatSymbols symbols;

    static {
        locale = Locale.US;
        symbols = new DecimalFormatSymbols(locale);
        decimalFormat = new DecimalFormat(decPattern, symbols);
        sciFormat = new DecimalFormat(sciPattern, symbols);
    }

    public static String format(double number) {
        if (number == Math.rint(number)) {
            return String.valueOf((int) number);
        }
        double mag = Math.abs(number);
        if (mag >= BIGBOUND || mag <= SMALLBOUND) {
            return sciFormat.format(number);
        }
        return decimalFormat.format(number);
    }
}
