package chen.binflare.util;

import okhttp3.OkHttpClient;

/**
 * okhttp3 工具封装
 */
public class HttpUtils {

    public static final OkHttpClient CLIENT = new OkHttpClient();

    public static final String GET = "GET";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final String PATCH = "PATCH";
    public static final String DELETE = "DELETE";
    public static final String OPTION = "OPTION";
}
