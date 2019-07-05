package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.SmsFlashPromotionProductRelation;

public interface SmsFlashPromotionProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionProductRelation record);

    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    List<SmsFlashPromotionProductRelation> selectAll();

    int updateByPrimaryKey(SmsFlashPromotionProductRelation record);
}