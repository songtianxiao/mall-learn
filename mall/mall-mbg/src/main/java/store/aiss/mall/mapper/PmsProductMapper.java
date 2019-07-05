package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsProduct;

public interface PmsProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProduct record);

    PmsProduct selectByPrimaryKey(Long id);

    List<PmsProduct> selectAll();

    int updateByPrimaryKey(PmsProduct record);
}