package Geometric;

import java.util.Date;

public class GeometricObject {

    protected String colorname;
    protected boolean filled;
    protected Date date;


    public GeometricObject(String colorname, boolean filled, Date date) {
        this.colorname = colorname;
        this.filled = filled;
        this.date = date;
    }

    public String getColorname() {
        return colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Geometric.GeometricObject{" +
                "colorname='" + colorname + '\'' +
                ", filled=" + filled +
                ", date=" + date +
                '}';
    }
}
