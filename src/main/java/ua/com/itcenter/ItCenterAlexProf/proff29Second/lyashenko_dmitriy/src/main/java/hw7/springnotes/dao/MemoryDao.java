package hw7.springnotes.dao;



import hw7.springnotes.domain.Memory;

import java.util.List;

/**
 * Created by Admin on 17.02.2016.
 */
public interface MemoryDao {
    Long create(Memory memory);
    Memory read(Long id);
    boolean update(Memory memory);
    boolean delete(Memory memory);
    List findAll();

}
