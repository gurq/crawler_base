package ci.xu.crawlerbase;

import ci.xu.crawlerbase.framework.repository.impl.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
@SpringBootApplication
public class CrawlerBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerBaseApplication.class, args);
    }

}
