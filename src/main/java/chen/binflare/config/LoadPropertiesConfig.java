package chen.binflare.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:thirdparty.properties")
public class LoadPropertiesConfig {
}
