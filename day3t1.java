class if_else_statments
{
    public static void main(String[] args) 
        {
    int score = 85;
    if(score >=90)
        System.out.println("Grade: A");
    else if(score >=80 && score <90)
        System.out.println("Grade: B");
    else if(score >=70 && score <80)
        System.out.println("Grade: c");
    else if(score >=60 && score <70)
        System.out.println("Grade: D");
    else if(score >=50 && score <60)
        System.out.println("Grade: E");
    else
        System.out.println("FAIL");

}
    }