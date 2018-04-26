package com.liuhao.lagou.util;

public class TokenGenerateUtil {

    public static String generate(String mobile) {
        String temp = String.format("%s%d",mobile,System.currentTimeMillis());
        return MD5Util.MD5Encode(temp,"UTF-8");
    }

}
