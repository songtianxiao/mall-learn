package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsCommentReplay;

public interface PmsCommentReplayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReplay record);

    PmsCommentReplay selectByPrimaryKey(Long id);

    List<PmsCommentReplay> selectAll();

    int updateByPrimaryKey(PmsCommentReplay record);
}