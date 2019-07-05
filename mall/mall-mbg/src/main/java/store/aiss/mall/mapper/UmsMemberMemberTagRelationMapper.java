package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsMemberMemberTagRelation;

public interface UmsMemberMemberTagRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberMemberTagRelation record);

    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    List<UmsMemberMemberTagRelation> selectAll();

    int updateByPrimaryKey(UmsMemberMemberTagRelation record);
}