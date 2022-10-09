package javaBootCamp_3rdWeekWork_YoutubeDemo;

public abstract class BaseCreditManager implements ICreditManager {
    @Override
    public abstract void calculate();

    @Override
      public void save() {
        System.out.println("Kaydedildi");
    }
}
