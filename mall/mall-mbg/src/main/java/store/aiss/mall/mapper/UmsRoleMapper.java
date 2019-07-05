package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsRole;

public interface UmsRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsRole record);

    UmsRole selectByPrimaryKey(Long id);

    List<UmsRole> selectAll();

    int updateByPrimaryKey(UmsRole record);
}