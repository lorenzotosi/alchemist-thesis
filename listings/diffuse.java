public class Diffuse<T, P extends Position<P> & Position2D<P>> extends AbstractGlobalReaction<T, P> {
    ...
    @Override
    public void action(final PheromoneLayerImpl<P> phLayer) {
        var pheromoneMap = phLayer.getPheromoneMap();
        pheromoneMap.forEach((k, v) -> {
            if (v > customDiffusionThreshold){
                getNeighborhood(k).forEach(x -> phLayer.deposit(x, v * diffusionValue));
            }
        });
    }
    ...
}
