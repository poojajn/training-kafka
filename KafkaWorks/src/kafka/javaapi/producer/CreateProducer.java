//package kafka.javaapi.producer;
//
//import java.util.List;
//import java.util.Properties;
//
//import org.apache.kafka.clients.producer.Callback;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.Producer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.apache.kafka.clients.producer.RecordMetadata;
//import org.apache.kafka.common.serialization.StringSerializer;
//
//
//
//
//
//public class CreateProducer {
//
//	public static void main(String[] args) {
//
//		
//		  private  String topic;
//		 // private IUserService userService;
//		  
//		Properties properties=new Properties();
//		
//		properties.setProperty("bootstrap.servers", "localhost:9092");
//		
//		
//		properties.setProperty("key.serializer",StringSerializer.class.getName());
//		
//		properties.setProperty("value.serializer",StringSerializer.class.getName());
//		
//		//for ack,retries etc
//		
//		properties.setProperty("acks", "1");
//		properties.setProperty("retries", "3");
//		
//		properties.setProperty("partitioner.class","kafka.javaapi.producer.Employee");
//		
//		
//		Producer<String, String> producer=new KafkaProducer<String, String>(properties);
//		
//		//List<String> users = userService.findAllUsers();
//	    for (String user : users) {
//
//	      String msg = "Hello " + user;
//	      producer.send(new ProducerRecord<String, String>( topic, user, msg), new Callback() {
//	        public void onCompletion(RecordMetadata metadata, Exception e) {
//	          if (e != null) {
//	            e.printStackTrace();
//	          }
//	          System.out
//	              .println("Sent:" + msg + ", User: " + user + ", Partition: " + metadata.partition());
//	        }
//	      });
//		
//		}
//		producer.flush();
//		producer.close();
//		
//		System.out.println("Message Sent........  ");
//		
//	}
//
//}
