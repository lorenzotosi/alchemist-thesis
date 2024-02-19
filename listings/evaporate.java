public class Evaporate<T, P extends Position<P> & Position2D<P>> extends AbstractGlobalReaction<T, P> {
    ...
    @Override
    public void action(final PheromoneLayerImpl<P> phLayer) {
        Map<P, Double> pheromoneMap = phLayer.getPheromoneMap();
        pheromoneMap.forEach((key, value) -> {
            if (value > 0) {
                phLayer.evaporate(key, value * evaporationValue);
            }
        });
    }
    ...
}
