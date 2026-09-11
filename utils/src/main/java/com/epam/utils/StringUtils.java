package com.epam.utils; // Укажи нужный package своего проекта

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        if (!NumberUtils.isCreatable(str)) {
            return false;
        }

        return NumberUtils.toDouble(str) > 0;
    }
}