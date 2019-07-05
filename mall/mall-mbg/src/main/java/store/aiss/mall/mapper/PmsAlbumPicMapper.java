package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsAlbumPic;

public interface PmsAlbumPicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbumPic record);

    PmsAlbumPic selectByPrimaryKey(Long id);

    List<PmsAlbumPic> selectAll();

    int updateByPrimaryKey(PmsAlbumPic record);
}