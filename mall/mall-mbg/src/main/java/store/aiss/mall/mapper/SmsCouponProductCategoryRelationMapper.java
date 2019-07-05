package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsCouponProductCategoryRelation;

public interface SmsCouponProductCategoryRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductCategoryRelation record);

    SmsCouponProductCategoryRelation selectByPrimaryKey(Long id);

    List<SmsCouponProductCategoryRelation> selectAll();

    int updateByPrimaryKey(SmsCouponProductCategoryRelation record);
}