package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsFlashPromotionLog;

public interface SmsFlashPromotionLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotionLog record);

    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    List<SmsFlashPromotionLog> selectAll();

    int updateByPrimaryKey(SmsFlashPromotionLog record);
}