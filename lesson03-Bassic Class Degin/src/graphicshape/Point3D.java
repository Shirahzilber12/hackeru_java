package graphicshape;


public class Point3D extends Point{
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {

        return z;
    }

    @Override
    protected String commaSepareted() {
        return super.commaSepareted()+","+z;
    }
}
