package studio.angzai.a10119123_mvp;

public class MainView {
    interface View {
        void setKilometer(String value);
        void setCentimeter(String value);
    }

    interface Presenter {
        void calculateLength(String meter);
    }
}
