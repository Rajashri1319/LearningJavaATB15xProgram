package Coding_Interview_Questions;

//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

public class Grade_Calculator
{
    static void main(String[] args)
    {
        int score = 87;
        char grade;

        if( score >=90 && score <=100)
        {
            grade='A';
        }
        else if(score >=80 && score<89)
        {
           grade='B';
        }
        else if(score>=70 && score<79)
        {
           grade='C';
        }
        else if(score>=60 && score<69)
        {
            grade='D';
        }
        else
        {
            grade='F';
        }
        System.out.println("Your grade is :"+ grade);
        }
    }

