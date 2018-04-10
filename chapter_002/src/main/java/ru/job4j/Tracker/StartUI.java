package ru.job4j.tracker;
import java.util.Arrays;
import java.util.Date;
/**
 * class StartUI.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public class StartUI {
    /**
     * Constant of menu for adding new item.
     */
    private static final String ADD = "0";
    /**
     * Constant of menu for showing all items.
     */
    private static final String SHOWALL = "1";
    /**
     * Constant of menu for editing item.
     */
    private static final String EDIT = "2";
    /**
     * Constant of menu for deleting new item.
     */
    private static final String DELETE = "3";
    /**
     * Constant of menu for searching item by id.
     */
    private static final String FINDBYID = "4";
    /**
     * Constant of menu for searching item by name.
     */
    private static final String FINDBYNAME = "5";
    /**
     * Constant of menu for exit from cycle.
     */
    private static final String EXIT = "6";
    /**
     * Getting data from users.
     */
    private final Input input;
    /**
     * Storage of items.
     */
    private final Tracker tracker;

    /**
     * Constructor initializing fields.
     * @param input input data;
     * @param tracker storage of items.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * The main program.
     */
    public void init() {
    boolean exit = false;
        while (!exit) {
             this.showMenu();
             String answer = this.input.ask("Please input menu point: ");
             if (ADD.equals(answer)) {
                 this.createItem();
             } else if (SHOWALL.equals(answer)) {
                 this.showAll();
             } else if (EDIT.equals(answer)) {
                 this.editItem();
             } else if (DELETE.equals(answer)) {
                 this.deleteItem();
             } else if (FINDBYID.equals(answer)) {
                 this.findById();
             } else if (FINDBYNAME.equals(answer)) {
                 this.findByName();
             } else if (EXIT.equals(answer)) {
                 exit = true;
             }
        }
    }
    /**
     * Method createItem.
     */
    private void createItem() {
        System.out.println("----------- Adding new item ------------");
        String name = this.input.ask("Input name of item: ");
        String description = this.input.ask("Input description: ");
        long date = System.currentTimeMillis();
        Item item = new Item(name, description, date);
        this.tracker.add(item);
        System.out.println("------------ New item with getId : " + item.getId() + "-----------");
    }
    /**
     * Method showAll.0
     */
    private void showAll() {
        System.out.println("----------- List of items ------------");
        for (int i = 0; i != this.tracker.findAll().length; i++) {
            System.out.println(this.tracker.findAll()[i] + "; Name: "
                    + this.tracker.findAll()[i].getName() + "; Description: "
                    + this.tracker.findAll()[i].getDescription() + "; ID: "
                    + this.tracker.findAll()[i].getId());
        }
        System.out.println("----------- The end of list -----------");
    }
    /**
     * Method editItem.
     */
    private void editItem() {
        System.out.println("----------- Editing item ------------");
        String nameId = this.input.ask("Input Id of item: ");
        System.out.println("--Item with getId : " + this.tracker.findById(nameId) + "----");
        System.out.println("----------- Adding new information ------------");
        String name = this.input.ask("Input name of item: ");
        String description = this.input.ask("Input description: ");
        long date = System.currentTimeMillis();
        Item item = new Item(name, description, date);
        this.tracker.replace(nameId, item);
        System.out.println("------------ New item with getId : " + item.getId() + "-----------");
    }
    /**
     * Method deleteItem.
     */
    private void deleteItem() {
        System.out.println("----------- Deleting item ------------");
        String nameId = this.input.ask("Input Id of item: ");
        this.tracker.delete(nameId);
        System.out.println("--Item with Id : " + nameId + " is deleted----");
    }
    /**
     * Method findById.
     */
    private void findById() {
        System.out.println("----------- Finding item by Id ------------");
        String nameId = this.input.ask("Input Id of item: ");
        System.out.println("--Item with Id : " + this.tracker.findById(nameId) + "----");
    }
    /**
     * Method findByName.
     */
    private void findByName() {
        System.out.println("----------- Finding item by name ------------");
        String name = this.input.ask("Input name of item: ");
        System.out.println("--Items : " + this.tracker.findByName(name) + "----");
    }
    /**
     * Method showMenu.
     */
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select");
    }
    /**
     * Main method main.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
