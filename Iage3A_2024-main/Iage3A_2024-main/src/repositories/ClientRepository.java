package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Client;

public class ClientRepository {
      List<Client> tClients=new ArrayList<>();
      public void insert(Client client){
        tClients.add(client);
      }

      public List<Client> selectAll(){
        return tClients;
      }
      public  Client selectByTelephone(String telephone){
        //select * from agence where numero=numero
        for (Client client : tClients) {
             if (client.getTelephone().compareTo(telephone)==0) {
                return client;
             } 
        }
         return null;
     }
    }
