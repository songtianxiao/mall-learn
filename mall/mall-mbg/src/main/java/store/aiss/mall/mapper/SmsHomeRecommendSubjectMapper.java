package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsHomeRecommendSubject;

public interface SmsHomeRecommendSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendSubject record);

    SmsHomeRecommendSubject selectByPrimaryKey(Long id);

    List<SmsHomeRecommendSubject> selectAll();

    int updateByPrimaryKey(SmsHomeRecommendSubject record);
}