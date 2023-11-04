package vn.edu.iuh.fit.vocuong_20002345.Backend.pks;

import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.vocuong_20002345.Backend.models.Order;
import vn.edu.iuh.fit.vocuong_20002345.Backend.models.Product;

import java.io.Serializable;

@Setter @Getter
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
