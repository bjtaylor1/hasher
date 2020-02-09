package com.bjt.hasher;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import org.apache.commons.codec.digest.DigestUtils;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.stream.*;

import java.security.MessageDigest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        for(final String arg : args) {
            System.out.println(String.format("commons sha512: %s", DigestUtils.sha512Hex(arg.getBytes(StandardCharsets.UTF_8))));
            System.out.println(String.format("Google sha512 : %s", Hashing.sha512().hashString(arg, StandardCharsets.UTF_8).toString()));
        }
    }
}
