package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsHelpCategory;

public interface CmsHelpCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsHelpCategory record);

    CmsHelpCategory selectByPrimaryKey(Long id);

    List<CmsHelpCategory> selectAll();

    int updateByPrimaryKey(CmsHelpCategory record);
}