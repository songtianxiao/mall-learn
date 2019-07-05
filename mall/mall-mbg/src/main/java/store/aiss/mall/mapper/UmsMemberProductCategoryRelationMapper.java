package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsMemberProductCategoryRelation;

public interface UmsMemberProductCategoryRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberProductCategoryRelation record);

    UmsMemberProductCategoryRelation selectByPrimaryKey(Long id);

    List<UmsMemberProductCategoryRelation> selectAll();

    int updateByPrimaryKey(UmsMemberProductCategoryRelation record);
}