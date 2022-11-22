package eclipsegradleboot.service;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eclipsegradleboot.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

    private final KieSession kSession;

    @Autowired
    public ProductServiceImpl(KieSession kSession){
        this.kSession = kSession;
    }

    @Override
    public void applyDiscount(Product product) {
        kSession.insert(product);
        kSession.fireAllRules();
    }
}
