package org.gold.miner;

import java.awt.*;

import javax.swing.*;

import org.gold.miner.util.*;

/**
 * @ClassName MainUI
 * @Author Administrator
 * @Description 主界面
 * @Version 1.0.0
 * 
 * @CreateTime 2022/11/27
 */
public class MainUI extends JFrame {

    /**
     * @Title: MainUI
     * @Description: 构造方法
     */
    public MainUI() {

        // 设置窗口可见
        setVisible(true);
        // 禁止拉伸[最大化/放大]
        setResizable(false);

        // 设置窗口屏幕居中
        setLocationRelativeTo(null);

        // 设置窗口图标
        setIconImage(Toolkit.getDefaultToolkit().getImage(FileUtils.getImgFileUrl("peo.png")));

        // 标题
        setTitle(Constants.WINDOWS_TITLE);
        // 关闭方法
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 设置窗口大小
        setSize(Constants.WINDOWS_WIDTH, Constants.WINDOWS_HEIGHT);
    }


}