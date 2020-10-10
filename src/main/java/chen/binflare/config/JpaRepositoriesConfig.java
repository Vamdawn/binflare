package chen.binflare.config;

import chen.binflare.commons.dao.BaseDaoImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        repositoryBaseClass = BaseDaoImpl.class,
        basePackages = "chen.binflare.dao"
)
public class JpaRepositoriesConfig {
}
