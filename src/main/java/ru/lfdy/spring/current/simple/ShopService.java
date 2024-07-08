package ru.lfdy.spring.current.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShopService {

//    private ProductService productService;
//    @Autowired
//    public void setProductService(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @Autowired
//    MailService mailService;
//   @Autowired
//    OrderService orderService;


//private ProductService productService;
//private MailService mailService;
//private OrderService orderService;
////@Autowired
//    public ShopService(ProductService productService, MailService mailService, OrderService orderService) {
//        this.productService = productService;
//        this.mailService = mailService;
//        this.orderService = orderService;
//    }
private ProductService productService;
private MailService mailService;
private OrderService orderService;

private BeanInterface beanInterface;
@Autowired
@Qualifier("advBeanInterfaceImp")
//@Qualifier("beanInterfaceImp")
    public void setBeanInterface(BeanInterface beanInterface) {
        this.beanInterface = beanInterface;
    }

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
@Autowired
    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }
@Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
//@Autowired
//    public ShopService(ProductService productService, MailService mailService, OrderService orderService,BeanInterfaceImp beanInterface) {
//        this.productService = productService;
//        this.mailService = mailService;
//        this.orderService = orderService;
//        this.beanInterface = beanInterface;
//    }

    public void buy(){
productService.getProducts();
mailService.sendMail();
orderService.createOrder();
beanInterface.doSomething();
    }
}
