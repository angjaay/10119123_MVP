package studio.angzai.a10119123_mvp;

public class MainPresenter implements MainView.Presenter {

    private MainView.View view;
    private Meter model;

    public MainPresenter(MainView.View view) {
        this.view = view;
        this.model = Meter.getInstance();
    }

    @Override
    public void calculateLength(String meter) {
        if (meter.isEmpty())
            meter = "0";

        double parsedMeter = Double.parseDouble(meter);
        model.setMeter(parsedMeter);

        model.toCentimeter();
        model.toKilometer();
    }
}