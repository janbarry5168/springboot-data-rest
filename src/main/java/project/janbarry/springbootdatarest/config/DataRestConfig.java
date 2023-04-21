package project.janbarry.springbootdatarest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import project.janbarry.springbootdatarest.converter.SystemParamConverter;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureConversionService(ConfigurableConversionService conversionService) {
        conversionService.addConverter(new SystemParamConverter());
    }

}
