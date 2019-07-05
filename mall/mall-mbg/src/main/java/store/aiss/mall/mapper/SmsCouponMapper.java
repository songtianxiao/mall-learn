package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsCoupon;

public interface SmsCouponMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCoupon record);

    SmsCoupon selectByPrimaryKey(Long id);

    List<SmsCoupon> selectAll();

    int updateByPrimaryKey(SmsCoupon record);
}