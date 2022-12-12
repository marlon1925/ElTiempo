public class Time1 {
    int hour; //0-23
    int minute;//0-59
    int second;//0-59

    public Time1(int hour, int minute, int second) {
        if(hour<0||hour>=24||minute < 0 || minute>=60||second<0||second>=60){
         throw new IllegalArgumentException("Usuario por favor ingresar valores dentro de los rangos!!!");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //ejercicio 8.1 318 PAG
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s",((hour==0|| hour == 12) ? 12 : hour % 12),
                minute, second,(hour < 12) ? "AM" : "PM");

    }
}
