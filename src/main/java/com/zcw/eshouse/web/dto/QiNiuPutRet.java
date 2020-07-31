package com.zcw.eshouse.web.dto;

/**
 * @ClassName : QiNiuPutRet
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-31 18:52
 */
public class QiNiuPutRet {
    public String key;
    public String hash;
    public String bucket;
    public int width;
    public int height;

    @Override
    public String toString() {
        return "QiNiuPutRet{" +
                "key='" + key + '\'' +
                ", hash='" + hash + '\'' +
                ", bucket='" + bucket + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
