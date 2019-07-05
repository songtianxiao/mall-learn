package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsBrand;

public interface PmsBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    List<PmsBrand> selectAll();

    int updateByPrimaryKey(PmsBrand record);
}