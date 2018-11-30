package com.alankin.common.utils;

import com.alankin.common.json.IJsonConvertor;
import com.alankin.common.json.INameFilter;
import com.alankin.common.json.impl.FastJsonConvertor;

public class JsonUtils {

    private static IJsonConvertor jsonConvertor = new FastJsonConvertor();

    private JsonUtils() {
    }

    public static String convert(Object value) {
        return jsonConvertor.convert(value);
    }

    public static String convert(Object value, INameFilter nameFilter) {
        return jsonConvertor.convert(value, nameFilter);
    }

    public static <T> T parse(String value, Class<T> clazz) {
        return jsonConvertor.parse(value, clazz);
    }
}
