package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsMemberStatisticsInfo;

public interface UmsMemberStatisticsInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberStatisticsInfo record);

    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    List<UmsMemberStatisticsInfo> selectAll();

    int updateByPrimaryKey(UmsMemberStatisticsInfo record);
}