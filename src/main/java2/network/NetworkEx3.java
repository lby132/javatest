package main.java2.network;

import java.net.*;

public class NetworkEx3 {
    public static void main(String[] args) {
        URL url = null;
        //String address = "http://www.codechobo.com/smple/hello.html";
        String address = "http://www.codechobo.com";

        try {
            url = new URL(address);
            final URLConnection conn = url.openConnection();

            System.out.println("conn.toString():"+conn);
            System.out.println("getAllowUserInteraction():"+conn.getAllowUserInteraction());
            System.out.println("getConnectionTimeout():"+conn.getConnectTimeout());
            System.out.println("getContent():"+conn.getContent());
            System.out.println("getContentEncoding():"+conn.getContentEncoding());
            System.out.println("getContentLength():"+conn.getContentLength());
            System.out.println("getContentType():"+conn.getContentType());
            System.out.println("getDate():"+conn.getDate());
            System.out.println("getDefaultAllowUserInteraction():"+conn.getDefaultAllowUserInteraction());
            System.out.println("getDefaultUseCaches():"+conn.getDefaultUseCaches());
            System.out.println("getDoInput():"+conn.getDoInput());
            System.out.println("getDoOutput():"+conn.getDoOutput());
            System.out.println("getExpiration():"+conn.getExpiration());
            System.out.println("getHeaderFields():"+conn.getHeaderFields());
            System.out.println("getIfModifiedSince():"+conn.getIfModifiedSince());
            System.out.println("getReadTimeout():"+conn.getReadTimeout());
            System.out.println("getURL():"+conn.getURL());
            System.out.println("getUseCaches():"+conn.getUseCaches());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
