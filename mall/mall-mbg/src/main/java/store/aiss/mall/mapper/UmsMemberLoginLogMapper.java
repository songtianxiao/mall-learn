package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsMemberLoginLog;

public interface UmsMemberLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLoginLog record);

    UmsMemberLoginLog selectByPrimaryKey(Long id);

    List<UmsMemberLoginLog> selectAll();

    int updateByPrimaryKey(UmsMemberLoginLog record);
}