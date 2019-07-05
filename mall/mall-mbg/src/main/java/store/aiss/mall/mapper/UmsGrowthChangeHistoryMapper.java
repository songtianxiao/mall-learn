package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsGrowthChangeHistory;

public interface UmsGrowthChangeHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsGrowthChangeHistory record);

    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    List<UmsGrowthChangeHistory> selectAll();

    int updateByPrimaryKey(UmsGrowthChangeHistory record);
}