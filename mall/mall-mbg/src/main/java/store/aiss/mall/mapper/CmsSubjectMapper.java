package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.CmsSubject;

public interface CmsSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubject record);

    CmsSubject selectByPrimaryKey(Long id);

    List<CmsSubject> selectAll();

    int updateByPrimaryKey(CmsSubject record);
}