package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsProductAttribute;

public interface PmsProductAttributeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttribute record);

    PmsProductAttribute selectByPrimaryKey(Long id);

    List<PmsProductAttribute> selectAll();

    int updateByPrimaryKey(PmsProductAttribute record);
}