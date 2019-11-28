package web.dao;
import java.util.List;
public interface IGenericDao<T> {

    void insert();
    void update();

    List<T> getAll();

}
