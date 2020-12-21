package chen.binflare.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "chen.binflare.dao")
public class JpaRepositoriesConfig {
}
