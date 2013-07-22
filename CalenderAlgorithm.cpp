#include <iostream>
#include <stdlib.h>
#include <cstring>
#include <ctime>
#include <cmath>

using namespace std;

/*  Algorithm: Clone of C function ctime() in header <ctime>
    Author:    Munshi Riaz    
*/

char* ctime_clone(time_t *t);

int main( )
{
   // current date/time based on current system
   time_t now = time(0);
   
   // convert now to string form
   char* dt = ctime(&now);

   cout << "No. of seconds elapsed since 1970:" << ctime_clone(&now) <<endl;
   cout << "The local date and time is: " << dt << endl;

   // convert now to tm struct for UTC
   tm *gmtm = gmtime(&now);
   dt = asctime(gmtm);
   cout << "The UTC date and time is:"<< dt << endl;

return 0;
}

char* ctime_clone(time_t *t)
{
    char* time;
    float tim;
    
    float years;
    float days;
    float hours;
    float minutes;
    float seconds;
    
    tim = (*t / (60 * 60 *24 * 365.25));
    
    years = 1970 + floor(tim);    
    
    days    = (tim - trunc(tim))*365.25;    
    hours   = (days - trunc(days))*24;
    minutes = (hours - trunc(hours))*60;
    seconds = (minutes - trunc(minutes))*60;
    
    //seconds = tim*24*60*60*365.25;   // gives total seconds since year
    //minutes = tim*24*60*365.25;      // gives total minutes since year
   // hours   = tim*24*365.25;         // gives total hours since year    
    
    //cout << trunc(seconds) << endl;
    //cout << trunc(minutes) << endl;
    cout << trunc(hours) << ":" << trunc(minutes) << ":" << trunc(seconds) << endl;
    cout << trunc(days) << endl;
    cout << years << endl;      
    return time;
    
}