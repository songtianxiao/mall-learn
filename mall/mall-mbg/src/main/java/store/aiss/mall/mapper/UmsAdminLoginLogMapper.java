package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsAdminLoginLog;

public interface UmsAdminLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminLoginLog record);

    UmsAdminLoginLog selectByPrimaryKey(Long id);

    List<UmsAdminLoginLog> selectAll();

    int updateByPrimaryKey(UmsAdminLoginLog record);
}