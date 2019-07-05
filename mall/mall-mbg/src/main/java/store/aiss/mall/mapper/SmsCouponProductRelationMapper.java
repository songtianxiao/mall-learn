package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsCouponProductRelation;

public interface SmsCouponProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductRelation record);

    SmsCouponProductRelation selectByPrimaryKey(Long id);

    List<SmsCouponProductRelation> selectAll();

    int updateByPrimaryKey(SmsCouponProductRelation record);
}