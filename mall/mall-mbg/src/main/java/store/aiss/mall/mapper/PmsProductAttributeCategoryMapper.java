package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsProductAttributeCategory;

public interface PmsProductAttributeCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeCategory record);

    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    List<PmsProductAttributeCategory> selectAll();

    int updateByPrimaryKey(PmsProductAttributeCategory record);
}