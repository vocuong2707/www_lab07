package vn.edu.iuh.fit.vocuong_20002345;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.vocuong_20002345.Backend.Repositories.ProductRepository;
import vn.edu.iuh.fit.vocuong_20002345.Backend.enums.ProductStatus;
import vn.edu.iuh.fit.vocuong_20002345.Backend.models.Product;
import vn.edu.iuh.fit.vocuong_20002345.Backend.services.ProductServices;

import java.util.Random;

@SpringBootApplication
public class VoCuong20002345Application {

    public static void main(String[] args) {
        SpringApplication.run(VoCuong20002345Application.class, args);
    }
    @Autowired
    private ProductRepository productRepository;
//    @Bean
//    CommandLineRunner createSampleProduct() {
//        return args-> {
//            Faker faker = new Faker();
//            for (int i = 0; i < 200; i++) {
//                Product product = new Product(faker.name().fullName(), faker.lorem().paragraph(30), "piece", faker.name().bloodGroup(), ProductStatus.IN_ACTIVE);
//                productRepository.save(product);
//            }
//        };
//    }
}
