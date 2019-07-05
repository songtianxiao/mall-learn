package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsTopic;

public interface CmsTopicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopic record);

    CmsTopic selectByPrimaryKey(Long id);

    List<CmsTopic> selectAll();

    int updateByPrimaryKey(CmsTopic record);
}