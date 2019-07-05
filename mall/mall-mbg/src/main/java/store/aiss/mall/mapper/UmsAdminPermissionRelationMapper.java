package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsAdminPermissionRelation;

public interface UmsAdminPermissionRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminPermissionRelation record);

    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    List<UmsAdminPermissionRelation> selectAll();

    int updateByPrimaryKey(UmsAdminPermissionRelation record);
}