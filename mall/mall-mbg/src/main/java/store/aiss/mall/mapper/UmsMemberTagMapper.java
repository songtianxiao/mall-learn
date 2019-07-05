package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsMemberTag;

public interface UmsMemberTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTag record);

    UmsMemberTag selectByPrimaryKey(Long id);

    List<UmsMemberTag> selectAll();

    int updateByPrimaryKey(UmsMemberTag record);
}