package thu.dev.data.dao.model;

import java.util.List;
import thu.dev.data.dao.DatabaseDao;

public class Category {

    private int id;
    private String name;
    private String image;

    public static List<Category> all() {
        return DatabaseDao.getInstance().getCategoryDao().all();
    }

    public Category(String name, String image) {
        super();
        this.name = name;
        this.image = image;
    }

    public Category(int id, String name, String image) {
        super();
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public Category(String name, String description, String img) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDesc(String desc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
