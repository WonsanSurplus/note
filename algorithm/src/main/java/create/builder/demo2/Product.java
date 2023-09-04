package create.builder.demo2;

import lombok.Data;

/**
 * @Date: 2023/9/4 004
 * @Author: zs
 */
@Data
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public Product(Builder builder) {
        this.partA = builder.partA;
        this.partB = builder.partB;
        this.partC = builder.partC;
    }
    
    public static class Builder{
        private String partA;
        private String partB;
        private String partC;

        public Builder partA(String partA) {
            this.partA = partA;
            return this;
        }

        public Builder partB(String partB) {
            this.partB = partB;
            return this;
        }

        public Builder partC(String partC) {
            this.partC = partC;
            return this;
        }

        public Product createProduct(){
            return new Product(this);
        }

    }

}
