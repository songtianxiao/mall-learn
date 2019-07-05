package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsHomeRecommendProduct;

public interface SmsHomeRecommendProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendProduct record);

    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    List<SmsHomeRecommendProduct> selectAll();

    int updateByPrimaryKey(SmsHomeRecommendProduct record);
}