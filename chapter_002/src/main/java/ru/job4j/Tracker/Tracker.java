package ru.job4j.tracker;

import java.util.*;


/**
 * class Tracker.
 * Menu of items.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();
    /**
     * Method add.
     * add new item.
     * @param item.
     * @return item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }
    /**
     * Method replace.
     * replace item by id.
     * @param id, item.
     * @return item.
     */
    public void replace(String id, Item item) {
          for (int index = 0; index != this.position; index++) {
            if (items[index].getId().equals(id)) {
                item.setId(items[index].getId());
                items[index] = item;
                break;
            }
          }
    }
    /**
     * Method delete.
     * delete item by id.
     * @param id.
     * @return item.
     */
    public void delete(String id) {
        int index = 0;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                System.arraycopy(items, index + 1, items, index, (items.length - 1 - index));
                break;
            } else {
                items[index] = item;
                index++;
            }
        }
    }
    /**
     * Method findAll.
     * find all items.
     * @return array of items.
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
                result[index] = this.items[index];
        }
        return result;
    }
    /**
     * Method findByName.
     * find item by name.
     * @param key.
     * @return arrray of items.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int count = 0;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[count] = this.items[index];
                count++;
            }
        }
        return result;
    }
    /**
     *  Method findById.
     * find item by Id.
     * @param id.
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
