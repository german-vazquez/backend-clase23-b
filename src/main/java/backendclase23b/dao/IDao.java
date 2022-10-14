package backendclase23b.dao;

import java.util.List;

public interface IDao<T> {
    T guardar (T t) throws Exception;
    T buscar (Integer id);
    T buscarXEmail (String email);
    List<T> buscarTodos();
}
