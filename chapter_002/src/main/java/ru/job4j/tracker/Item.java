package ru.job4j.tracker;

/**
 * class Item.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.1.
 */
public class Item {
    private String id;
    public String name;
    public String description;
    public long create;
    public Item() {
    }
		public Item(String name, String description, long create) {
            this.name = name;
            this.description = description;
            this.create = create;
        }
    /*
     * Method getName.
     * @return name.
     */
    public String getName() {
        return this.name;
    }
    /*
     * Method getDescription.
     * @return description.
     */
    public String getDescription() {
        return this.description;
    }
    /*
     * Method getCreate.
     * @return create.
     */
    public long getCreate() {
        return this.create;
    }
    /*
     * Method getId.
     * @return id.
     */
    public String getId() {
        return this.id;
    }
    /*
     * Method setId.
     * @return id.
     */
    public void setId(String id) {
        this.id = id;
    }
}