package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsMember;

public interface UmsMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    List<UmsMember> selectAll();

    int updateByPrimaryKey(UmsMember record);
}