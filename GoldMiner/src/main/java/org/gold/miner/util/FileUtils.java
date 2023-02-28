package org.gold.miner.util;

import java.util.Objects;

/**
 * @ClassName FileUtils
 * @Author Administrator
 * @Description 文件加载
 * @Version 1.0.0
 * 
 * @CreateTime 2022/11/27
 */
public class FileUtils {

    private static final String IMG_DIC = "img/";

    private FileUtils() {}

    /**
     * @Description: 获取图片文件路径
     * @Title: getImgFileUrl
     * @param fileName 文件名
     * @return String 文件路径
     */
    public static String getImgFileUrl(String fileName) {
        fileName = IMG_DIC + fileName;

        return Objects.requireNonNull(FileUtils.class.getClassLoader().getResource(fileName)).getPath();
    }
}