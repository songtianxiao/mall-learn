package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsFeightTemplate;

public interface PmsFeightTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsFeightTemplate record);

    PmsFeightTemplate selectByPrimaryKey(Long id);

    List<PmsFeightTemplate> selectAll();

    int updateByPrimaryKey(PmsFeightTemplate record);
}