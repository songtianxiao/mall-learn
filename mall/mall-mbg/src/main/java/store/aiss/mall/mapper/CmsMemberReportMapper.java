package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsMemberReport;

public interface CmsMemberReportMapper {
    int insert(CmsMemberReport record);

    List<CmsMemberReport> selectAll();
}