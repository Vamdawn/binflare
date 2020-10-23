package chen.binflare.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class OpenApiServiceTest {

    @Autowired
    private OpenApiService openApiService;

    @Test
    @Transactional
    void recordBingTest() {
        assertDoesNotThrow(() -> openApiService.recordDailyBingImage());
    }
}