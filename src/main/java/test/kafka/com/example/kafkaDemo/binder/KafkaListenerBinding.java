package test.kafka.com.example.kafkaDemo.binder;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public interface KafkaListenerBinding {

    @Input("input-channel-1")
    KStream<String, String> inputStream();





}
