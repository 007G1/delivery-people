package deliverypeople.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import deliverypeople.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import deliverypeople.domain.*;


@Service
@Transactional
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Startcook'")
    public void wheneverStartcook_State(@Payload Startcook startcook){

        Startcook event = startcook;
        System.out.println("\n\n##### listener State : " + startcook + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Endcook'")
    public void wheneverEndcook_State(@Payload Endcook endcook){

        Endcook event = endcook;
        System.out.println("\n\n##### listener State : " + endcook + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Picked'")
    public void wheneverPicked_State(@Payload Picked picked){

        Picked event = picked;
        System.out.println("\n\n##### listener State : " + picked + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Startdelivery'")
    public void wheneverStartdelivery_State(@Payload Startdelivery startdelivery){

        Startdelivery event = startdelivery;
        System.out.println("\n\n##### listener State : " + startdelivery + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderChecked'")
    public void wheneverOrderChecked_State(@Payload OrderChecked orderChecked){

        OrderChecked event = orderChecked;
        System.out.println("\n\n##### listener State : " + orderChecked + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordercanceled'")
    public void wheneverOrdercanceled_State(@Payload Ordercanceled ordercanceled){

        Ordercanceled event = ordercanceled;
        System.out.println("\n\n##### listener State : " + ordercanceled + "\n\n");


        

        // Sample Logic //

        

    }

}


