package project.janbarry.springbootdatarest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SystemParamEntityPk implements Serializable {
    @NonNull
    @Column(name = "PARAM_CATEGORY", nullable = false, length = 16)
    private String paramCategory;

    @NonNull
    @Column(name = "PARAM_KEY", nullable = false, length = 64)
    private String paramKey;

}
