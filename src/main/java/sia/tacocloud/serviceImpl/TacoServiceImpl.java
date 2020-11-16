package sia.tacocloud.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sia.tacocloud.dao.TacoDao;
import sia.tacocloud.model.Taco;
import sia.tacocloud.service.TacoService;

/**
 * TODO
 *
 * @ author ASUS
 * @ date 2020/9/16 21:17
 */

@Service
public class TacoServiceImpl  implements TacoService {
    @Autowired
    private TacoDao tacoDao;
    @Override
    public void addTaco(Taco taco) {

    }
}
