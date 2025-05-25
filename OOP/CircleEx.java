package OOP;

// RUNNING

class MyCircle
{
    // DATA MEMBERS
    private float radius, area, perimeter;

    // setters
    public void setRadius(float r)
    {
        radius = r; // simple c++
    }
    public void setArea(float a1)
    {
         area = a1;
    }
    public void setPerimeter(float p1)
    {
        perimeter = p1;
    }

    // getters
    public float getArea()
    {
        float a = 3.142f * radius * radius; // float value deni parti hai yaar

        if (area == a)
        {
            return area;
        }
        else
        {
            System.out.println(" Calculated Area : " + a);
            return -1;
        }
    }

    public float getPerimeter()
    {
        float p = 3.142f * 2f * radius; // perimeter

        if (perimeter == p)
        {
            return perimeter;
        }
        else
        {
            System.out.println(" Calculated Perimeter : " + p);
            return -1;
        }
    }

}

// MAIN CLASS
public class CircleEx
{
    public static void main(String[] args)
    {
        MyCircle c = new MyCircle(); // object made

        // setting values
        c.setRadius(5.0f);
        c.setArea(78.55f);
        c.setPerimeter(31.42f);


        // AREA VALIDATION
        if (c.getArea() != -1)
        {
            System.out.println(" AREA : " + c.getArea());
        }
        else
        {
            System.out.println(" Area value you Gave doesn't match with radius! ");
        }

        // PERIMETER validation
        if (c.getPerimeter() != -1)
        {
            System.out.println(" PERIMETER : " + c.getPerimeter());
        }
        else
        {
            System.out.println(" Perimeter value you Gave doesn't match with radius! ");
        }

    }
}
