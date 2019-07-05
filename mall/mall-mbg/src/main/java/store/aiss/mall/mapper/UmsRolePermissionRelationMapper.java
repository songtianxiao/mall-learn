package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsRolePermissionRelation;

public interface UmsRolePermissionRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsRolePermissionRelation record);

    UmsRolePermissionRelation selectByPrimaryKey(Long id);

    List<UmsRolePermissionRelation> selectAll();

    int updateByPrimaryKey(UmsRolePermissionRelation record);
}