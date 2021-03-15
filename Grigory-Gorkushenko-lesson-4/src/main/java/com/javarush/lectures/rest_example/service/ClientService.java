package com.javarush.lectures.rest_example.service;

import java.util.List;

import com.javarush.lectures.rest_example.model.Client;

public interface ClientService {

	// Create new client
   void create(Client client);

   // Returns a list of all available clients
   List<Client> readAll();

   // Returns the client by its ID
   Client read(int id);

   // Updates the client with the specified ID, TRUE if the data was updated, otherwise FALSE

   boolean update(Client client, int id);

   // Deletes a client
   boolean delete(int id);
}