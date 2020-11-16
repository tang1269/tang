package sia.tacocloud.dao;

import org.apache.ibatis.annotations.Mapper;
import sia.tacocloud.model.Taco;

/**
 * TODO
 *
 * @ author ASUS
 * @ date 2020/9/17 22:10
 */

@Mapper
public interface TacoDao {
    public int addTaco(Taco taco);
    public Taco selectTaco(Taco taco);
}
