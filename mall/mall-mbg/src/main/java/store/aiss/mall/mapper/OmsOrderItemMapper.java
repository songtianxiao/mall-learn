package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.OmsOrderItem;

public interface OmsOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    OmsOrderItem selectByPrimaryKey(Long id);

    List<OmsOrderItem> selectAll();

    int updateByPrimaryKey(OmsOrderItem record);
}