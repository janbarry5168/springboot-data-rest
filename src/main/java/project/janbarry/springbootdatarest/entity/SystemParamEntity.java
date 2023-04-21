package project.janbarry.springbootdatarest.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SYSTEM_PARAM")
public class SystemParamEntity {

    @EmbeddedId
    private SystemParamEntityPk systemParamEntityPk;

    @Basic
    @Column(name = "PARAM_VALUE", length = 512)
    private String paramValue;

    @Basic
    @Column(name = "PARAM_MEMO", length = 256)
    private String paramMemo;

}
