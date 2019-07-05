package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsFlashPromotionSession;

public interface SmsFlashPromotionSessionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionSession record);

    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    List<SmsFlashPromotionSession> selectAll();

    int updateByPrimaryKey(SmsFlashPromotionSession record);
}