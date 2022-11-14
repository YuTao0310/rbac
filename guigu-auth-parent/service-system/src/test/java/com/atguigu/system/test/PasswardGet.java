package com.atguigu.system.test;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.atguigu.system.custom.CustomMd5Password;

public class PasswardGet {
    public static void main(String[] args) {
        PasswordEncoder encoder = new CustomMd5Password();
        String original = "adminadmin";
        System.out.println(encoder.encode(original));
    }
}
