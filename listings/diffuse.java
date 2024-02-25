public class Diffuse<T, P extends Position<P> & Position2D<P>> extends AbstractGlobalReaction<T, P> {
    ...
    @Override
    public void action(final PheromoneLayerImpl<P> phLayer) {
        Map<P, Double> pheromoneMap = phLayer.getPheromoneMap();
        pheromoneMap.forEach((position, value) -> {
            if (value > customDiffusionThreshold){
                getNeighborhood(position).forEach(x -> phLayer.deposit(x, value * diffusionValue));
            }
        });
    }
    ...
}
