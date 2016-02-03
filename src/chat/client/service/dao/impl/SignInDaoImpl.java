/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.client.service.dao.impl;

import chat.client.service.dao.SignInDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ElGazzar
 */
public class SignInDaoImpl extends UnicastRemoteObject implements SignInDao
{

    SignInDaoImpl() throws RemoteException
    {
        
    }
    @Override
    public void recieve() {
        System.out.println("recieve test");
    }
    
}
