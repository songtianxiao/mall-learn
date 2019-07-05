package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsSubjectCategory;

public interface CmsSubjectCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectCategory record);

    CmsSubjectCategory selectByPrimaryKey(Long id);

    List<CmsSubjectCategory> selectAll();

    int updateByPrimaryKey(CmsSubjectCategory record);
}