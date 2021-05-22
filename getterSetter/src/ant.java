public class ant {
    private int size;
    private String food;
    private String color;
    private String role;
    boolean p = false;

    public void setValues(int s, String f, String c, String r) {
        if (s<3 && s>0)
            this.size = s;
        else
            p = true;
        this.food = f;
        this.color = c;
        if (r.toLowerCase() == "worker") {
            this.role = r;
        }
        else {
            p = true;
        }
    }

    public int getSize() {
        if (p==false)
            return this.size;
        else
            return 0;
    }

    public String getColor() {
        if (p==false)
            return this.color;
        else
            return null;
    }

    public String getFood() {
        if (p==false)
            return this.food;
        else
            return null;
    }

    public String getRole() {
        if (p==false)
            return this.role;
        else
            return null;
    }
}
