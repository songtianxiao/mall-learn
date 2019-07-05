package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsIntegrationConsumeSetting;

public interface UmsIntegrationConsumeSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationConsumeSetting record);

    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    List<UmsIntegrationConsumeSetting> selectAll();

    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);
}