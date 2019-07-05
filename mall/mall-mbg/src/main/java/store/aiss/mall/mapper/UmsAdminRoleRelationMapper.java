package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsAdminRoleRelation;

public interface UmsAdminRoleRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRoleRelation record);

    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    List<UmsAdminRoleRelation> selectAll();

    int updateByPrimaryKey(UmsAdminRoleRelation record);
}