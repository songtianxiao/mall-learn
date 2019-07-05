package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsProductAttributeValue;

public interface PmsProductAttributeValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeValue record);

    PmsProductAttributeValue selectByPrimaryKey(Long id);

    List<PmsProductAttributeValue> selectAll();

    int updateByPrimaryKey(PmsProductAttributeValue record);
}