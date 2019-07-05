package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsMemberRuleSetting;

public interface UmsMemberRuleSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberRuleSetting record);

    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    List<UmsMemberRuleSetting> selectAll();

    int updateByPrimaryKey(UmsMemberRuleSetting record);
}