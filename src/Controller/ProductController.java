package Controller;

import Model.Product;
import DAO.ProductDAO;
import java.util.List;

public class ProductController {
    private ProductDAO productDAO;

    public ProductController() {
        productDAO = new ProductDAO();
    }

    // public int insertProduct(Product product) {
    //     return productDAO.insertProduct(product);
    // }

    // public boolean updateProduct(Product product) {
    //     return productDAO.updateProduct(product);
    // }

    // public boolean deleteProduct(int productId) {
    //     return productDAO.deleteProduct(productId);
    // }

    // public Product getProductById(int productId) {
    //     return productDAO.getProductById(productId);
    // }

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }
}
