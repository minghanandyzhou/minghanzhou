#include<iostream>
using namespace std;

//User input
void initializeArrays(string names[], int wins[], int size)
{
  for(int i=0; i<size; i++)
  {
    cout << "Enter team #" << i+1 << ":";
    cin >> names[i];
    cout << "Enter the wins for team #" << i+1 << ":";
    cin >> wins[i];
  }
}

//These functions sort both array and display them on the screen
void sortData(string names[], int wins[], int size)
{
  bool swapped;
  do
  {
    swapped = false;
    int lowestValue;
    for(int i=0; i<size-1; i++)
    {
      lowestValue = wins[i];
      for(int j=i+1; j<size; j++)
      {
        if(wins[j]<lowestValue)
        {
          int temp;
          temp = wins[i];
          wins[i] = wins[j];
          wins[j] = temp;

          string stringtemp;
          stringtemp = names[i];
          names[i] = names[j];
          names[j]= stringtemp;
          swapped = true;
       }
      }
    }
   }while(swapped);
}

void displayData(string names[], int wins[], int size)
{
  cout << "League Standings:" << endl;
  for(int j=size-1; j>=0; j--)
  {
    cout << names[j] << ":" << wins[j] << endl;
  }
}

int main()
{
  const int size = 5;
  string names[size];
  int wins[size];
  initializeArrays(names,wins,size);
  sortData(names,wins,size);
  displayData(names,wins,size);
  return 0;
}
