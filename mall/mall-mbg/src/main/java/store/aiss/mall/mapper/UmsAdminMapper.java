package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsAdmin;

public interface UmsAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    List<UmsAdmin> selectAll();

    int updateByPrimaryKey(UmsAdmin record);
}