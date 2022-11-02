enum Meal {
    BREAKFAST,
    LUNCH,
    DINNER
}

public class MealCard {
    private int points;
    static final int DEFAULT_POINTS = 100;
    // codigo em falta   
    MealCard(int points){
        this.points = points;
    }

    MealCard(){
        this(DEFAULT_POINTS);
    }

    public int getPoints(){
        return this.points;
    }

    public void setPoints(int points){
        this.points = points;
    }

    int cost(Meal m){
        switch(m){
            case BREAKFAST:
                            return 50;
            case LUNCH:
                            return 75;
            case DINNER:
                            return 100;
            default:
                            return 0;
        }
    }
    
    public boolean buy(int cost){
        if(this.points >= cost){
            this.points -= cost;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean buy(Meal m){
        if(buy(cost(m))){
            return true;
        }
        else{
            return false;
        }

    }
}
