class Time {
    int hours;
    int minutes;

    
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        normalize();
    }

    
    private void normalize() {
        hours += minutes / 60;
        minutes = minutes % 60;
    }

   
    public Time add(Time t) {
        return new Time(this.hours + t.hours, this.minutes + t.minutes);
    }

    
    public Time subtract(Time t) {
        int totalMinutes1 = this.hours * 60 + this.minutes;
        int totalMinutes2 = t.hours * 60 + t.minutes;
        int diffMinutes = totalMinutes1 - totalMinutes2;
        return new Time(diffMinutes / 60, diffMinutes % 60);
    }

    
    public void display() {
        System.out.println(hours + "h " + minutes + "m");
    }

    public static void main(String[] args) {
        Time t1 = new Time(2, 75); 
        Time t2 = new Time(1, 50);

        System.out.print("Time 1: ");
        t1.display();
        System.out.print("Time 2: ");
        t2.display();

        Time sum = t1.add(t2);
        System.out.print("Sum: ");
        sum.display();

        Time diff = t1.subtract(t2);
        System.out.print("Difference: ");
        diff.display();
    }
}
