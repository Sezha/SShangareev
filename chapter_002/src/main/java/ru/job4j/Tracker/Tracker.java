package ru.job4j.tracker;

import java.util.*;

/**
 * class Tracker.
 * Menu of items.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.0.
 * @since 05/01/2018.
 */
public class Tracker {
    ArrayList<Item> items = new ArrayList<>();
    private int position = 0;
    private static final Random RN = new Random();
    /**
     * Method add.
     * add new item.
     * @param item new item.
     * @return item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(position++, item);
        return item;
    }
    /**
     * Method replace.
     * replace item by id.
     * @param id, item.
     * @return item.
     */
    public void replace(String id, Item item) {
          for (Item element : items) {
              if (element.getId().contains(id)) {
                  items.set(items.indexOf(element), item);
                  break;
              }
          }
    }
    /**
     * Method delete.
     * delete item by id.
     * @param id id of item.
     * @return item.
     */
    public void delete(String id) {
        for (Item element : items) {
            if (element.getId().contains(id)) {
                    items.remove(element);
            }
        }

    }
    /**
     * Method findAll.
     * find all items.
     * @return array of items.
     */
    public ArrayList<Item> findAll() {
        ArrayList<Item> result = new ArrayList<Item>();
        int count =0;
        for (Item element : items) {
                result.add(count, element);
                count++;
            }
        return result;
    }
    /**
     * Method findByName.
     * find item by name.
     * @param key key name.
     * @return arrray of items.
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<Item>();
        int count = 0;
        for (Item element : items) {
            if (element.getName().contains(key)) {
                result.add(count, element);
                count++;
            }
        }
        return result;
    }
    /**
     *  Method findById.
     * find item by Id.
     * @param id id of item.
     * @return item.
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    /**
     * Method generateId.
     * create random Id.
     * @return id.
     */
    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}
