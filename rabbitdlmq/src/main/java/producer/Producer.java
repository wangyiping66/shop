package producer;


import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;



public class Producer {


    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        /*
        1:创建连接工厂，同时设置用户名和密码
        2：设置主机地址
        3：建立到代理服务器到连接
        4：连接建立之后，获取信道
        5：设置队列
        5：声明交换器
         */
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("guest");
        factory.setPassword("guest");
        //建立连接
        Connection connection = factory.newConnection();
        //声明信道
        Channel channel = connection.createChannel();
        channel.confirmSelect();
        //创建交换机
        channel.exchangeDeclare("wp2","fanout",false);
        //创建对列
        channel.queueDeclare("队列名称1",false,false,false,null);
        //绑定
        channel.queueBind("队列名称1","wp2","routingKey",null);
        byte[] messageBodyBytes = "quit".getBytes();
        channel.basicPublish("wp2", "routingKey", null, messageBodyBytes);

        if(!channel.waitForConfirms())
            System.out.println("failed");
        channel.close();
        connection.close();
    }
}
