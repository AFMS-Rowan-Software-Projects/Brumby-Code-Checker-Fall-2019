//Jeffrey Podwats
//TR 9:00am
// Lab Excercise one part 2

/*
    This program will convert the number of quarters, dimes, nickels, 
    and pennies you have into the monetary value of the coins in cents.
*/

#include <iostream>
using namespace std;

int main()
{
    //Set up memory
    int quarters;
    int dimes;
    int nickels;
    int pennies;
    int cents;
    const int CENTS_PER_QUARTER = 25;
    const int CENTS_PER_DIME = 10;
    const int CENTS_PER_NICKEL = 5;
    const int CENTS_PER_PENNY = 1;

    //Ask all the questions and read in answers
    cout << "Enter number of quarters: ";
    cin >> quarters;

    cout << "Enter number of dimes: ";
    cin >> dimes;

    cout << "Enter number of nickels: ";
    cin >> nickels;

    cout << "Enter number of pennies: ";
    cin >> pennies;

    //Do the calculations
    cents = (quarters * CENTS_PER_QUARTER) + (dimes * CENTS_PER_DIME) + (nickels *CENTS_PER_NICKEL) + (pennies * CENTS_PER_PENNY);

    //Print results
    cout << "\n\nYou have a total of "
         << cents
         << " cents.\n";


    return 0;
}