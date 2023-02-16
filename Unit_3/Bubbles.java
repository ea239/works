package Unit_3;

public class Bubbles {
    public static void main(String[] arg){
        Sphere[] cloudOfBubbles = new Sphere[50];
        for(int currSphere = 0; currSphere <50; currSphere++){
            cloudOfBubbles[currSphere] = new Sphere(currSphere);
        }

        //print volumes, surface areas and circumference for each sphere
        for(int currSphere = 0; currSphere < 50; currSphere++){
            System.out.println(cloudOfBubbles[currSphere].calcVolume());
            System.out.println(cloudOfBubbles[currSphere].calSurfaceArea());
            System.out.println(cloudOfBubbles[currSphere].calcCircumference());
        }
    }
}
