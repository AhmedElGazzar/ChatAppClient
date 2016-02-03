/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.client.facade.controller;

import chat.server.commons.ClientInform;
import chat.server.service.dao.ClientInfoDao;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author ElGazzar
 */
public class ChatAppClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1",1111);
        
            
            ClientInform e = new ClientInform();
            ClientInfoDao re = (ClientInfoDao) reg.lookup("Service");
            
          //re.insert(e);
            System.out.println("Client Done.....");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
