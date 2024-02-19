public class Diffuse<T, P extends Position<P> & Position2D<P>> extends AbstractGlobalReaction<T, P> {
    ...
    @Override
    public void action(final PheromoneLayerImpl<P> phLayer) {
        var pheromoneMap = phLayer.getPheromoneMap();
        var nodePositionList = getEnvironment().getNodes()
                                                .stream()
                                                .map(a -> getEnvironment().getPosition(a)).toList();
        nodePositionList.forEach(p -> {
            P patchPos = phLayer.adaptPosition(p);
            Double phValue = pheromoneMap.getOrDefault(nPos, 0.0);
            if (phValue > customDiffusionThreshold)
                getNeighborhood(patchPos).forEach(x -> phLayer.deposit(x, phValue * diffusionValue));
        });
    }
    ...
}
