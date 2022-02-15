package com.wzc.javase.about.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://m10.music.126.net/20190822175646/77ec834316b866cf48196b3a67b0109e/ymusic/1016/070a/520a/40bf67176e2623ad0643c43ee3ae7da8.mp3");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            OutputStream fos = new FileOutputStream("E:\\test\\c.mp3");
            byte[] b = new byte[1024];
            while (-1 != inputStream.read(b,0,b.length)) {
                fos.write(b);
            }
            inputStream.close();
            fos.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
