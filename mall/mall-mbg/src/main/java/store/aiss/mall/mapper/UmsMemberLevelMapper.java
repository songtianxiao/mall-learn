package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsMemberLevel;

public interface UmsMemberLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    List<UmsMemberLevel> selectAll();

    int updateByPrimaryKey(UmsMemberLevel record);
}