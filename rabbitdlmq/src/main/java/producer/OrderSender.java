package producer;


import entity.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.UUID;


public class OrderSender {


    public static void main(String[] args){
        OrderSender orderSender = new OrderSender();
        Order order1 = new Order();
        order1.setId("11");
        order1.setName("王平");
        order1.setMessageId(System.currentTimeMillis()+"--"+ UUID.randomUUID().toString());
        System.out.println(order1);
        orderSender.sendOrder(order1);
    }


    @Autowired
    private RabbitTemplate rabbitTemplate;

    private void sendOrder(Order order){

        CorrelationData correlationData = new CorrelationData(); //消息唯一id

        rabbitTemplate.convertAndSend("order-exchange","order-abc",order,correlationData);


    }
}
