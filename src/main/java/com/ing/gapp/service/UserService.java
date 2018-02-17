package com.ing.gapp.service;

import com.ing.gapp.entity.User;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService {
    private static UserService instance;
    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

    private Map<Integer, User> users = new HashMap<>();
    private int nextId = 0;

    /**
     * @return a reference to an example facade for UserService objects.
     */
    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
            instance.ensureTestData();
        }
        return instance;
    }

    /**
     * @return all available User objects.
     */
    public synchronized List<User> findAll() {
        return findAll(null);
    }

    /**
     * Finds all User's that match given filter.
     *
     * @param stringFilter
     *            filter that returned objects should match or null/empty string
     *            if all objects should be returned.
     * @return list a User objects
     */
    public synchronized List<User> findAll(String stringFilter) {
        ArrayList<User> arrayList = new ArrayList<>();
        for (User user : users.values()) {
            try {
                boolean passesFilter = (stringFilter == null || stringFilter.isEmpty())
                        || user.toString().toLowerCase().contains(stringFilter.toLowerCase());
                if (passesFilter) {
                    arrayList.add(user.clone());
                }
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Collections.sort(arrayList, (o1, o2) -> (int) (o2.getId() - o1.getId()));
        return arrayList;
    }

    /**
     * Finds all User's that match given filter and limits the resultset.
     *
     * @param stringFilter
     *            filter that returned objects should match or null/empty string
     *            if all objects should be returned.
     * @param start
     *            the index of first result
     * @param maxResults
     *            maximum result count
     * @return list a User objects
     */
    public synchronized List<User> findAll(String stringFilter, int start, int maxResults) {
        ArrayList<User> arrayList = new ArrayList<>();
        for (User user : users.values()) {
            try {
                boolean passesFilter = (stringFilter == null || stringFilter.isEmpty())
                        || user.toString().toLowerCase().contains(stringFilter.toLowerCase());
                if (passesFilter) {
                    arrayList.add(user.clone());
                }
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Collections.sort(arrayList, (o1, o2) -> (int) (o2.getId() - o1.getId()));
        int end = start + maxResults;
        if (end > arrayList.size()) {
            end = arrayList.size();
        }
        return arrayList.subList(start, end);
    }

    /**
     * @return the amount of all user in the system
     */
    public synchronized long count() {
        return users.size();
    }

    /**
     * Deletes a user from a system
     *
     * @param value
     *            the User to be deleted
     */
    public synchronized void delete(User value) {
        users.remove(value.getId());
    }

    /**
     * Persists or updates User in the system. Also assigns an identifier
     * for new User instances.
     *
     * @param entry
     */
    public synchronized void save(User entry) {
        if (entry == null) {
            LOGGER.log(Level.SEVERE,
                    "User is null. Are you sure you have connected your form to the application as described in tutorial chapter 7?");
            return;
        }
        if (entry.getId() == null) {
            entry.setId(nextId++);
        }
        try {
            entry = (User) entry.clone();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        users.put(entry.getId(), entry);
    }

    /**
     * Sample data generation
     */
    public void ensureTestData() {
        if (findAll().isEmpty()) {
            final String[] names = new String[] { "Gabrielle Patel", "Brian Robinson", "Eduardo Haugen",
                    "Koen Johansen", "Alejandro Macdonald", "Angel Karlsson", "Yahir Gustavsson", "Haiden Svensson",
                    "Emily Stewart", "Corinne Davis", "Ryann Davis", "Yurem Jackson", "Kelly Gustavsson",
                    "Eileen Walker", "Katelyn Martin", "Israel Carlsson", "Quinn Hansson", "Makena Smith",
                    "Danielle Watson", "Leland Harris", "Gunner Karlsen", "Jamar Olsson", "Lara Martin",
                    "Ann Andersson", "Remington Andersson", "Rene Carlsson", "Elvis Olsen", "Solomon Olsen",
                    "Jaydan Jackson", "Bernard Nilsen" };
            for (int i = 0; i < names.length; i++) {
                String name = names[i];
                User user = new User();
                user.setId(i);
                user.setName(name);
                user.setVersion(0);
                save(user);
            }
        }
    }
}
