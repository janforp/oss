package com.janita.oss.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Janita on 2017/3/13 0013
 * 配置文件
 */
@ConfigurationProperties(prefix="aliyunOss")
public class Config {

    private static String accessKeyId;
    private static String accessKeySecret;
    private static String region;
    private static String bucketName;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public static String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public static String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public static String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}