package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsHomeAdvertise;

public interface SmsHomeAdvertiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeAdvertise record);

    SmsHomeAdvertise selectByPrimaryKey(Long id);

    List<SmsHomeAdvertise> selectAll();

    int updateByPrimaryKey(SmsHomeAdvertise record);
}