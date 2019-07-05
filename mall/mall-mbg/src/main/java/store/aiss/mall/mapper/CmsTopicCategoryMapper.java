package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsTopicCategory;

public interface CmsTopicCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicCategory record);

    CmsTopicCategory selectByPrimaryKey(Long id);

    List<CmsTopicCategory> selectAll();

    int updateByPrimaryKey(CmsTopicCategory record);
}