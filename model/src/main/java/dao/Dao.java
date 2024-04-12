package dao;

import java.util.List;
import java.util.Optional;

public interface Dao <E,ID>{
    Optional<E> findById(ID id);
    List<E> findAll();
}
