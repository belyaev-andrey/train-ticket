package cancel.config;

import org.springframework.boot.restclient.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 * HTTP client for calls outside the cluster.
 */
@Configuration
public class HttpClientConfig {

    @Bean
    @Primary
    public RestTemplate plainRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
