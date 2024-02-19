public class Deposit<T, P extends Position<P> & Position2D<P>> extends AbstractGlobalReaction<T, P> {
    ...
    @Override
    public void action(final PheromoneLayerImpl<P> phLayer) {
        final Environment<T, P> environment = this.getEnvironment();

        for (var node : this.nodeList) {
            P pos = environment.getPosition(node);
            phLayer.deposit(pos, pheromoneDepositValue);
        }
    }
    ...
}
