/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_install_mqtt_lib;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
/**
 *
 * @author Gm
 */
public class Test_install_MQTT_lib{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String topic        = "test";
        String content      = "Message from MqttPublishSample";
        int qos             = 2;
        String broker       = "tcp://mqtt.gmtech.co.th:1883";
        String clientId     = "JavaSample";
        String USERNAME     = "OOP_Exploding_Meme";
        String PASSWORD     = "ZjFjfNv.VZ-bKh2";
        MemoryPersistence persistence = new MemoryPersistence();
        try {
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = setUpConnectionOptions(USERNAME, PASSWORD);
            //connOpts.setCleanSession(true);
            System.out.println("Connecting to broker: "+broker);
            sampleClient.connect(connOpts);
            System.out.println("Connected");
            System.out.println("Publishing message: "+content);
            Subscriber s = new Subscriber();
            while (true) {
                MqttMessage message = new MqttMessage(content.getBytes());
                message.setQos(qos);
                sampleClient.publish(topic, message);
                System.out.println("Message published");
            
            }
//            sampleClient.disconnect();
//            System.out.println("Disconnected");
//            System.exit(0);
        } catch(MqttException me) {
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
        }
        
    }
    
    private static MqttConnectOptions setUpConnectionOptions(String username, String password) {
       MqttConnectOptions connOpts = new MqttConnectOptions();
       connOpts.setCleanSession(true);
       connOpts.setUserName(username);
       connOpts.setPassword(password.toCharArray());
       return connOpts;
   }  
    
}
