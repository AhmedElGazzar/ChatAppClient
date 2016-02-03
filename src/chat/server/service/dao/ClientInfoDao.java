/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.server.service.dao;

import chat.server.commons.ClientInform;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


/**
 *
 * @author ElGazzar
 */
public interface ClientInfoDao extends Remote
{
    public boolean validEmail(String email) throws RemoteException;
    public boolean insert(ClientInform c) throws RemoteException;
    public boolean update(ClientInform c) throws RemoteException;
    public boolean delete(ClientInform c) throws RemoteException;
   // public void deleteAll() throws RemoteException;
    public ArrayList selectAll() throws RemoteException;
    public ArrayList findByID(int idSearch) throws RemoteException;
    
}
