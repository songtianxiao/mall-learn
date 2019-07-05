package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.UmsMemberReceiveAddress;

public interface UmsMemberReceiveAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    List<UmsMemberReceiveAddress> selectAll();

    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}