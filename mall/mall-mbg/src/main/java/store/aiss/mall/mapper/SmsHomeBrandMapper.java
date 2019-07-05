package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsHomeBrand;

public interface SmsHomeBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeBrand record);

    SmsHomeBrand selectByPrimaryKey(Long id);

    List<SmsHomeBrand> selectAll();

    int updateByPrimaryKey(SmsHomeBrand record);
}