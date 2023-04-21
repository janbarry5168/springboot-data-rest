package project.janbarry.springbootdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import project.janbarry.springbootdatarest.entity.SystemParamEntity;
import project.janbarry.springbootdatarest.entity.SystemParamEntityPk;
import project.janbarry.springbootdatarest.view.SystemParamView;

@RepositoryRestResource(excerptProjection = SystemParamView.class)
public interface SystemParamRepository extends JpaRepository<SystemParamEntity, SystemParamEntityPk> {
}
