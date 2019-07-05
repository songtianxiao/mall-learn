package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsProductCategoryAttributeRelation;

public interface PmsProductCategoryAttributeRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategoryAttributeRelation record);

    PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    List<PmsProductCategoryAttributeRelation> selectAll();

    int updateByPrimaryKey(PmsProductCategoryAttributeRelation record);
}