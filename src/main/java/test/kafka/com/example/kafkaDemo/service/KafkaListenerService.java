package test.kafka.com.example.kafkaDemo.service;



import lombok.extern.log4j.Log4j2;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;
import test.kafka.com.example.kafkaDemo.binder.KafkaListenerBinding;

@Service
@Log4j2
@EnableBinding(KafkaListenerBinding.class)
public class KafkaListenerService {

    @StreamListener("input-channel-1")
    public void process(KStream<String, String> input){
        input.foreach((k,v) -> log.info(String.format("Key: %s, Value: %s", k,v)));

    }
}
