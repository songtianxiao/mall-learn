package store.aiss.mall.mapper;

import java.util.List;
import store.aiss.mall.model.PmsAlbum;

public interface PmsAlbumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbum record);

    PmsAlbum selectByPrimaryKey(Long id);

    List<PmsAlbum> selectAll();

    int updateByPrimaryKey(PmsAlbum record);
}