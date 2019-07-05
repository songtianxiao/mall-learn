package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsMemberPrice;

public interface PmsMemberPriceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsMemberPrice record);

    PmsMemberPrice selectByPrimaryKey(Long id);

    List<PmsMemberPrice> selectAll();

    int updateByPrimaryKey(PmsMemberPrice record);
}