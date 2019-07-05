package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsProductFullReduction;

public interface PmsProductFullReductionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductFullReduction record);

    PmsProductFullReduction selectByPrimaryKey(Long id);

    List<PmsProductFullReduction> selectAll();

    int updateByPrimaryKey(PmsProductFullReduction record);
}