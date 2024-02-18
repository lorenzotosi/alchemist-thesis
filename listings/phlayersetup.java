public class PheromoneLayerImpl<P extends Position2D<P>> implements PheromoneLayer<P> {
      private final Map<P, Double> pheromoneMap;
      ...
      private void setupEnvironment(final int startX, final int startY){
        for (double x = startX; x <= width - Math.abs(startX); x = x + step){
            for (double y = startY; y <= height - Math.abs(startY); y = y + step){
                pheromoneMap.put(environment.makePosition(x, y), 0.0);
            }
        }
    }
      ...
}