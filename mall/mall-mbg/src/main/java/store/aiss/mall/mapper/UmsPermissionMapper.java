package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsPermission;

public interface UmsPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsPermission record);

    UmsPermission selectByPrimaryKey(Long id);

    List<UmsPermission> selectAll();

    int updateByPrimaryKey(UmsPermission record);
}