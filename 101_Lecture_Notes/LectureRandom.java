/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        
    double one = Math.random() * 5;
    System.out.println(one);
    
    System.out.println();
    
    double two = Math.random() * 5 + 15;
    System.out.println(two);
    
    System.out.println();

    double tres = Math.random() * (6767 - 1024) + 1024;
    System.out.println(tres);
    
    System.out.println();
    
    int four = (int)(Math.random() * (42 -(-13)) + (-13));
    System.out.println(four);
    
    int five = (int)(Math.random() * (55 - 30) + 30);
    
    int six = (int)(Math.random() * (105 - 80) + 80);
    
    int seven = (int)Math.random() * five + six;
	}
}
