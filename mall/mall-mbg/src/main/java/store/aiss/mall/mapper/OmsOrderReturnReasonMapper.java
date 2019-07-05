package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.OmsOrderReturnReason;

public interface OmsOrderReturnReasonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnReason record);

    OmsOrderReturnReason selectByPrimaryKey(Long id);

    List<OmsOrderReturnReason> selectAll();

    int updateByPrimaryKey(OmsOrderReturnReason record);
}