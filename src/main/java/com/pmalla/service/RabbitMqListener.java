/**
 * 
 */
package com.pmalla.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author m_833729
 *
 */
@Component
public class RabbitMqListener {

    @RabbitListener(queues="eapi")
    public void listen(byte[] message) {
        String msg = new String(message);
        
        System.out.println(msg);
    }
}
