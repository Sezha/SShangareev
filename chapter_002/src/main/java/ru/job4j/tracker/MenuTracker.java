package ru.job4j.tracker;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * class EditItem.
 * external class for method fillActions.
 * @author Sergei Shangangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
class EditItem extends BaseAction {
    public EditItem(int key, String name) {
        super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        String   id = input.ask("Please, enter the task's ID: ");
        String name = input.ask("Please, enter new task's name: ");
        String desc = input.ask("Please, enter new task's description: ");
        long date = System.currentTimeMillis();
        Item item = new Item(name, desc, date);
        item.setId(id);
        tracker.replace(item.getId(), item);
    }
}
/**
 * class MenuTracker.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public class MenuTracker {
    private Input input;
    private Tracker tracker;
    public UserAction[] actions = new UserAction[7];
    int position = 0;
    /**
     * constructor of class MenuTracker.
     * @param input
     * @param tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * method fillActions.
     * structure of menu.
     */
    public void fillActions() {
        this.actions[position++] = this.new AddItem(0, "Add the new item.");
        this.actions[position++] = new MenuTracker.ShowAllItems(1, "Show all items.");
        this.actions[position++] = new EditItem(2, "Edit Item.");
        this.actions[position++] = this.new DeleteItem(3, "Delete Item.");
        this.actions[position++] = this.new FindItemById(4, "Find Item by Id");
        this.actions[position++] = this.new FindItemByName(5, "Find Item by Name");
        this.actions[position++] = this.new Exit(6, "Exit program.");
    }
    public void addAction(UserAction action) {
        this.actions[position++] = action;
    }
    /**
     * method select.
     * @param key
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }
    /**
     * method show.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    /**
     * method AddItem.
     */
    private class AddItem extends BaseAction {
        public AddItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name: ");
            String desc = input.ask("Please, enter the task's description: ");
            long date = System.currentTimeMillis();
            tracker.add(new Item(name, desc, date));
        }
    }
    /**
     * static class ShowAllItems.
     */
    private static class ShowAllItems extends BaseAction {
        public ShowAllItems(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(
                        String.format("%s. %s. %s", item.getId(), item.getName(), item.getDescription())
                );
            }
        }
    }
    /**
     * class DeleteItem.
     */
    private class DeleteItem extends BaseAction {
        public DeleteItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String   id = input.ask("Please, enter the task's ID: ");
            tracker.delete(id);
        }
    }
    /**
     * class FindItemById.
     */
    private class FindItemById extends BaseAction {
        public FindItemById(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String   id = input.ask("Please, enter the task's ID: ");
            System.out.println(
                    String.format("%s. %s. %s", tracker.findById(id).getId(), tracker.findById(id).getName(), tracker.findById(id).getDescription())
            );
        }
    }
    /**
     * class FindItemByName.
     */
    private class FindItemByName extends BaseAction {
        public FindItemByName(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name: ");
            for (Item item : tracker.findAll()) {
                if (item.getName().equals(name)) {
                System.out.println(
                        String.format("%s. %s. %s", item.getId(), item.getName(), item.getDescription())
                );
                }
            }
        }
    }
    /**
     * class Exit.
     */
    private class Exit extends BaseAction {
        public Exit(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
        }
    }
}
