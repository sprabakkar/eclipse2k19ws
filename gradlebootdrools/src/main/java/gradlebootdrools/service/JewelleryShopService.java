package gradlebootdrools.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gradlebootdrools.model.Product;

@Service
public class JewelleryShopService {
	private final KieContainer kieContainer;

	@Autowired
	public JewelleryShopService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Product getProductDiscount(Product product) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(product);
		System.out.println("Product type ::: "+product.getType());
		System.out.println("Product discount ::: "+product.getDiscount());
		kieSession.fireAllRules();
		kieSession.dispose();
		return product;
	}
}
