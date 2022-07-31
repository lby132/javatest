package main.java1.variable;

public class ProductTest {
    public static void main(String[] args) {
        final Product product1 = new Product();
        final Product product2 = new Product();
        final Product product3 = new Product();

        System.out.println("p1의 제품번호(serialNo) = " + product1.serialNo);
        System.out.println("p2의 제품번호(serialNo) = " + product2.serialNo);
        System.out.println("p3의 제품번호(serialNo) = " + product3.serialNo);
        System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
    }
}
