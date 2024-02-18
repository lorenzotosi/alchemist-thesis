public class PheromoneLayerImpl<P extends Position2D<P>> implements PheromoneLayer<P> {
    ...
    @Override
    public void deposit(final P p, final Double value){
        var mapPosition = adaptPosition(p);
        if(pheromoneMap.containsKey(mapPosition))
            pheromoneMap.put(mapPosition, (value + pheromoneMap.get(mapPosition)));
    }

    @Override
    public void evaporate(final P p, final Double value){
        if(pheromoneMap.containsKey(p))
            pheromoneMap.put(p, value>= 0 ? value : 0.0);
    }
    ...
}