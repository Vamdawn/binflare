package chen.binflare.config;

import chen.binflare.dao.BaseRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        repositoryBaseClass = BaseRepositoryImpl.class,
        basePackages = "chen.binflare.dao"
)
public class JpaRepositoriesConfig {
}
