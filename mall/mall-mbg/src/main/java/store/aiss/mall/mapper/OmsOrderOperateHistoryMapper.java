package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.OmsOrderOperateHistory;

public interface OmsOrderOperateHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderOperateHistory record);

    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    List<OmsOrderOperateHistory> selectAll();

    int updateByPrimaryKey(OmsOrderOperateHistory record);
}