package chen.binflare.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * Test Utils
 */
public class UnitTestUtils {

    private UnitTestUtils() {
        throw new UnsupportedOperationException();
    }

    public static void printJson(Object object) {
        System.out.println(JSON.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat));
    }
}
