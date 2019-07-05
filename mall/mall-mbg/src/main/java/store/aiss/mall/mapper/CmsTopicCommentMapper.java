package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsTopicComment;

public interface CmsTopicCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicComment record);

    CmsTopicComment selectByPrimaryKey(Long id);

    List<CmsTopicComment> selectAll();

    int updateByPrimaryKey(CmsTopicComment record);
}