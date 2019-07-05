package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsMemberTask;

public interface UmsMemberTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTask record);

    UmsMemberTask selectByPrimaryKey(Long id);

    List<UmsMemberTask> selectAll();

    int updateByPrimaryKey(UmsMemberTask record);
}