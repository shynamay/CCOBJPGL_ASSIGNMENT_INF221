class MixedBreedDog implements Samoyed, Runnable {
    private final Samoyed samoyed;
    private final Runnable runnable;

    public MixedBreedDog() {
        this.samoyed = new SiberianHusky();
        this.runnable = new AlaskanMalamute();
    }

    @Override
    public void bark() {
        samoyed.bark();
    }

    @Override
    public void run() {
        runnable.run();
    }
}