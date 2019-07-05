package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsSubjectComment;

public interface CmsSubjectCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectComment record);

    CmsSubjectComment selectByPrimaryKey(Long id);

    List<CmsSubjectComment> selectAll();

    int updateByPrimaryKey(CmsSubjectComment record);
}