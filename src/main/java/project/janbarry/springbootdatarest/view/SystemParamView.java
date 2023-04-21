package project.janbarry.springbootdatarest.view;

import org.springframework.data.rest.core.config.Projection;
import project.janbarry.springbootdatarest.entity.SystemParamEntity;
import project.janbarry.springbootdatarest.entity.SystemParamEntityPk;

@Projection(types = SystemParamEntity.class)
public interface SystemParamView {

    SystemParamEntityPk getSystemParamEntityPk();

    String getParamValue();

    String getParamMemo();

}
