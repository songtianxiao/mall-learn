package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsFlashPromotion;

public interface SmsFlashPromotionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotion record);

    SmsFlashPromotion selectByPrimaryKey(Long id);

    List<SmsFlashPromotion> selectAll();

    int updateByPrimaryKey(SmsFlashPromotion record);
}