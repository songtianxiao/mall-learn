package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsHomeNewProduct;

public interface SmsHomeNewProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeNewProduct record);

    SmsHomeNewProduct selectByPrimaryKey(Long id);

    List<SmsHomeNewProduct> selectAll();

    int updateByPrimaryKey(SmsHomeNewProduct record);
}