package chen.binflare.util;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Map;

class TestUtilsUnitTest {

    @Test
    void printPrettyJson() {
        Map<String, Object> m = Maps.newHashMap();
        m.put("a", null);
        m.put("b", 1);
        m.put("c", ImmutableMap.of("k", "v"));
        m.put("d", Lists.newArrayList());
        m.put("e", Instant.now());
        UnitTestUtils.printJson(m);
    }
}