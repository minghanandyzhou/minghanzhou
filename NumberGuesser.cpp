#include <iostream>
using namespace std;

int getMidpoint(int low, int high)
{
  low = 1;
  high = 100;
  int guess = (high+low)/2;
  return guess;
}

char getUserResponseToGuess(int guess)
{
  int low,high;
  char answer;
  guess = getMidpoint(low,high);
  do
    {
      cout << "Is it "<< guess << "?  (h/l/c): ";
      cin >> answer;
      if(answer == 'l')
      {
        guess = guess-(guess/2);
      }
      else if(answer == 'h')
      {

        guess = guess+(guess/2);
      }
      else
      {
        break;
      }
    }while(answer != 'c');
}

bool shouldPlayAgain()
{
  char again;

  cout << "Great! Do you want to play again? (y/n): ";
  cin >> again;

  if (again == 'y')
  {
    return true;
  }
  else
  {
    return false;
  }
}

void playOneGame()
{
  int guess;
  cout << "Think of a number between 1 and 100." << endl;
  getUserResponseToGuess(guess);
}

int main()
{
  do
  {
    playOneGame();
  }while (shouldPlayAgain());
  return 0;
}
