package chen.binflare.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * JSON Utils
 */
public class JsonUtils {

    private JsonUtils() {
        throw new UnsupportedOperationException();
    }

    public static void printPrettyJson(Object object) {
        System.out.println(JSON.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat));
    }
}
