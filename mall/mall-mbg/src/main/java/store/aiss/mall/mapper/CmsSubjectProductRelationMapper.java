package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsSubjectProductRelation;

public interface CmsSubjectProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectProductRelation record);

    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    List<CmsSubjectProductRelation> selectAll();

    int updateByPrimaryKey(CmsSubjectProductRelation record);
}