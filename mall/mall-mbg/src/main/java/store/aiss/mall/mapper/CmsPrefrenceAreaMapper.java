package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsPrefrenceArea;

public interface CmsPrefrenceAreaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceArea record);

    CmsPrefrenceArea selectByPrimaryKey(Long id);

    List<CmsPrefrenceArea> selectAll();

    int updateByPrimaryKey(CmsPrefrenceArea record);
}