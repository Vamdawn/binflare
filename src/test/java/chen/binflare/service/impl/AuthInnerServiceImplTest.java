package chen.binflare.service.impl;

import chen.binflare.service.AuthInnerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class AuthInnerServiceImplTest {

    @Autowired
    private AuthInnerService authInnerService;

    @Test
    @Rollback
    void refreshLoginKey() {
        assertTrue(authInnerService.refreshLoginKey());
    }
}