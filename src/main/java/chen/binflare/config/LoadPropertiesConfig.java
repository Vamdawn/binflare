package chen.binflare.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:thirdparty.properties")
@PropertySource("classpath:logging.properties")
public class LoadPropertiesConfig {
}
