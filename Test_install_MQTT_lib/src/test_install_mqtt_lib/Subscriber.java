package test_install_mqtt_lib;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

//import java.net.URI;
//import java.net.URISyntaxException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gm
 */

public class Subscriber implements MqttCallback{

    private String topic = "test";
    private MqttClient client;
    private String content = "Message from MqttPublishSample";
    private int qos = 2;
    private String broker = "tcp://mqtt.gmtech.co.th:1883";
    private String clientId = "CallBack";
    private String USERNAME = "OOP_Exploding_Meme";
    private String PASSWORD = "ZjFjfNv.VZ-bKh2";

  
    public Subscriber() throws MqttException {
        
        MqttConnectOptions conOpt = setUpConnectionOptions(USERNAME, PASSWORD);

        this.client = new MqttClient(broker, clientId, new MemoryPersistence());
        this.client.setCallback(this);
        this.client.connect(conOpt);

        this.client.subscribe(this.topic, qos);
    }


    public void sendMessage(String payload) throws MqttException {
        MqttMessage message = new MqttMessage(payload.getBytes());
        message.setQos(qos);
        this.client.publish(this.topic, message); // Blocking publish
    }
    
    private static MqttConnectOptions setUpConnectionOptions(String username, String password) {
       MqttConnectOptions connOpts = new MqttConnectOptions();
       connOpts.setCleanSession(true);
       connOpts.setUserName(username);
       connOpts.setPassword(password.toCharArray());
       return connOpts;
   } 

    /**
     * @see MqttCallback#connectionLost(Throwable)
     */
    public void connectionLost(Throwable cause) {
        System.out.println("Connection lost because: " + cause);
        System.exit(1);
    }

    /**
     * @see MqttCallback#deliveryComplete(IMqttDeliveryToken)
     */
    public void deliveryComplete(IMqttDeliveryToken token) {
    }

    /**
     * @see MqttCallback#messageArrived(String, MqttMessage)
     */
    public void messageArrived(String topic, MqttMessage message) throws MqttException {
        System.out.println(String.format("[%s] %s", topic, new String(message.getPayload())));
    }
    
}
