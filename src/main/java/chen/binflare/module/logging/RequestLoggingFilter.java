package chen.binflare.module.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

import javax.annotation.Nonnull;
import javax.servlet.http.HttpServletRequest;

@Slf4j
public class RequestLoggingFilter extends AbstractRequestLoggingFilter {

    /**
     * Concrete subclasses should implement this method to write a log message
     * <i>before</i> the request is processed.
     *
     * @param request current HTTP request
     * @param message the message to log
     */
    @Override
    protected void beforeRequest(@Nonnull HttpServletRequest request, @Nonnull String message) {
        log.info(message);
    }

    /**
     * Concrete subclasses should implement this method to write a log message
     * <i>after</i> the request is processed.
     *
     * @param request current HTTP request
     * @param message the message to log
     */
    @Override
    protected void afterRequest(@Nonnull HttpServletRequest request, @Nonnull String message) {
        log.info(message);
    }
}
