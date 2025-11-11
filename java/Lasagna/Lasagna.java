public class Lasagna {
  public int expectedMinutesInOven() {
    return 40;
  }

  public int remainingMinutesInOven(int timeSpentInOven) {
    return 40 - timeSpentInOven;
  }

  public int preparationTimeInMinutes(int layersOfLasagna) {
    return 2 * layersOfLasagna;
  }

  public int totalTimeInMinutes(int lasagnaLayers, int timeSpentInOven) {
    int totalPreparationTime = new Lasagna().preparationTimeInMinutes(lasagnaLayers);
    return totalPreparationTime + timeSpentInOven;
  }

}
