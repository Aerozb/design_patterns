package Proxy.dynamic_proxy.util;

import sun.misc.ProxyGenerator;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将jvm内存中的代理类输出到桌面
 */
public class ProxyUtil {
    public static void generator(Class clz, String name) {
        byte[] bytes = ProxyGenerator.generateProxyClass(name, new Class[]{clz});
        String path = FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath() +File.separator+ name + ".class";
        System.out.println(path);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File(path));
            fos.write(bytes);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
