package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.OmsOrderSetting;

public interface OmsOrderSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderSetting record);

    OmsOrderSetting selectByPrimaryKey(Long id);

    List<OmsOrderSetting> selectAll();

    int updateByPrimaryKey(OmsOrderSetting record);
}