class Rectangle{ 
    int width; 
    int height; 

    Rectangle(int width, int height){ 
        this.width = width; 
        this.height = height; 
    } 
    public int printarea(){ 
       return height * width;  
    } 
    public int perimeter(){ 
        return 2 * (height + width); 
    }
}

public class Q2 {
    public static void main(String[] args) {
       Rectangle r1 = new Rectangle(20, 10); 
       System.out.println("Perimeter of Rectangle is : " + r1.perimeter()); 
       System.out.println("Area of Rectangle is : " + r1.printarea()); 
    }
}
