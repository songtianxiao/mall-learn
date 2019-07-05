package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.OmsOrderReturnApply;

public interface OmsOrderReturnApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnApply record);

    OmsOrderReturnApply selectByPrimaryKey(Long id);

    List<OmsOrderReturnApply> selectAll();

    int updateByPrimaryKey(OmsOrderReturnApply record);
}