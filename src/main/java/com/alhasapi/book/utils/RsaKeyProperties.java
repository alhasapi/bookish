package com.alhasapi.book.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@Data
@ConfigurationProperties(prefix = "rsa")
public class RsaKeyProperties {
    public RSAPublicKey publicKey;
    public RSAPrivateKey privateKey;
}
