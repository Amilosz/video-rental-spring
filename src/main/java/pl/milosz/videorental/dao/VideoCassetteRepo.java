package pl.milosz.videorental.dao;

import org.springframework.data.repository.CrudRepository;
import pl.milosz.videorental.dao.entity.VideoCassette;

public interface VideoCassetteRepo extends CrudRepository<VideoCassette, Long> {
}
