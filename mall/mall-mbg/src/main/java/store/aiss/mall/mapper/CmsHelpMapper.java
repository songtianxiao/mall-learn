package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsHelp;

public interface CmsHelpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsHelp record);

    CmsHelp selectByPrimaryKey(Long id);

    List<CmsHelp> selectAll();

    int updateByPrimaryKey(CmsHelp record);
}