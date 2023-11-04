package vn.edu.iuh.fit.vocuong_20002345.Frontend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.vocuong_20002345.Backend.Repositories.ProductRepository;
import vn.edu.iuh.fit.vocuong_20002345.Backend.services.ProductServices;

import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private ProductServices productServices;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public String showProductPage(Model model , @RequestParam("page")Optional<Integer> page,
                                                @RequestParam("size")Optional<Integer> size){
        model.addAttribute("page",123);
        return "admin/product/admin-page";
    }
}
