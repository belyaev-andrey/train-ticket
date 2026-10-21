package consign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tools.jackson.databind.json.JsonMapper;

/**
 * JSON mapper shared by the consign service.
 */
@Configuration
public class JsonConfig {

    @Bean
    public JsonMapper jsonMapper() {
        return JsonMapper.builder().findAndAddModules().build();
    }
}
