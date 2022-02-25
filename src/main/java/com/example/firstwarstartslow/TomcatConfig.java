package com.example.firstwarstartslow;

import org.apache.catalina.webresources.ExtractingRoot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfig {

    private static final Logger logger = LoggerFactory.getLogger(TomcatConfig.class);

    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> servletContainerCustomizer() {
        return new WebServerFactoryCustomizer<TomcatServletWebServerFactory>() {
            @Override
            public void customize(TomcatServletWebServerFactory container) {
                container.addContextCustomizers(
                        cntxt -> {
                            /* disable/enable next line to test first access performances */
//                            cntxt.setResources(new ExtractingRoot());
                        }
                );
            }
        };
    }

}