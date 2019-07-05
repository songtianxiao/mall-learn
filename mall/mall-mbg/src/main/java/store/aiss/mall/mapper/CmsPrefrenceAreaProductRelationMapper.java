package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsPrefrenceAreaProductRelation;

public interface CmsPrefrenceAreaProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceAreaProductRelation record);

    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    List<CmsPrefrenceAreaProductRelation> selectAll();

    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);
}