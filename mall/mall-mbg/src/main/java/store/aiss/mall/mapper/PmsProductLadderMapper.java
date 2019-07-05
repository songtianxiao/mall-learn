package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsProductLadder;

public interface PmsProductLadderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductLadder record);

    PmsProductLadder selectByPrimaryKey(Long id);

    List<PmsProductLadder> selectAll();

    int updateByPrimaryKey(PmsProductLadder record);
}