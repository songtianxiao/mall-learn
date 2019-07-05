package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsProductCategory;

public interface PmsProductCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategory record);

    PmsProductCategory selectByPrimaryKey(Long id);

    List<PmsProductCategory> selectAll();

    int updateByPrimaryKey(PmsProductCategory record);
}