package com.example.gweb.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.Objects;


public class Image {

    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image entity = (Image) o;
        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getImagePath() {


    File file = new File("src/images");

        //   return getImagePath();
    return file.getPath();

    }
    String filepath = getImagePath();

    Toolkit tk = Toolkit.getDefaultToolkit();
    java.awt.Image image = tk.createImage("images/1200px-Overwatch_(videogioco).jpg");
    final URL url = Image.class.getResource("images/1200px-Overwatch_(videogioco).jpg");

}
