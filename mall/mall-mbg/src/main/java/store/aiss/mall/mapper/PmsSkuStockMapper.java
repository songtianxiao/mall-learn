package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsSkuStock;

public interface PmsSkuStockMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStock record);

    PmsSkuStock selectByPrimaryKey(Long id);

    List<PmsSkuStock> selectAll();

    int updateByPrimaryKey(PmsSkuStock record);
}