package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsProductVertifyRecord;

public interface PmsProductVertifyRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductVertifyRecord record);

    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    List<PmsProductVertifyRecord> selectAll();

    int updateByPrimaryKey(PmsProductVertifyRecord record);
}