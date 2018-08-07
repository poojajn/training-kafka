package kafka.javaapi.day2;

public class ConsumerClient {

	public static void main(String[] args) {
		 Consumer consumer=new Consumer(KafkaProperties.TOPIC1, false);
		 
		 consumer.start();

	}

}
