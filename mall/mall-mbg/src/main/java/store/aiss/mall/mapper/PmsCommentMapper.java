package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsComment;

public interface PmsCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsComment record);

    PmsComment selectByPrimaryKey(Long id);

    List<PmsComment> selectAll();

    int updateByPrimaryKey(PmsComment record);
}