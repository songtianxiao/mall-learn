package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsProductOperateLog;

public interface PmsProductOperateLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductOperateLog record);

    PmsProductOperateLog selectByPrimaryKey(Long id);

    List<PmsProductOperateLog> selectAll();

    int updateByPrimaryKey(PmsProductOperateLog record);
}