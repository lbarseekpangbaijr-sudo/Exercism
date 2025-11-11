class NeedForSpeed {
  int speed;
  int batteryDrain;

  NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
  }

  public boolean batteryDrained() {
    throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
  }

  public int distanceDriven(int speed) {
    return speed;
  }

  public void drive(int speed) {
  }

  public static NeedForSpeed nitro() {
    throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
  }
}

class RaceTrack {
  int distance;

  RaceTrack(int distance) {
    this.distance = distance;
  }

  public boolean canFinishRace(NeedForSpeed car) {
    throw new UnsupportedOperationException("Please implement the RaceTrack.canFinishRace() method");
  }
}
