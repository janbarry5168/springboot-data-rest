package project.janbarry.springbootdatarest.converter;

import org.springframework.core.convert.converter.Converter;
import project.janbarry.springbootdatarest.entity.SystemParamEntityPk;

public class SystemParamConverter implements Converter<String, SystemParamEntityPk> {
    @Override
    public SystemParamEntityPk convert(String source) {
        String[] pk = source.split("_");
        return new SystemParamEntityPk(pk[0], pk[1]);
    }

}
