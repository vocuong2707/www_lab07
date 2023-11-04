package vn.edu.iuh.fit.vocuong_20002345.Backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.vocuong_20002345.Backend.Repositories.ProductRepository;
import vn.edu.iuh.fit.vocuong_20002345.Backend.models.Product;

import java.util.List;

@Service
public class ProductServices  {
    @Autowired
    private ProductRepository productRepository;
    public Page<Product> findPaginated(int pageNo , int pageSize,String sortBy, String sortDerection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDerection),sortBy);
        Pageable pageable = PageRequest.of(pageNo,pageSize,sort);
        return productRepository.findAll(pageable);
    }

}
