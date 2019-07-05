package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsCouponHistory;

public interface SmsCouponHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponHistory record);

    SmsCouponHistory selectByPrimaryKey(Long id);

    List<SmsCouponHistory> selectAll();

    int updateByPrimaryKey(SmsCouponHistory record);
}