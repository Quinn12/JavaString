package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer WrongCount = 0;
        Integer QuestCount = 0;
        //ask what Gollum's name was
        String A1_0 = "Sméagol";
        String A1_1 = "Smeagol";
//ask what race Gandalf was
        String A2_0 = "Maia";
//ask who was the elven king of the northern mirkwood
        String A3_0 = "Thranduil";
//in what age was the last immortal orcs killed off
        String A4_0 = "First Age";
        String A4_1 = "First";
//what race was Golfimbul
        String A5_0 = "Orc";
//what dwarven king did Azog the goblin kill in moria mines
        String A6_0 = "Thrór";
        String A6_1 = "Thror";
        boolean TestActive = true;
        Scanner sc = new Scanner(System.in);
        do
        {
            if (TestActive)
            {
                System.out.println("What was Gollum's real name?");
                String A1_Input = sc.next();
                if (A1_Input.equalsIgnoreCase(A1_0) || A1_Input.equalsIgnoreCase(A1_1))
                {
                    QuestCount = 1;
                    while ( QuestCount == 1)
                    {
                        System.out.println("What was Gandalf's race?");
                        String A2_Input = sc.next();
                        if (A2_Input.equalsIgnoreCase(A2_0))
                        {
                            QuestCount = 2;
                            while (QuestCount == 2)
                            {
                                System.out.println("Who was the elven king of northern mirkwood?");
                                String A3_Input = sc.next();
                                if (A3_Input.equalsIgnoreCase(A3_0))
                                {
                                    QuestCount = 3;
                                    while (QuestCount == 3)
                                    {
                                        System.out.println("In what age was the last immortal orcs killed off?");
                                        String A4_Input = sc.next();
                                        if (A4_Input.equalsIgnoreCase(A4_0) || A4_Input.equalsIgnoreCase(A4_1))
                                        {
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equals(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                        else if(!A4_0.equalsIgnoreCase(A4_Input) || !A4_1.equalsIgnoreCase(A4_Input)){
                                            WrongCount = 4;
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                    }
                                }
                                else if(!A3_0.equalsIgnoreCase(A3_Input)) {
                                    WrongCount = 3;
                                    QuestCount = 3;
                                    while (QuestCount == 3)
                                    {
                                        System.out.println("In what age was the last immortal orcs killed off?");
                                        String A4_Input = sc.next();
                                        if (A4_Input.equalsIgnoreCase(A4_0) || A4_Input.equalsIgnoreCase(A4_1))
                                        {
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                        else if(!A4_0.equalsIgnoreCase(A4_Input) || !A4_1.equalsIgnoreCase(A4_Input)){
                                            WrongCount = 4;
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                    }

                                }
                            }

                        }
                        else if (!A2_0.equalsIgnoreCase(A2_Input))
                        {
                            WrongCount = 2;
                            QuestCount = 2;
                            while (QuestCount == 2)
                            {
                                System.out.println("Who was the elven king of northern mirkwood?");
                                String A3_Input = sc.next();
                                if (A3_Input.equalsIgnoreCase(A3_0))
                                {
                                    QuestCount = 3;
                                    while (QuestCount == 3)
                                    {
                                        System.out.println("In what age was the last immortal orcs killed off?");
                                        String A4_Input = sc.next();
                                        if (A4_Input.equalsIgnoreCase(A4_0) || A4_Input.equalsIgnoreCase(A4_1))
                                        {
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                        else if(!A4_0.equalsIgnoreCase(A4_Input) || !A4_1.equalsIgnoreCase(A4_Input)){
                                            WrongCount = 4;
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                    }
                                }
                                else if(!A3_0.equalsIgnoreCase(A3_Input)) {
                                    WrongCount = 3;
                                    QuestCount = 3;
                                    while (QuestCount == 3)
                                    {
                                        System.out.println("In what age was the last immortal orcs killed off?");
                                        String A4_Input = sc.next();
                                        if (A4_Input.equalsIgnoreCase(A4_0) || A4_Input.equalsIgnoreCase(A4_1))
                                        {
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                        else if(!A4_0.equalsIgnoreCase(A4_Input) || !A4_1.equalsIgnoreCase(A4_Input)){
                                            WrongCount = 4;
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equals(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                    }

                                }
                            }

                        }
                    }
                }
                else if(!A1_0.equalsIgnoreCase(A1_Input) || !A4_1.equalsIgnoreCase(A1_Input)) {
                    WrongCount = 1;
                    QuestCount = 1;
                    while ( QuestCount == 1)
                    {
                        System.out.println("What was Gandalf's race?");
                        String A2_Input = sc.next();
                        if (A2_Input.equalsIgnoreCase(A2_0))
                        {
                            QuestCount = 2;
                            while (QuestCount == 2)
                            {
                                System.out.println("Who was the elven king of northern mirkwood?");
                                String A3_Input = sc.next();
                                if (A3_Input.equalsIgnoreCase(A3_0))
                                {
                                    QuestCount = 3;
                                    while (QuestCount == 3)
                                    {
                                        System.out.println("In what age was the last immortal orcs killed off?");
                                        String A4_Input = sc.next();
                                        if (A4_Input.equalsIgnoreCase(A4_0) || A4_Input.equalsIgnoreCase(A4_1))
                                        {
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                        else if(!A4_0.equalsIgnoreCase(A4_Input) || !A4_1.equalsIgnoreCase(A4_Input)){
                                            WrongCount = 4;
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                    }
                                }
                                else if(!A3_0.equalsIgnoreCase(A3_Input)) {
                                    WrongCount = 3;
                                    QuestCount = 3;
                                    while (QuestCount == 3)
                                    {
                                        System.out.println("In what age was the last immortal orcs killed off?");
                                        String A4_Input = sc.next();
                                        if (A4_Input.equalsIgnoreCase(A4_0) || A4_Input.equalsIgnoreCase(A4_1))
                                        {
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                               else  if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                        else if(!A4_0.equalsIgnoreCase(A4_Input) || !A4_1.equalsIgnoreCase(A4_Input)){
                                            WrongCount = 4;
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                    }

                                }
                            }

                        }
                        else if (!A2_0.equalsIgnoreCase(A2_Input))
                        {
                            WrongCount = 2;
                            QuestCount = 2;
                            while (QuestCount == 2)
                            {
                                System.out.println("Who was the elven king of northern mirkwood?");
                                String A3_Input = sc.next();
                                if (A3_Input.equalsIgnoreCase(A3_0))
                                {
                                    QuestCount = 3;
                                    while (QuestCount == 3)
                                    {
                                        System.out.println("In what age was the last immortal orcs killed off?");
                                        String A4_Input = sc.next();
                                        if (A4_Input.equalsIgnoreCase(A4_0) || A4_Input.equalsIgnoreCase(A4_1))
                                        {
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                        else if(!A4_0.equalsIgnoreCase(A4_Input) || !A4_1.equalsIgnoreCase(A4_Input)){
                                            WrongCount = 4;
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                    }
                                }
                                else if(!A3_0.equalsIgnoreCase(A3_Input)) {
                                    WrongCount = 3;
                                    QuestCount = 3;
                                    while (QuestCount == 3)
                                    {
                                        System.out.println("In what age was the last immortal orcs killed off?");
                                        String A4_Input = sc.next();
                                        if (A4_Input.equalsIgnoreCase(A4_0) || A4_Input.equalsIgnoreCase(A4_1))
                                        {
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                        else if(!A4_0.equalsIgnoreCase(A4_Input) || !A4_1.equalsIgnoreCase(A4_Input)){
                                            WrongCount = 4;
                                            QuestCount = 4;
                                            while (QuestCount == 4)
                                            {
                                                System.out.println("What race was Golfimbul?");
                                                String A5_Input = sc.next();
                                                if (A5_Input.equalsIgnoreCase(A5_0))
                                                {
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }
                                                }
                                                else if (!A5_0.equalsIgnoreCase(A5_Input))
                                                {
                                                    WrongCount = 5;
                                                    QuestCount = 5;
                                                    System.out.println("What dwarven king did Azog the goblin kill in Moria mines?");
                                                    String A6_Input = sc.next();
                                                    if (A6_Input.equalsIgnoreCase(A6_0) || A6_Input.equalsIgnoreCase(A6_1))
                                                    {
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;
                                                    }
                                                    else if (!A6_0.equalsIgnoreCase(A6_Input) || !A6_1.equalsIgnoreCase(A6_Input))
                                                    {
                                                        WrongCount = 6;
                                                        QuestCount = 6;
                                                        System.out.println("You got " + WrongCount + " wrong out of 6." );
                                                        System.out.println("Correct answer for question 1: " + A1_0 + "| your answer: " + A1_Input);
                                                        System.out.println("Correct answer for question 2: " + A2_0 + "| your answer: " + A2_Input);
                                                        System.out.println("Correct answer for question 3: " + A3_0 + "| your answer: " + A3_Input);
                                                        System.out.println("Correct answer for question 4: " + A4_0 + "| your answer: " + A4_Input);
                                                        System.out.println("Correct answer for question 5: " + A5_0 + "| your answer: " + A5_Input);
                                                        System.out.println("Correct answer for question 6: " + A6_0 + "| your answer: " + A6_Input);
                                                        TestActive = false;

                                                    }

                                                }

                                            }
                                        }
                                    }

                                }
                            }

                        }
                    }
                }
            }
        }while (TestActive);
    }
}
