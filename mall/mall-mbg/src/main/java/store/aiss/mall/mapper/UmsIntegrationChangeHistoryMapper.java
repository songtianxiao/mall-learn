package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsIntegrationChangeHistory;

public interface UmsIntegrationChangeHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationChangeHistory record);

    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    List<UmsIntegrationChangeHistory> selectAll();

    int updateByPrimaryKey(UmsIntegrationChangeHistory record);
}