/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat15i1;

import org.codehaus.jackson.map.ObjectMapper;


public class MyMessage {
     public String sender;
    public String receiver;
    public String type;
    public String content;
    
    public static void main(String[] argv){
        MyMessage m1 = new MyMessage();
        ObjectMapper mapper = new ObjectMapper();
        try{
            String jsonString = mapper.writeValueAsString(m1);
            System.out.println(jsonString);
            MyMessage m1r = mapper.readValue(jsonString, MyMessage.class);
            System.out.println("sender: " + m1r.sender);
            System.out.println("receiver: " + m1r.receiver);
            System.out.println("type: " + m1r.type);
            System.out.println("content: " + m1r.content);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
