package chen.binflare.config;

import chen.binflare.common.logging.RequestLoggingFilter;
import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.List;

@Configuration
public class RequestLoggingConfig {

    private static final int DEFAULT_MAX_PAYLOAD_LENGTH = 64000;

    private static final String TRUE = "true";

    private static final String LOGGING_REQUEST_QUERY_INCLUDE = "logging.request.query.include";
    private static final String LOGGING_REQUEST_CLIENT_INCLUDE = "logging.request.client.include";
    private static final String LOGGING_REQUEST_HEADERS_INCLUDE = "logging.request.headers.include";
    private static final String LOGGING_REQUEST_PAYLOAD_INCLUDE = "logging.request.payload.include";
    private static final String LOGGING_REQUEST_PAYLOAD_MAX_LENGTH = "logging.request.payload.length.max";

    private static final List<String> LOGGING_PROP_KEYS = ImmutableList.of(
            LOGGING_REQUEST_QUERY_INCLUDE,
            LOGGING_REQUEST_CLIENT_INCLUDE,
            LOGGING_REQUEST_HEADERS_INCLUDE,
            LOGGING_REQUEST_PAYLOAD_INCLUDE,
            LOGGING_REQUEST_PAYLOAD_MAX_LENGTH
    );

    @Autowired
    private Environment env;

    @Bean
    public RequestLoggingFilter requestLoggingFilter() {
        RequestLoggingFilter filter = new RequestLoggingFilter();
        LOGGING_PROP_KEYS.forEach(k -> updateFilterProps(filter, k));
        return filter;
    }

    private void updateFilterProps(RequestLoggingFilter filter, String key) {
        String val = env.getProperty(key, "");
        switch (key) {
            case LOGGING_REQUEST_QUERY_INCLUDE:
                filter.setIncludeQueryString(TRUE.equals(val));
                break;
            case LOGGING_REQUEST_CLIENT_INCLUDE:
                filter.setIncludeClientInfo(TRUE.equals(val));
                break;
            case LOGGING_REQUEST_HEADERS_INCLUDE:
                filter.setIncludeHeaders(TRUE.equals(val));
                break;
            case LOGGING_REQUEST_PAYLOAD_INCLUDE:
                filter.setIncludePayload(TRUE.equals(val));
                break;
            case LOGGING_REQUEST_PAYLOAD_MAX_LENGTH:
                int maxPayloadLength = DEFAULT_MAX_PAYLOAD_LENGTH;
                try {
                    maxPayloadLength = Integer.parseInt(val);
                } catch (Exception ignored) {
                }
                filter.setMaxPayloadLength(maxPayloadLength);
                break;
            default:
                break;
        }
    }
}
