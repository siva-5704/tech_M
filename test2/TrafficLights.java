package test2;

class TrafficLights {
    String color;
    int duration;
 TrafficLights(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
   void changeColor(String newColor) {
        color = newColor;
        System.out.println("Traffic light color changed to: " + color);
    }
    boolean isRed() {
        return color.equals("red");
    }
    boolean isGreen() {
        return color.equals("green");
    }
   int getDuration() {
        return duration;
    }
  void setDuration(int newDuration) {
        duration = newDuration;
        System.out.println("Traffic light duration updated to: " + duration + " seconds");
    }
  public static void main(String[] args) {
        TrafficLights light = new TrafficLights("red", 30);
     if (light.isRed()) {
            System.out.println("The traffic light is red.");
        }
     light.changeColor("green");
        if (light.isGreen()) {
            System.out.println("The traffic light is now green.");
        }
        System.out.println("Current light duration: " + light.getDuration() + " seconds");
      light.setDuration(60);
    }
}
